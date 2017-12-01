package com.example.sgubar.draggableview.model.abstracions

import android.graphics.Color
import com.example.sgubar.draggableview.model.lamps.Lamp

/**
 * Created by sgubar on 12/1/17.
 */

// TODO : I'm not sure about colors
class Scene(val name: String,
            val colors: List<Color>,
            val groups: List<Group>,
            val lamps: List<Lamp>)