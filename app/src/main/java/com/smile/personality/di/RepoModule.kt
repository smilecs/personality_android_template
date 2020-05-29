package com.smile.personality.di


import com.smile.data.repository.DemoRepositoryImpl
import com.smile.domain.repository.DemoRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepoModule {

    @Binds
    abstract fun demoImpl(demoRepositoryImpl: DemoRepositoryImpl): DemoRepository

}