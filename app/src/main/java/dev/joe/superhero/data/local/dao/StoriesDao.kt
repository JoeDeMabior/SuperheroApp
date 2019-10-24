package dev.joe.superhero.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import dev.joe.superhero.data.local.entity.Stories

@Dao
interface StoriesDao {

    @Insert(onConflict = REPLACE)
    fun insert(stories: Stories)

    @Insert(onConflict = REPLACE)
    fun insertAll(storiesList: List<Stories>)

    @Update(onConflict = REPLACE)
    fun update(stories: Stories)

    @Update(onConflict = REPLACE)
    fun updateAll(storiesList: List<Stories>)

    @Query("SELECT * FROM stories WHERE id = :id")
    fun getStoryById(id: Long): Stories?

    @Query("SELECT * FROM stories ORDER BY id LIMIT :offset, :limit")
    fun getStories(offset: Int = 0, limit: Int = -1): List<Stories>

}
