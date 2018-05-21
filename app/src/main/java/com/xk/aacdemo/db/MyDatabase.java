package com.xk.aacdemo.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.xk.aacdemo.pojo.User;

/**
 * @author xuekai1
 *         Created on 2018/5/21.
 */
@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public abstract UserDao getUserDao();
}
