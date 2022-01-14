package com.example.recyclerviewscroll_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        val members = addedMemberList()
        refreshAdapter(members)

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

    }

    private fun addedMemberList(): ArrayList<Member> {
        val member = ArrayList<Member>()
        for (i in 0..30) {
            member.add(Member("Android", "$i"))
        }
        return member
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView.adapter = adapter

    }
}