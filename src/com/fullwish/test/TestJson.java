/**
 * 
 */
package com.fullwish.test;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fullwish.utils.JsonUtil;

/**
 * @author fullwish
 *
 */
public abstract class TestJson {
    @Test(expected=StackOverflowError.class) 
    public void testRecurrsiveMap2Json() { 
       Map<String, Object> map = new HashMap<String, Object>(); 
       map.put("key", map); 
       JsonUtil.toJson(map); 
    }
//    response.setContentType(); 
//    response.setCharacterEncoding("UTF-8"); 
//    PrintWriter pw = response.getWriter(); 
//    pw.write(JsonUtil.toJson(obj)); 
//    pw.flush();
    
}
