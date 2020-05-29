package com.smile.domain.usecase

import com.smile.domain.BaseUseCase
import com.smile.domain.entities.DemoModel
import com.smile.domain.repository.DemoRepository
import javax.inject.Inject

class DemoBaseUseCase @Inject constructor(
    private val demoRepository: DemoRepository
) : BaseUseCase<DemoModel, Unit> {

    override suspend fun invoke(params: Unit): DemoModel {
        return demoRepository.demo()
    }

}