package com.smile.presentation

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        with(supportFragmentManager) {
            val fragment =
                findFragmentByTag(MAIN_FRAGMENT_TAG) ?: MainActivityFragment()
            beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
        }
    }

}
