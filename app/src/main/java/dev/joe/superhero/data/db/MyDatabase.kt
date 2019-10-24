package dev.joe.superhero.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import dev.joe.superhero.converter.*
import dev.joe.superhero.data.dao.*
import dev.joe.superhero.data.entity.*

@Database(
    entities = [Character::class, Comic::class, Creator::class, Event::class, Series::class, Stories::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(
    CharactersConverter::class,
    ComicsConverter::class,
    CreatorsConverter::class,
    DateConverter::class,
    EventsConverter::class,
    ImagesConverter::class,
    SeriesConverter::class,
    StoriesConverter::class,
    UrlsConverter::class
)
abstract class MyDatabase : RoomDatabase() {
    abstract fun charactersDao(): CharactersDao
    abstract fun comicsDao(): ComicsDao
    abstract fun creatorsDao(): CreatorsDao
    abstract fun eventsDao(): EventsDao
    abstract fun seriesDao(): SeriesDao
    abstract fun storiesDao(): StoriesDao

    companion object {
        @Volatile
        var INSTANCE: MyDatabase? = null
        var database_name = "marvel"
        private val MIGRATIONS = arrayOf<Migration>()

        fun getInstance(context: Context): MyDatabase {
            val temp = INSTANCE
            if (temp != null)
                return temp
            synchronized(this) {
                val dbInstance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    database_name
                )
                    .addMigrations(*MIGRATIONS)
                    .build()
                INSTANCE = dbInstance
                return dbInstance
            }
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}
