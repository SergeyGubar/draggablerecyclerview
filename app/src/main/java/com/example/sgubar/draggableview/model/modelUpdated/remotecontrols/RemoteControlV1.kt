package com.example.sgubar.draggableview.model.modelUpdated.remotecontrols

import com.example.sgubar.draggableview.model.modelUpdated.abstracions.Action

/**
 * Created by sgubar on 12/1/17.
 */

// TODO : That's not the right way to solve the problem of remote controls, v1 and v1 absolutely identical
class RemoteControlV1(name: String, imageId: Int, identifier: String,
                      actions: List<Action> = ArrayList<Action>(10),
                      dimsByLongTap: Boolean,
                      override val articleId: String,
                      override val zigBeeInstallCode: String,
                      override val zigBeeMacAdress: String)
    : RemoteControl(name, imageId, identifier, actions, dimsByLongTap, articleId, zigBeeMacAdress, zigBeeInstallCode)