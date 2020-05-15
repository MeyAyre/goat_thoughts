package com.example.meiisreallycool.goatthoughts;

import com.example.meiisreallycool.goatthoughts.database.Provider;
import com.example.meiisreallycool.goatthoughts.database.ProviderDao;
import com.example.meiisreallycool.goatthoughts.database.Session;
import com.example.meiisreallycool.goatthoughts.database.SessionDao;
import com.example.meiisreallycool.goatthoughts.database.TalkingPoint;
import com.example.meiisreallycool.goatthoughts.database.TalkingPointDao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities={Provider.class, Session.class, TalkingPoint.class}, version=1)
public abstract class db extends RoomDatabase {
    public abstract ProviderDao ProviderDao();
    public abstract SessionDao SessionDao();
    public abstract TalkingPointDao TalkingPointDao();

    public static final String NAME = "db";
}
