package com.example.sgubar.draggableview.model.abstracions

import com.example.sgubar.draggableview.model.modelInterfaces.ZigBeeDevice
import com.example.sgubar.draggableview.model.hubs.TopDevice
import com.example.sgubar.draggableview.model.remotecontrols.RemoteControl

/**
 * Created by sgubar on 12/1/17.
 */
class System(name: String,
             topDevice: TopDevice,
             remoteControls: List<RemoteControl>,
             zigBeeDevices: List<ZigBeeDevice>,
             groupsList: List<Group>,
             scenes: List<Scene>)