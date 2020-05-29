package com.smile.data.repository

import com.smile.domain.entities.DemoModel
import com.smile.domain.repository.DemoRepository

class DemoRepositoryImpl : DemoRepository {

    override fun demo(): DemoModel {
        return DemoModel()
    }

}