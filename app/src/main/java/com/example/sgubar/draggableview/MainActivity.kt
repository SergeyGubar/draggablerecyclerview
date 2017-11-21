package com.example.sgubar.draggableview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import com.example.sgubar.draggableview.interfaces.ItemTouchHelperSampleCallback
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = DevicesRecyclerAdapter(this)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false )
        val helperCallback : ItemTouchHelper.Callback =  ItemTouchHelperSampleCallback(adapter)
        val touchHelper = ItemTouchHelper(helperCallback)
        touchHelper.attachToRecyclerView(devices_recycler_view)
        devices_recycler_view.adapter = adapter
        devices_recycler_view.layoutManager = layoutManager
    }

}
