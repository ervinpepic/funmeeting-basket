package com.example.ervinpepic.funmeeting_basket.Controller

import android.content.Intent
import android.os.Bundle
import com.example.ervinpepic.funmeeting_basket.R
import kotlinx.android.synthetic.main.activity_welcom.*

class WelcomActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)

        getstartedbutton.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
