package com.example.sgubar.draggableview.model.modelUpdated.hubs

import com.example.sgubar.draggableview.model.modelInterfaces.BegaDevice
import com.example.sgubar.draggableview.model.modelInterfaces.BluetoothDevice
import com.example.sgubar.draggableview.model.abstracions.Device


/**
 * Created by sgubar on 12/1/17.
 */
class SmartTopDevice(name: String, imageId: Int, identifier: String, devices: List<Device>,
                     override val articleId: String,
                     override val zigBeeMacAdress: String, override
                     val bluetoothMacAdress: String,
                     override val zigBeeInstallCode: String,
                     override val aesKey: String)
    : TopDevice(name, imageId, identifier, devices),
        BluetoothDevice,
        BegaDevice