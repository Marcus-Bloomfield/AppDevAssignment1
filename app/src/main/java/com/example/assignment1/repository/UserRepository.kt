package com.example.assignment1.repository
import com.example.assignment1.instances.RetrofitInstance
import com.example.assignment1.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRepository {
    private val api = RetrofitInstance.api

    suspend fun fetchUsers(): List<User> {
        return withContext(Dispatchers.IO) {
            api.getUsers()
        }
    }
}
