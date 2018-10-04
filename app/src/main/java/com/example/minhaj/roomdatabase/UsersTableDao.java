package com.example.minhaj.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Minhaj on 02/10/2018.
 */

@Dao
public interface UsersTableDao {

    @Query("SELECT * FROM users")
    List<UsersTable> getAllUsers();

    @Query("SELECT * FROM users WHERE id = :id")
    UsersTable getUser(int id);

    @Query("SELECT * FROM users WHERE first_name LIKE :firstName OR last_name LIKE :lastName")
    UsersTable findUserByName(String firstName,String lastName);

    @Insert
    void insertUsers(UsersTable...usersTables);

    @Delete
    void deleteUser(UsersTable usersTable);
}
