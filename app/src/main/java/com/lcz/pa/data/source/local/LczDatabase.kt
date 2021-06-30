package com.lcz.pa.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lcz.pa.data.Task

/**
 *
 * desc: TODO
 *
 * create by lcz on 2021-06-30
 */
@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class LczDatabase : RoomDatabase() {
    abstract fun taskDao(): TasksDao
}