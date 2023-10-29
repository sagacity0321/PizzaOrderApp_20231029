package com.example.pizzaorderapp_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.pizzaorderapp_20231029.databinding.ActivityViewStoreDetailBinding

class ViewStoreDetail : AppCompatActivity() {
    lateinit var binding: ActivityViewStoreDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_store_detail)
    }
}