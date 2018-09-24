package com.escritor.teresaj.database

import android.arch.persistence.room.*

@Entity(tableName = "tags",
        foreignKeys = [ForeignKey(entity = Sentence::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("sentenceId"),
                onDelete = ForeignKey.CASCADE)])
class Tag(@PrimaryKey(autoGenerate = true) val id: Long?,
          @ColumnInfo(name = "tag") val tag: String,
          @ColumnInfo(name = "sentenceId") val sentencecId: String)


@Dao
interface TagDao {
    @Query("Select * from tags")
    fun getAll(): List<Sentence>

    @Insert
    fun insertTags(tags: List<Tag>)

}