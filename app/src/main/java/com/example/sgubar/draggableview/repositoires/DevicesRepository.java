package com.example.sgubar.draggableview.repositoires;

import android.content.Context;

import com.example.sgubar.draggableview.R;
import com.example.sgubar.draggableview.model.Device;
import com.example.sgubar.draggableview.entities.Transformer;
import com.example.sgubar.draggableview.model.Hub;
import com.example.sgubar.draggableview.model.TestDevice;
import com.example.sgubar.draggableview.model.TestHub;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgubar on 11/21/17.
 */

public class DevicesRepository {

    public Hub getHub() {
        ArrayList<Device> data = new ArrayList<>();

        data.add(new TestDevice(R.drawable.ic_launcher_background, "Oak light 01"));
        data.add(new TestDevice(R.drawable.ic_launcher_background, "Luminaire"));
        data.add(null);
        data.add(null);
        data.add(new TestDevice(R.drawable.ic_launcher_background, "NotEmpty"));

        return new TestHub(android.R.color.darker_gray, "ToP Name 101",
                "Transformer 10 533", data);
    }
}
