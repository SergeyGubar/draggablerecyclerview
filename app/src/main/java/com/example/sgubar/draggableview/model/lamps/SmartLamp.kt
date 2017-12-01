package com.example.sgubar.draggableview.model.lamps

import com.example.sgubar.draggableview.model.modelInterfaces.ZigBeeDevice

/**
 * Created by sgubar on 12/1/17.
 */

// TODO : I'm not sure about the color

class SmartLamp(name: String, imageId: Int, identifier: String, brightness: Int,
                override val zigBeeMacAdress: String,
                override val zigBeeInstallCode: String,
                val color: String)
    : Lamp(name, imageId, identifier, brightness), ZigBeeDevice