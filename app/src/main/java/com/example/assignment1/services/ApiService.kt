package com.example.assignment1.services
import retrofit2.http.GET
import com.example.assignment1.model.User

interface ApiService {
    @GET("api/v2/users?size=10")
    suspend fun getUsers(): List<User>
}