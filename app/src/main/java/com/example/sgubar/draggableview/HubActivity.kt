package com.example.sgubar.draggableview

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SimpleItemAnimator
import android.support.v7.widget.helper.ItemTouchHelper
import com.example.sgubar.draggableview.interfaces.ItemTouchHelperSampleCallback
import com.example.sgubar.draggableview.model.Hub
import com.example.sgubar.draggableview.repositoires.DevicesRepository
import kotlinx.android.synthetic.main.activity_hub.*
import kotlinx.android.synthetic.main.device_hub.*

class HubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)
        val repository = DevicesRepository()
        setupHub(repository.hub)
    }

    private fun setupHub(hub: Hub) {
        device_picture_image_view.setImageDrawable(getDrawable(hub.imagePath))
        device_model_text_view.text = hub.deviceName
        device_name_text_view.text = hub.model
        val adapter = DevicesRecyclerAdapter(this, hub)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val helperCallback: ItemTouchHelper.Callback = ItemTouchHelperSampleCallback(adapter)
        val touchHelper = ItemTouchHelper(helperCallback)
        touchHelper.attachToRecyclerView(devices_recycler_view)
        (devices_recycler_view.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        devices_recycler_view.adapter = adapter
        devices_recycler_view.layoutManager = layoutManager
    }

}
