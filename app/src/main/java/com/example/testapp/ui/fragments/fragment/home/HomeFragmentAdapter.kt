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

class HomeFragmentAdapter(private var listener:(PostModel) -> Unit) : RecyclerView.Adapter<HomeFragmentAdapter.HomeFragmentHolder>() {
    private var list: MutableList<PostModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_items, parent, false)
        return HomeFragmentHolder(view)
    }

    override fun onBindViewHolder(holder: HomeFragmentHolder, position: Int) {
        holder.onBind(list[position])
        holder.itemView.setOnClickListener{
            listener(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    fun initList( listItems:MutableList<PostModel>){
        this.list=listItems
    }

    class HomeFragmentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val title: TextView? = itemView.findViewById(R.id.items_title_text_view)
         val priceSize: TextView? = itemView.findViewById(R.id.price_size)
         val currency: TextView? = itemView.findViewById(R.id.currency)
        val location: TextView? = itemView.findViewById(R.id.items_location_text_view)
        val image: ImageView? = itemView.findViewById(R.id.items_image_view)
         fun onBind(model: PostModel){
             title!!.text = model.title
             priceSize!!.text = model.priceSize.toString()
             currency!!.text = model.currency
             location!!.text = model.location
             image!!.loadImage(model.url.toString())
         }

    }
}

