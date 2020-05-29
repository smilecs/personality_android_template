package com.smile.presentation

import com.smile.domain.entities.DemoModel
import com.smile.domain.usecase.DemoUseCase
import com.smile.presentation.base.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(private val demoUseCase: DemoUseCase) : BaseViewModel() {

    fun demo(): DemoModel {
        return demoUseCase()
    }

}