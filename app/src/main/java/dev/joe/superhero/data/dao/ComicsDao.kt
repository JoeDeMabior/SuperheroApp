package dev.joe.superhero.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import dev.joe.superhero.data.entity.Comic

@Dao
interface ComicsDao {

    @Insert(onConflict = REPLACE)
    fun insert(comic: Comic)

    @Insert(onConflict = REPLACE)
    fun insertAll(comics: List<Comic>)

    @Update(onConflict = REPLACE)
    fun update(comic: Comic)

    @Update(onConflict = REPLACE)
    fun updateAll(comics: List<Comic>)

    @Query("SELECT * FROM comics WHERE id = :id")
    fun getComicById(id: Long): Comic?

    @Query("SELECT * FROM comics ORDER BY id LIMIT :offset, :limit")
    fun getComics(offset: Int = 0, limit: Int = -1): List<Comic>

}
