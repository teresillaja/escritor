package com.escritor.teresaj.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters

@Database(entities = [Sentence::class, Tag::class], version = 1)
@TypeConverters(DateTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun sentenceDAO(): SentenceDao
    abstract fun tagDAO(): TagDao
}