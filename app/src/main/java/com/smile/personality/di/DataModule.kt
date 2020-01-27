package com.smile.personality.di

import com.smile.personality.di.repo.ApiModule
import com.smile.personality.di.repo.NetModule
import dagger.Module

@Module(
    includes = [
        NetModule::class,
        ApiModule::class,
        RepoModule::class
    ]
)
class DataModule