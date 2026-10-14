package com.tlenparty.popularlibraries.di.modules

import android.content.Context
import androidx.room.Room
import com.tlenparty.popularlibraries.di.AppDataBase
import com.tlenparty.popularlibraries.model.db.AppDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DBModule {
    @AppDataBase
    @Singleton
    @Provides
    fun provideAppDB(context: Context): AppDB =
        Room.databaseBuilder(context, AppDB::class.java, AppDB.DB_NAME)
            .build()
}