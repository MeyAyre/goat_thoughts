package com.example.meiisreallycool.goatthoughts.database;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

@Dao
public interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(T entity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<T> entity);

    @Update
    void update(T entity);

    @Update
    void update(List<T> entity);

    @Delete
    void delete(T entity);

    @Delete
    void delete(List<T> entity);


}
