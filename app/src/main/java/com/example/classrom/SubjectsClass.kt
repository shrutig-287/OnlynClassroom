package com.example.classrom



import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.subjects_layout.*


class SubjectsClass: Fragment() {

    private lateinit var adapter: subjectsListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.subjects_layout, container, false)

        initRecyclerView(view)
        view.findViewById<CardView>(R.id.cardViewSub)


        return view
    }


    private fun initRecyclerView(view: View){
        val recyclerView =view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager =LinearLayoutManager(activity)
        adapter = subjectsListAdapter()
        recyclerView.adapter = adapter
    }






}










