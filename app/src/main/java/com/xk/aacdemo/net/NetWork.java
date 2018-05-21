package com.xk.aacdemo.net;

import com.xk.aacdemo.pojo.User;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */

public class NetWork {

    public static WebService getService() {
        return new WebService() {
            @Override
            public User getUser(long id) {
                User user = new User();
                user.setUserName(id + ":" + System.currentTimeMillis());
                return user;
            }
        };
    }
}
