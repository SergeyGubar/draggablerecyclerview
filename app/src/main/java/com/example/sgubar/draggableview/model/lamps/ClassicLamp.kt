package com.example.sgubar.draggableview.model.modelUpdated.lamps

import com.example.sgubar.draggableview.model.modelInterfaces.BegaDevice
import com.example.sgubar.draggableview.model.modelUpdated.lamps.Lamp

/**
 * Created by sgubar on 12/1/17.
 */

//TODO : By now colorTemp is int, because i think that it is something like 7000K

class ClassicLamp(name: String, imageId: Int, identifier: String, brightness: Int,
                  override val articleId: String,
                  val colorTemperature: Int)
    : Lamp(name, imageId, identifier, brightness), BegaDevice