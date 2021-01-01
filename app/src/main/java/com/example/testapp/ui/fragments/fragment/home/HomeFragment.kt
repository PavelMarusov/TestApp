package com.example.testapp.ui.fragments.fragment.home

import android.location.LocationManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.ui.detail.DetailActivity
import com.example.testapp.ui.model.PostModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private lateinit var viewModel: HomeViewModel
    private lateinit var adapter: HomeFragmentAdapter
    private lateinit var recycler:RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        recycler = view.findViewById(R.id.home_fragment_recycler)
        initAdapter()
        return view
    }
    private fun initAdapter() {
        adapter = HomeFragmentAdapter(){ item: PostModel -> onItemClick(item) }
        recycler.adapter = adapter
        viewModel.getBook()?.let { adapter.initList(it) }

    }
    fun onItemClick(item: PostModel) {
        DetailActivity.instanceDetail(requireActivity(), item)
    }
}