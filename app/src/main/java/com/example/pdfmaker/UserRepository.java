package com.example.pdfmaker;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class UserRepository {
    private UserDao userDao;
    private LiveData<List<User>> alluser;

    public UserRepository(Application application) {
        UserDatabase db=UserDatabase.getDatabase(application);
        userDao=db.getUserDao();
        alluser=userDao.getalluser();
    }
    LiveData<List<User>> getAlluser(){
        return alluser;
    }
    void insert(User...users){
        new insertAsyncTask(userDao).execute(users);
        }
    void update(User...users){
        new updateAsyncTask(userDao).execute(users);
    }
    void delete(User...users){
        new deleteAsyncTask(userDao).execute(users);
    }
    void deleteall(){
        new deleteallAsyncTask(userDao).execute();
    }
    static class insertAsyncTask extends AsyncTask<User,Void,Void>{
        private UserDao userDao;

        public insertAsyncTask(UserDao userDao) {
            this.userDao = userDao;
        }

        @Override
        protected Void doInBackground(User... users) {
            userDao.insertUser(users);
            return null;
        }
    }
    static class updateAsyncTask extends AsyncTask<User,Void,Void>{
        private UserDao userDao;

        public updateAsyncTask(UserDao userDao) {
            this.userDao = userDao;
        }

        @Override
        protected Void doInBackground(User...users) {
            userDao.updateUser(users);
            return null;
        }
    }
    static class deleteAsyncTask extends AsyncTask<User,Void,Void>{
        private UserDao userDao;

        public deleteAsyncTask(UserDao userDao) {
            this.userDao = userDao;
        }


        @Override
        protected Void doInBackground(User... users) {
            userDao.deleteUser(users);
            return null;
        }
    }
    static class deleteallAsyncTask extends AsyncTask<Void,Void,Void>{
        private UserDao userDao;

        public deleteallAsyncTask(UserDao userDao) {
            this.userDao = userDao;
        }

        @Override
        protected Void doInBackground(Void...voids) {
            userDao.deleteall();
            return null;
        }
    }

}
