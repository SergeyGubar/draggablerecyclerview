package com.example.sgubar.draggableview.model.modelUpdated.hubs

import com.example.sgubar.draggableview.model.modelUpdated.abstracions.Device

/**
 * Created by sgubar on 12/1/17.
 */
class LegacyTopDevice(
        name: String,
        imageId: Int,
        identifier: String,
        devices: List<Device>,
        override val articleId: String,
        override val zigBeeMacAdress: String,
        override val zigBeeInstallCode: String)
    : TopDevice(name, imageId, identifier, devices)