package com.example.assignment1.model
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignment1.repository.UserRepository
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserViewModel : ViewModel() {
    private val repository = UserRepository()

    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    fun loadUsers() {
        viewModelScope.launch {
            val fetchedUsers = repository.fetchUsers()
            _users.value = fetchedUsers
        }
    }
}
