package com.tjeit.a20191214_02_baseballgame

import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvent()
        setValue()
    }


    override fun setupEvent() {
    }

    override fun setValue() {
    }
}
