package com.example.cricketadda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cricketadda.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var newArrayList:ArrayList<ModelC>
    private lateinit var mAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil. setContentView(this,R.layout.activity_main)

        with(binding){
            newArrayList=ArrayList()
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            newArrayList.add(ModelC(R.drawable.img,"Virat Kohali","13/07/1998","34","India U19,India,Rcb","Cicku"))
            mAdapter= MyAdapter(newArrayList,this@MainActivity)
            recyclerview.adapter=mAdapter
            recyclerview.layoutManager=LinearLayoutManager(this@MainActivity)


        }
    }
}