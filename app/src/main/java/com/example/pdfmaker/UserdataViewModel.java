package com.example.pdfmaker;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;


public class UserdataViewModel extends AndroidViewModel {
    private UserRepository userRepository;
    private LiveData<List<User>> alluser;
    public UserdataViewModel(@NonNull Application application) {
        super(application);
        userRepository=new UserRepository(application);
        alluser=userRepository.getAlluser();
    }
    LiveData<List<User>> getAlluser(){
        return alluser;
    }
    public void insertUser(User...users){
        userRepository.insert(users);
    }
    public void updateUser(User...users){
        userRepository.update(users);
    }
    public void deleteUser(User...users){
        userRepository.delete(users);
    }
    public void deleteall(){
        userRepository.deleteall();
    }
}
