package com.witchbox.network.apiservice

class DummyApiService {

    @POST("login")
    fun login(
        @Body body: LoginRequest
    ): Call<RemoteResponse<AuthResponse>>
}