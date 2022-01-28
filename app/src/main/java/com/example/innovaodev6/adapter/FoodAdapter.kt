package com.example.innovaodev6.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.innovaodev6.adapter.viewholder.FoodItemViewHolder
import com.example.innovaodev6.entity.Food


class FoodAdapter(
    private val mContext: Context,
    private val foodList: List<Food>
): RecyclerView.Adapter<FoodItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        return FoodItemViewHolder.create(
            mContext,
            parent
        )
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        holder.bind(foodList[position])
    }

    override fun getItemCount(): Int = foodList.size
}