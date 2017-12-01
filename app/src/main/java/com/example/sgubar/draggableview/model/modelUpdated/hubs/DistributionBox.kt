package com.example.sgubar.draggableview.model.modelUpdated.hubs

import com.example.sgubar.draggableview.model.modelUpdated.abstracions.Device

/**
 * Created by sgubar on 12/1/17.
 */
open class DistributionBox(name: String, imageId: Int, identifier: String, devices: List<Device>,
                           override val articleId: String)
    : DeviceHub(name, imageId, identifier, devices)