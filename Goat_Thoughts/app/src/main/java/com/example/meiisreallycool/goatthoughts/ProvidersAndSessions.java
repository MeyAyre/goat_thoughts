package com.example.meiisreallycool.goatthoughts;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class ProvidersAndSessions {
    @Embedded public Provider provider;
    @Relation(
            parentColumn = "providerID",
            entityColumn = "providerSessionID"
    )
    public List<Session> sessions;
}
