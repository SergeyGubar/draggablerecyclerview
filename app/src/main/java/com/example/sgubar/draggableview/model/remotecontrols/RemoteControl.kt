package com.example.sgubar.draggableview.model.modelUpdated.remotecontrols

import com.example.sgubar.draggableview.model.modelInterfaces.BegaDevice
import com.example.sgubar.draggableview.model.modelInterfaces.ZigBeeDevice
import com.example.sgubar.draggableview.model.abstracions.Action
import com.example.sgubar.draggableview.model.abstracions.Device

/**
 * Created by sgubar on 12/1/17.
 */

// TODO : what is an action?

abstract class RemoteControl(name: String, imageId: Int, identifier: String,
                             val actionsList: List<Action>,
                             val dimsByLongTap: Boolean,
                             override val articleId: String,
                             override val zigBeeMacAdress: String,
                             override val zigBeeInstallCode: String)
    : Device(name, imageId, identifier), ZigBeeDevice, BegaDevice

