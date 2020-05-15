package com.example.meiisreallycool.goatthoughts.database;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public abstract class SessionDao implements BaseDao<Session> {

    @Query("SELECT * FROM session")
    abstract Session[] getSessions();

    @Query("SELECT * FROM session WHERE providerSessionID = :id")
    abstract Session getSession(int id);

}