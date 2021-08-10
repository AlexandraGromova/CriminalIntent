package com.bignerdranch.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.criminalintent.Crime

@Database(entities = [ Crime ::class], version = 1)
@TypeConverters(TypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {
 abstract fun crimeDao(): CrimeDao
}