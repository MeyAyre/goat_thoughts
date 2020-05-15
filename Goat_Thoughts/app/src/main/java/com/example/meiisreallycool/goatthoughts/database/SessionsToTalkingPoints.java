package com.example.meiisreallycool.goatthoughts.database;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class SessionsToTalkingPoints {
    @Embedded public Session session;
    @Relation(
            parentColumn = "sessionID",
            entityColumn = "sessionTpID"
    )
    public List<TalkingPoint> talkingPoints;
}
