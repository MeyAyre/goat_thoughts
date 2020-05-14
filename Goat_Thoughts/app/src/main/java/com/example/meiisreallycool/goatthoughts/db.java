package com.example.meiisreallycool.goatthoughts;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities={Provider.class, Session.class, TalkingPoint.class}, version=1)
public abstract class db extends RoomDatabase {
    public abstract ProviderDao ProviderDao();
    public abstract SessionDao SessionDao();
    public abstract TalkingPointDao TalkingPointDao();

    public static final String NAME = "db";
}
