package com.example.sgubar.draggableview.activityhub

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.helper.ItemTouchHelper
import com.example.sgubar.draggableview.adapters.DevicesRecyclerAdapter
import com.example.sgubar.draggableview.adapters.ItemTouchHelperSampleCallback

/**
 * Created by sgubar on 12/1/17.
 */

class HubActivityPresenter(
        private val view: HubActivityView,
        private val context: Context,
        private val model: HubActivityModel) {


    fun initializeDevices() {

        val hub = model.hub

        view.initRecyclerView(hub)
        view.updateDeviceInterface(hub)

    }

}
