package com.example.testapp.ui.fragments.fragment.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.ui.loadImage
import com.example.testapp.ui.model.PostModel

class HomeFragmentAdapter : RecyclerView.Adapter<HomeFragmentAdapter.HomeFragmentHolder>() {
    private var list: MutableList<PostModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_items, parent, false)
        return HomeFragmentHolder(view)
    }

    override fun onBindViewHolder(holder: HomeFragmentHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    fun initList( listItems:MutableList<PostModel>){
        this.list=listItems
    }

    class HomeFragmentHolder(items: View) : RecyclerView.ViewHolder(items) {
        private val title: TextView? = items.findViewById(R.id.items_title_text_view)
        private val priceSize: TextView? = items.findViewById(R.id.price_size)
        private val currency: TextView? = items.findViewById(R.id.currency)
        private val location: TextView? = items.findViewById(R.id.items_location_text_view)
        private val image: ImageView? = items.findViewById(R.id.items_image_view)
         fun onBind(model: PostModel){
             title!!.text = model.title
             priceSize!!.text = model.priceSize.toString()
             currency!!.text = model.currency
             location!!.text = model.location
             image!!.loadImage(model.url.toString())
         }
    }
}