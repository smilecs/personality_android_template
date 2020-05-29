package com.smile.domain.repository

import com.smile.domain.entities.DemoModel

interface DemoRepository {

    fun demo(): DemoModel

}