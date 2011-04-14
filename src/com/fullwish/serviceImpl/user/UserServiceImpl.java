package com.fullwish.serviceImpl.user;

import java.io.Serializable;

import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fullwish.bean.entity.User;
import com.fullwish.service.base.DaoSupport;
import com.fullwish.service.user.UserService;
import com.fullwish.utils.MD5;

@Service
@Transactional
public class UserServiceImpl extends DaoSupport<User> implements UserService {
    // public void updatePassword(String user_google, String newpassword){
    // em.createQuery("update user o set o.password=?1 where o.user_google=?2")
    // .setParameter(1, MD5.MD5Encode(newpassword)).setParameter(2,
    // user_google).executeUpdate();
    // }
    @Override
    public void save(User entity) {
        entity.setUser_password(MD5.MD5Encode(entity.getUser_password()));
        super.save(entity);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public boolean exsit(String user_google) {
        long count = (Long) em.createQuery(
                "select count(o) from user o where o.user_google=?1")
                .setParameter(1, user_google).getSingleResult();
        return count > 0;
    }

    public boolean checkUser(String user_email, String user_password) {
        // System.out.println("CHECKUSER MD5
        // PASSWORD"+MD5.MD5Encode(user_password));
        long count = (Long) em
                .createQuery(
                        "select count(o) from User o where o.user_email=?1 and o.user_password=?2")
                // user±íÒª´óÐ´
                .setParameter(1, user_email).setParameter(2, MD5.MD5Encode(user_password))
                .getSingleResult();
        // System.out.println("check over");
        return count > 0;
    }

    /*
     * public boolean checkUser(String username, String password){ long count =
     * (Long)em.createQuery("select count(o) from Buyer o where o.username=?1
     * and o.password=?2") .setParameter(1, username).setParameter(2,
     * MD5.MD5Encode(password)).getSingleResult(); return count>0; }
     */

    @Override
    public void delete(Serializable... entityIds) {
        visible(false, entityIds);
    }

    @Override
    public long getCount() {
        return (Long) em.createQuery(
                "select count(o) from user o where o.visible=?1").setParameter(
                1, true).getSingleResult();
    }

    private void visible(boolean visible, Serializable... user_googles) {
        if (user_googles != null && user_googles.length > 0) {
            StringBuffer jpql = new StringBuffer();
            for (int i = 0; i < user_googles.length; i++) {
                jpql.append('?').append(i + 2).append(',');
            }
            jpql.deleteCharAt(jpql.length() - 1);
            Query query = em
                    .createQuery("update user b set b.visible=?1 where b.user_google in("
                            + jpql.toString() + ")");
            query.setParameter(1, visible);
            for (int i = 0; i < user_googles.length; i++) {
                query.setParameter(i + 2, user_googles[i]);
            }
            query.executeUpdate();
        }
    }

    public void enable(Serializable... user_googles) {
        visible(true, user_googles);
    }
}