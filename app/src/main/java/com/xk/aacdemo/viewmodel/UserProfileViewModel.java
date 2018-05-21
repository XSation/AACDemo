package com.xk.aacdemo.viewmodel;

import android.arch.lifecycle.ViewModel;

import com.xk.aacdemo.pojo.User;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */

public class UserProfileViewModel extends ViewModel {
    private String userId;
    private User user;

    public void init(String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }
}
