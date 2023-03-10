package com.example.cricketadda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.cricketadda.databinding.ActivityAddPlayerBinding
import com.google.firebase.firestore.FirebaseFirestore

class AddPlayer : AppCompatActivity() {
    lateinit var binding: ActivityAddPlayerBinding
    lateinit var dataBase: FirebaseFirestore
    lateinit var model: ModelC
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil. setContentView(this,R.layout.activity_add_player)
        with(binding){
            send.setOnClickListener {
             addPlayer()
            }
        }
    }
    private fun addPlayer(){
        with(binding){
            model= ModelC()

            Log.d("nkmodel1",model.toString())

            model.Name=playername.text.toString()
            Log.d("nkmodel1",model.Name.toString())
            model.titleImage=R.drawable.img
            model.Age=age.text.toString()
            Log.d("nkmodel2",model.toString())
            model.Born=dateofbirth.text.toString()
            model.Teams=teamname.text.toString()
            model.Nickname=Nick.text.toString()
            model.BatStyle=batStyle.text.toString()
            model.BowlStyle=bowl.text.toString()

            Log.d("nkmodel3",model.toString())

            //firebase
            dataBase= FirebaseFirestore.getInstance()

            dataBase.collection("CricketAdda").document().set(model).addOnSuccessListener {
                Toast.makeText(this@AddPlayer,"Successfully Add",Toast.LENGTH_SHORT).show()
            }.addOnFailureListener{
                Toast.makeText(this@AddPlayer,"Something went wrong",Toast.LENGTH_SHORT).show()
                Log.d("responce",it.message.toString())
            }
        }
    }

}