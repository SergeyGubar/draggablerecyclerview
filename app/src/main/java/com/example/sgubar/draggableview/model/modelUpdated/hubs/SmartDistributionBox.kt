package com.example.sgubar.draggableview.model.modelUpdated.hubs

import com.example.sgubar.draggableview.model.modelInterfaces.BluetoothDevice
import com.example.sgubar.draggableview.model.modelInterfaces.ZigBeeDevice
import com.example.sgubar.draggableview.model.modelUpdated.abstracions.Device

/**
 * Created by sgubar on 12/1/17.
 */
class SmartDistributionBox(name: String, imageId: Int, identifier: String, devices: List<Device>,
                           override val articleId: String,
                           override val zigBeeMacAdress: String,
                           override val bluetoothMacAdress: String,
                           override val zigBeeInstallCode: String,
                           override val aesKey: String)
    : DistributionBox(name, imageId, identifier, devices, articleId), BluetoothDevice, ZigBeeDevice