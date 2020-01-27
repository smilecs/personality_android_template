package com.smile.personality.di.repo

import com.smile.data.api.PersonalityAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ApiModule {

    @Provides
    fun personality(retrofit: Retrofit): PersonalityAPI =
        retrofit.create(PersonalityAPI::class.java)

}