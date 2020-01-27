package com.smile.personality.di

import com.smile.personality.PersonalityApplication
import com.smile.personality.di.view.ActivityModule
import com.smile.personality.di.view.FragmentModule
import com.smile.personality.di.view.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        DataModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        FragmentModule::class
    ]
)
interface AppComponent : AndroidInjector<PersonalityApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: PersonalityApplication): Builder

        fun build(): AppComponent
    }

}
