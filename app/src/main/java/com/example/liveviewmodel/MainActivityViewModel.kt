package com.example.liveviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val age = MutableLiveData<Int>()


    fun setup(profileId: String) {

        val apiFirstName = "Parshwa"
        val apiLastName = "Shah"
        val apiAge = 28
        firstName.value = apiFirstName
        lastName.value = apiLastName
        age.value = apiAge
    }

}