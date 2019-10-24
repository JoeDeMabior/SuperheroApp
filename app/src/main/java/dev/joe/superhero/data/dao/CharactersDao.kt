package dev.joe.superhero.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import dev.joe.superhero.data.entity.Character

@Dao
interface CharactersDao {

    @Insert(onConflict = REPLACE)
    fun insert(character: Character)

    @Insert(onConflict = REPLACE)
    fun insertAll(characters: List<Character>)

    @Update(onConflict = REPLACE)
    fun update(character: Character)

    @Update(onConflict = REPLACE)
    fun updateAll(characters: List<Character>)

    @Query("SELECT * FROM characters WHERE id = :id")
    fun getCharacterById(id: Long): Character?

    @Query("SELECT * FROM characters ORDER BY id LIMIT :offset, :limit")
    fun getCharacters(offset: Int = 0, limit: Int = -1): List<Character>

}
