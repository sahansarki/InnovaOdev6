package com.example.innovaodev6.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.innovaodev6.R
import com.example.innovaodev6.adapter.FoodAdapter
import com.example.innovaodev6.databinding.ActivityMainBinding
import com.example.innovaodev6.entity.Food

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.toolbarFoodScreen.title = "hepsiexpress"
        tasarim.foodRecyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val foodList = ArrayList<Food>()
        val f1 = Food("Kahvaltıklıklar ve Süt","egg")
        val f2 = Food("Meyveler","fruit")
        val f3 = Food("Et ve Balık","meatfish")
        val f4 = Food("Atıştırmalıklar","snacks")
        val f5 = Food("Spor","sportive")
        val f6 = Food("Su","water")

        foodList.add(f1)
        foodList.add(f2)
        foodList.add(f3)
        foodList.add(f4)
        foodList.add(f5)
        foodList.add(f6)

        val adapter = FoodAdapter(this,foodList)
        tasarim.foodRecyclerView.adapter = adapter



    }
}