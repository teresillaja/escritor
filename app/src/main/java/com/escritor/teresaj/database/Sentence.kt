package com.escritor.teresaj.database

import android.arch.persistence.room.*
import java.util.*

@Entity(tableName = "sentences")
class Sentence(@PrimaryKey(autoGenerate = true) val id: Long,
               @ColumnInfo(name = "sentence") val sentence: String,
               @ColumnInfo(name = "date") val createdDate: Date)


@Dao
interface SentenceDao {
    @Query("Select * from sentences")
    fun getAll(): List<Sentence>

    @Insert
    fun insertSentence(sentence: Sentence)

}