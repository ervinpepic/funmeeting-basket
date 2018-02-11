package com.example.ervinpepic.funmeeting_basket.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ervinpepic.funmeeting_basket.Model.PlayerProfile
import com.example.ervinpepic.funmeeting_basket.R
import com.example.ervinpepic.funmeeting_basket.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : PlayerProfile

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }
    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level before continue", Toast.LENGTH_LONG).show()
        }
    }

    fun onBallerClicked(view: View) {
        beginnerSkillButton.isChecked = false
        player.skill = "Baller"

    }

    fun onBeginnerClicked(view: View) {
        ballerSkillButton.isChecked = false
        player.skill = "Beginner"
    }
}
