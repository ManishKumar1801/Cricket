package com.example.cricketadda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cricketadda.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var newArrayList:ArrayList<ModelC>
    private lateinit var mAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil. setContentView(this,R.layout.activity_main)

        with(binding){
            add.setOnClickListener{
                val intent= Intent(this@MainActivity,AddPlayer::class.java)
                startActivity(intent)
            }
            newArrayList=ArrayList()
            Log.d("nklist1",newArrayList.toString())
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
//            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku","Right Handed Bat","Right-arm medium"))
            Log.d("nklist2",newArrayList.toString())
            mAdapter= MyAdapter(newArrayList,this@MainActivity)

            recyclerview.adapter=mAdapter
            recyclerview.layoutManager=LinearLayoutManager(this@MainActivity)


        }
    }
}