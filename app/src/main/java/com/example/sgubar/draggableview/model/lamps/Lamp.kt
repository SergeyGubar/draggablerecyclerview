package com.example.sgubar.draggableview.model.modelUpdated.lamps

import com.example.sgubar.draggableview.model.abstracions.Device

/**
 * Created by sgubar on 12/1/17.
 */
abstract class Lamp(name: String, imageId: Int, identifier: String, val brightness: Int)
    : Device(name, imageId, identifier)