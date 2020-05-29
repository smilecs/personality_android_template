package com.smile.domain.usecase

import com.smile.domain.entities.DemoModel
import com.smile.domain.repository.DemoRepository
import javax.inject.Inject

class DemoUseCase @Inject constructor(private val demoRepository: DemoRepository) {

    operator fun invoke(): DemoModel {
        return demoRepository.demo()
    }

}