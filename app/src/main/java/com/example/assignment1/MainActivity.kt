package com.example.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.assignment1.model.UserViewModel
import com.example.assignment1.ui.screens.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val userViewModel: UserViewModel = viewModel()
            userViewModel.loadUsers()
            LoginScreen(userViewModel = userViewModel)
        }
    }
}
