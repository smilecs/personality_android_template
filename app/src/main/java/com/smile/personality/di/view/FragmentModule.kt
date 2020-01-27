package com.smile.personality.di.view

import com.smile.presentation.MainActivityFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @PerView
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainActivityFragment

}