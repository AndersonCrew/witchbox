package com.witchbox.domain.features.dummy

interface DummyRepository {

    suspend fun getDummyList(): Result<Any>
}