package com.lcz.pa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lcz.pa.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import androidx.databinding.DataBindingUtil.setContentView

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    }
}