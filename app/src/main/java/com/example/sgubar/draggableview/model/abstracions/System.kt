package com.example.sgubar.draggableview.model.modelUpdated.abstracions

import com.example.sgubar.draggableview.model.modelInterfaces.ZigBeeDevice
import com.example.sgubar.draggableview.model.modelUpdated.abstracions.Group
import com.example.sgubar.draggableview.model.modelUpdated.abstracions.Scene
import com.example.sgubar.draggableview.model.modelUpdated.hubs.TopDevice
import com.example.sgubar.draggableview.model.modelUpdated.remotecontrols.RemoteControl

/**
 * Created by sgubar on 12/1/17.
 */
class System(name: String,
             topDevice: TopDevice,
             remoteControls: List<RemoteControl>,
             zigBeeDevices: List<ZigBeeDevice>,
             groupsList: List<Group>,
             scenes: List<Scene>)