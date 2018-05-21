package com.xk.aacdemo.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.xk.aacdemo.db.UserDao;
import com.xk.aacdemo.net.NetWork;
import com.xk.aacdemo.pojo.User;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */

public class UserRepository {
    // TODO: by xk 2018/5/21 14:45 use cache


    private UserDao userDao;
    public LiveData<User> getUser(long id) {
        User user = NetWork.getService().getUser(id);
        MutableLiveData<User> userLiveData = new MutableLiveData<>();
        userLiveData.setValue(user);
        return userLiveData;

//        userDao.loa


    }
}
