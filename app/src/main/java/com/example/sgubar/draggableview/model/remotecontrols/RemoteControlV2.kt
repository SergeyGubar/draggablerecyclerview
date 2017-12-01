package com.example.sgubar.draggableview.model.remotecontrols

import com.example.sgubar.draggableview.model.abstracions.Action
import com.example.sgubar.draggableview.model.remotecontrols.RemoteControl

/**
 * Created by sgubar on 12/1/17.
 */

// TODO : Remove it

class RemoteControlV2(name: String, imageId: Int, identifier: String,
                      val actions: List<Action> = ArrayList<Action>(2),
                      dimsByLongTap: Boolean,
                      override val articleId: String,
                      override val zigBeeInstallCode: String,
                      override val zigBeeMacAdress: String)
    : RemoteControl(name, imageId, identifier, actions, dimsByLongTap, articleId, zigBeeMacAdress, zigBeeInstallCode)