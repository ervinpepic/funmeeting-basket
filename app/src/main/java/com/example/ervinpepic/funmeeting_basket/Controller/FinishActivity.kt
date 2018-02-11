package com.example.ervinpepic.funmeeting_basket.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ervinpepic.funmeeting_basket.Model.PlayerProfile
import com.example.ervinpepic.funmeeting_basket.R
import com.example.ervinpepic.funmeeting_basket.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val palyer = intent.getParcelableExtra<PlayerProfile>(EXTRA_PLAYER)

        searchtext.text = "Looking for ${palyer.league} ${palyer.skill} league near you..."
    }
}
