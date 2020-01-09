package com.lemondropsarl.base.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lemondropsarl.base.R
import com.lemondropsarl.base.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
