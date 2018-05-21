package com.xk.aacdemo;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xk.aacdemo.pojo.User;
import com.xk.aacdemo.viewmodel.UserProfileViewModel;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */

public class UserProfileFragment extends Fragment implements View.OnClickListener {
    private static final String UID_KEY = "uid";
    private static final String TAG = UserProfileFragment.class.getName();
    private UserProfileViewModel viewModel;
    private TextView name;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.user_profile, container, false);
        name = contentView.findViewById(R.id.name);
        name.setOnClickListener(this);
//        name.setText(viewModel.getUser().getUserName());
        return contentView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        long userId = System.currentTimeMillis() ;
        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel.class);
        viewModel.init(userId);
        viewModel.getUser().observe(this, user -> {
            Log.e(TAG, "onActivityCreated: " + user.getUserName());
        });
    }

    @Override
    public void onClick(View v) {
        User user = new User();
        user.setUserName(viewModel.getUser().getValue().getUserName() + "a");
        viewModel.getUser().setValue(user);
    }
}
