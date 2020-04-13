package com.example.pdfmaker;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user_table ORDER BY  id DESC")
    LiveData<List<User>> getalluser();
    @Insert
    void insertUser(User...users);
    @Query("SELECT * FROM USER_TABLE WHERE user LIKE :username LIMIT 1") //返回1个结果
    LiveData<User> getuser(String username);
    @Delete
    void deleteUser(User...users);
    @Update
    void updateUser(User...users);
    @Query("DELETE FROM USER_TABLE")
    void deleteall();
}
