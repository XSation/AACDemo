package com.xk.aacdemo.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.xk.aacdemo.pojo.User;
import com.xk.aacdemo.repository.UserRepository;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */

public class UserProfileViewModel extends ViewModel {
    private long userId;
    private MutableLiveData<User> user;
    private UserRepository userRepository;


    public UserProfileViewModel() {
        this.userRepository = new UserRepository();
    }

    public void init(long userId) {
        if (user != null) {
            //之前已经创建过了user。一个fragment只能创建一次，该方法被重复调用，说明fragment被销毁重建了。
            return;
        }
        this.userId = userId;
        user = (MutableLiveData<User>) userRepository.getUser(userId);
    }

    public MutableLiveData<User> getUser() {
        return user;
    }
}
