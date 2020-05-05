package com.example.meiisreallycool.goatthoughts;


import androidx.room.Dao;
import androidx.room.Query;

@Dao
public abstract class ProviderDao implements BaseDao<Provider>{

    @Query("SELECT * FROM providers")
    abstract Provider[] getProviders();

    @Query("SELECT * FROM providers WHERE providerID = :id")
    abstract Provider getProvider(int id);

}
