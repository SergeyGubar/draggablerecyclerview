package com.example.sgubar.draggableview.model.modelUpdated.abstracions

import android.graphics.Color
import com.example.sgubar.draggableview.model.modelUpdated.abstracions.Group
import com.example.sgubar.draggableview.model.modelUpdated.lamps.Lamp

/**
 * Created by sgubar on 12/1/17.
 */

// TODO : I'm not sure about colors
class Scene(val name: String,
            val colors: List<Color>,
            val groups: List<Group>,
            val lamps: List<Lamp>)