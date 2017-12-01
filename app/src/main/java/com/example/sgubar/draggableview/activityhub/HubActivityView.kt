package com.example.sgubar.draggableview.activityhub

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import com.example.sgubar.draggableview.model.hubs.DeviceHub

/**
 * Created by sgubar on 12/1/17.
 */

interface HubActivityView {
    fun updateDeviceInterface(hub: DeviceHub)
    fun initRecyclerView(hub: DeviceHub)
}
