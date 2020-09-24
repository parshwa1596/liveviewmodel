package com.example.liveviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.setup("1")

        viewModel.firstName.observe(this, Observer {
            firstNameTextView.text = it
        })

        viewModel.lastName.observe(this, Observer {
            lastNameTextView.text = it
        })

        viewModel.age.observe(this, Observer {
            ageTextView.text = it.toString()
        })
    }
}