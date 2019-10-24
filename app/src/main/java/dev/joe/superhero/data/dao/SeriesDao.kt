package dev.joe.superhero.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import dev.joe.superhero.data.entity.Series

@Dao
interface SeriesDao {

    @Insert(onConflict = REPLACE)
    fun insert(series: Series)

    @Insert(onConflict = REPLACE)
    fun insertAll(seriesList: List<Series>)

    @Update(onConflict = REPLACE)
    fun update(series: Series)

    @Update(onConflict = REPLACE)
    fun updateAll(seriesList: List<Series>)

    @Query("SELECT * FROM series WHERE id = :id")
    fun getSeriesById(id: Long): Series?

    @Query("SELECT * FROM series ORDER BY id LIMIT :offset, :limit")
    fun getSeries(offset: Int = 0, limit: Int = -1): List<Series>

}
