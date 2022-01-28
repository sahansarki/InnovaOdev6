package com.example.innovaodev6.adapter.viewholder

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.innovaodev6.databinding.FoodItemBinding
import com.example.innovaodev6.entity.Food

class FoodItemViewHolder(
    private val mContext: Context,
    private val binding: FoodItemBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(food: Food) {
        binding.food = food
        binding.foodPicture.setImageResource(mContext.resources.getIdentifier(food.pictureName,"drawable",mContext.packageName))
    }


    companion object {
        fun create(
            mContext: Context,
            parent: ViewGroup,
        ): FoodItemViewHolder {
            val view = FoodItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return FoodItemViewHolder(mContext,view)
        }
    }
}