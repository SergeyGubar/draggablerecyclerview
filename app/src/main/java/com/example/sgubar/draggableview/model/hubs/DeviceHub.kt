package com.example.sgubar.draggableview.model.modelUpdated.hubs

import com.example.sgubar.draggableview.model.modelInterfaces.BegaDevice
import com.example.sgubar.draggableview.model.abstracions.Device

/**
 * Created by sgubar on 12/1/17.
 */
abstract class DeviceHub(name: String, imageId : Int, identifier: String, val devices : List<Device>)
    : Device(name, imageId, identifier), BegaDevice



