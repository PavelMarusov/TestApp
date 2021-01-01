package com.example.testapp.ui.detail

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R
import com.example.testapp.ui.loadImage
import com.example.testapp.ui.model.PostModel
import kotlinx.android.synthetic.main.activity_info.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        setSupportActionBar(findViewById(R.id.tool_bar))
        setData()
    }
    private fun setData(){
        detail_title.text = item?.title
        detail_description.text = item?.description
        detail_image.loadImage(item?.url.toString())
        detail_location.text = item?.location
        detail_currency.text = item?.currency
        detail_price.text = item?.priceSize.toString()
    }


    companion object {
        var item: PostModel? = null
        fun instanceDetail(activity: Activity?, id: PostModel?) {
            val intent = Intent(activity, DetailActivity::class.java)
            activity?.startActivity(intent)
            this.item = id
        }
    }
}