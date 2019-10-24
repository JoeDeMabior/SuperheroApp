package dev.joe.superhero.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import dev.joe.superhero.data.entity.Creator

@Dao
interface CreatorsDao {

    @Insert(onConflict = REPLACE)
    fun insert(creator: Creator)

    @Insert(onConflict = REPLACE)
    fun insertAll(creators: List<Creator>)

    @Update(onConflict = REPLACE)
    fun update(creator: Creator)

    @Update(onConflict = REPLACE)
    fun updateAll(creators: List<Creator>)

    @Query("SELECT * FROM creators WHERE id = :id")
    fun getCreatorById(id: Long): Creator?

    @Query("SELECT * FROM creators ORDER BY id LIMIT :offset, :limit")
    fun getCreators(offset: Int = 0, limit: Int = -1): List<Creator>

}
