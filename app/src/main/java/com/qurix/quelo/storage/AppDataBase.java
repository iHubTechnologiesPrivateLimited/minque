package com.qurix.quelo.storage;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.qurix.quelo.model.respose.DoctorsData;
import com.qurix.quelo.model.respose.PaneResponse;


@Database(entities = {DoctorsData.class, PaneResponse.class}, version = 2)
public abstract class AppDataBase extends RoomDatabase {
    public abstract DoctorsDataDao doctorsDataDao();
    public abstract PaneResponseDao paneResponseDao();
}
