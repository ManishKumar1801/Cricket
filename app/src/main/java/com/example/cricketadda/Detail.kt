package com.example.cricketadda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cricketadda.databinding.ActivityDetailBinding


class Detail : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    var imageValue=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_detail)
        with(binding){
            val bundle=intent.extras
            if(bundle!=null){
                imageValue=bundle.getInt("titleImage")
            }
            image.setImageResource(imageValue)
//            val name=intent.getStringExtra("Name")
//            val dob=intent.getStringExtra("Born")
//            val age=intent.getStringExtra("Age")
//            val teams=intent.getStringExtra("Teams")
//            val nickname=intent.getStringExtra("Nickname")
//            val batstyle=intent.getStringExtra("BatStyle")
//            val bowlstyle=intent.getStringExtra("BowlStyle")
            val model=intent.getSerializableExtra("Model") as ModelC
//            PlayerName.text=name
//            DateOfB.text=dob
//            Age.text=age
//            Teams.text=teams
//            NickName.text=nickname
//            BatStyle.text=batstyle
//            BowlStyle.text=bowlstyle

            playerName.text=model.Name
            dob.text=model.Born
            age.text=model.Age
            teamName.text=model.Teams
            nickName.text=model.Nickname
            batStyle.text=model.BatStyle
            ballStyle.text=model.BowlStyle

        }
    }
}