package com.example.sgubar.draggableview.model.hubs

import com.example.sgubar.draggableview.model.modelInterfaces.ZigBeeDevice
import com.example.sgubar.draggableview.model.abstracions.Device

/**
 * Created by sgubar on 12/1/17.
 */
abstract class TopDevice(name: String,
                         imageId: Int,
                         identifier: String,
                         devices: List<Device>)
    : DeviceHub(name, imageId, identifier, devices), ZigBeeDevice {

}