package com.example.meiisreallycool.goatthoughts;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public abstract class TalkingPointDao implements BaseDao<TalkingPoint> {

    @Query("SELECT * FROM talking_points WHERE sessionTpID = :id")
    abstract TalkingPoint[] getTalkingPoints(int id);

}

