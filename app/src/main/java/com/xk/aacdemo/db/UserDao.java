package com.xk.aacdemo.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.xk.aacdemo.pojo.User;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */
@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User user);

    @Query("select * from user where id=:id")
    User quert(int id);
}
