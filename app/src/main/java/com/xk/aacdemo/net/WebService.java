package com.xk.aacdemo.net;

import com.xk.aacdemo.pojo.User;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */

public interface WebService {
    /**
     * 获取用户详情
     * @param id
     * @return
     */
    User getUser(long id);
}
