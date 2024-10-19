package com.example.qrcodesranerjetpack

import android.app.Application
import androidx.room.Room
import com.example.qrcodesranerjetpack.data.MainDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideMainDb(app: Application): MainDb {
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            "products.db"
        ).build()
    }
}