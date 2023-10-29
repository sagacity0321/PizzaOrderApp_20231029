package com.example.pizzaorderapp_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.pizzaorderapp_20231029.adapters.StoreAdapter
import com.example.pizzaorderapp_20231029.databinding.ActivityMainBinding
import com.example.pizzaorderapp_20231029.datas.StoreData

class MainActivity : AppCompatActivity() {
    val mPizzaStoreList = ArrayList<StoreData>()
    lateinit var mAdapter: StoreAdapter
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mPizzaStoreList.add(StoreData("피자헛", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg", "1588-5588"))
        mPizzaStoreList.add(StoreData("파파존스", " http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/��������_����_�ΰ�_(4).png?type=w800", "1577-8080"))
        mPizzaStoreList.add(StoreData("미스터피자", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200", "1577-0077"))
        mPizzaStoreList.add(StoreData("도미노피자", "https://t1.daumcdn.net/cfile/tistory/12735E445023743122", "1577-3082"))

        mAdapter = StoreAdapter(this, R.layout.pizza_store_list_item, mPizzaStoreList)

        binding.pizzaStoreListView.adapter = mAdapter
    }
}