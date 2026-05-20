package com.example.valentinesgarage.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Truck::class, Employee::class, RepairTask::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun garageDao(): GarageDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "garage_database"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}
