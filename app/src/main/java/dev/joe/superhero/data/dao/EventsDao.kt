package dev.joe.superhero.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import dev.joe.superhero.data.entity.Event

@Dao
interface EventsDao {

    @Insert(onConflict = REPLACE)
    fun insert(event: Event)

    @Insert(onConflict = REPLACE)
    fun insertAll(events: List<Event>)

    @Update(onConflict = REPLACE)
    fun update(event: Event)

    @Update(onConflict = REPLACE)
    fun updateAll(events: List<Event>)

    @Query("SELECT * FROM events WHERE id = :id")
    fun getEventById(id: Long): Event?

    @Query("SELECT * FROM events ORDER BY id LIMIT :offset, :limit")
    fun getEvents(offset: Int = 0, limit: Int = -1): List<Event>

}
