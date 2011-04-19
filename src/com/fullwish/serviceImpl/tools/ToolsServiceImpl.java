package com.fullwish.serviceImpl.tools;

import java.io.Serializable;

import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fullwish.bean.entity.Tools;
import com.fullwish.service.base.DaoSupport;
import com.fullwish.service.tools.ToolsService;

@Service
@Transactional
public class ToolsServiceImpl extends DaoSupport<Tools> implements ToolsService {
    // public void updatePassword(String tools_id, String newpassword){
    // em.createQuery("update tools o set o.password=?1 where o.tools_id=?2")
    // .setParameter(1, MD5.MD5Encode(newpassword)).setParameter(2,
    // tools_id).executeUpdate();
    // }

    @Override
    public void save(Tools entity) {
        // entity.setTools_password(MD5.MD5Encode(entity.getTools_password()));
        super.save(entity);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public boolean exsit(String tools_id) {
        long count = (Long) em.createQuery(
                "select count(o) from tools o where o.tools_id=?1")
                .setParameter(1, tools_id).getSingleResult();
        return count > 0;
    }

    /*
     * public boolean checkTools(String user_email, String user_password) { long
     * count = (Long) em .createQuery( "select count(o) from Tools o where
     * o.user_email=?1 and o.user_password=?2") // user±íÒª´óÐ´ .setParameter(1,
     * user_email).setParameter(2,
     * MD5.MD5Encode(user_password)).getSingleResult(); //
     * System.out.println("check over"); return count > 0; }
     */

    /*
     * public boolean checkTools(String username, String password){ long count =
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
                "select count(o) from tools o where o.visible=?1")
                .setParameter(1, true).getSingleResult();
    }

    private void visible(boolean visible, Serializable... tools_ids) {
        if (tools_ids != null && tools_ids.length > 0) {
            StringBuffer jpql = new StringBuffer();
            for (int i = 0; i < tools_ids.length; i++) {
                jpql.append('?').append(i + 2).append(',');
            }
            jpql.deleteCharAt(jpql.length() - 1);
            Query query = em
                    .createQuery("update Tools b set b.tools_visible=?1 where b.tools_id in("
                            + jpql.toString() + ")");
            query.setParameter(1, visible);
            for (int i = 0; i < tools_ids.length; i++) {
                query.setParameter(i + 2, tools_ids[i]);
            }
            query.executeUpdate();
        }
    }

    public void enable(Serializable... tools_ids) {
        visible(true, tools_ids);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.fullwish.service.tools.ToolsService#updateToolsInfo(java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String)
     */
    /*
     * public void updateToolsInfo(String user_email, String user_country,
     * String user_career, String user_nickname) { // update tools o set
     * o.user_action=2,o.user_attack=3 // where o.user_email="test@gmail.com";
     * em .createQuery( "update Tools o set o.user_country=?1, o.user_career=?2,
     * o.user_nickname=?3 where o.user_email=?4") .setParameter(1,
     * user_country).setParameter(2, user_career) .setParameter(3,
     * user_nickname).setParameter(4, user_email) .executeUpdate(); }
     */
}