package com.example.sgubar.draggableview.activityhub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SimpleItemAnimator
import android.support.v7.widget.helper.ItemTouchHelper
import com.example.sgubar.draggableview.R
import com.example.sgubar.draggableview.adapters.DevicesRecyclerAdapter
import com.example.sgubar.draggableview.adapters.ItemTouchHelperSampleCallback
import com.example.sgubar.draggableview.model.hubs.DeviceHub
import com.example.sgubar.draggableview.repositoires.DevicesRepository
import kotlinx.android.synthetic.main.activity_hub.*
import kotlinx.android.synthetic.main.device_hub.*

class HubActivity : AppCompatActivity(), HubActivityView {

    private val presenter by lazy {
        HubActivityPresenter(this, this, DevicesRepository())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)

        presenter.initializeDevices()

    }


    override fun updateDeviceInterface(hub: DeviceHub) {
        device_picture_image_view.setImageDrawable(getDrawable(hub.imageId))
        device_model_text_view.text = hub.name
        device_name_text_view.text = hub.customName
    }

    override fun initRecyclerView(hub: DeviceHub) {
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
