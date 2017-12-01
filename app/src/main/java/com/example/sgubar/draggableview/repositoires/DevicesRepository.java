package com.example.sgubar.draggableview.repositoires;

import com.example.sgubar.draggableview.R;
import com.example.sgubar.draggableview.activityhub.HubActivityModel;
import com.example.sgubar.draggableview.model.abstracions.Device;
import com.example.sgubar.draggableview.model.hubs.DeviceHub;
import com.example.sgubar.draggableview.model.hubs.DistributionBox;
import com.example.sgubar.draggableview.model.lamps.SmartLamp;

import java.util.ArrayList;

/**
 * Created by sgubar on 11/21/17.
 */

public class DevicesRepository implements HubActivityModel {

    public DeviceHub getHub() {
        ArrayList<Device> data = new ArrayList<>();

        data.add(new SmartLamp("MyLamp", R.drawable.ic_launcher_foreground,
                "identifier",
                100,
                "macAddress",
                "installCode",
                "Color"));
        data.add(null);
        data.add(null);
        data.add(new SmartLamp("MyLamp2", R.drawable.ic_launcher_foreground,
                "identifier2",
                100,
                "macAddress",
                "installCode",
                "Color"));
        data.add(new SmartLamp("MyLamp3", R.drawable.ic_launcher_foreground,
                "identifier",
                100,
                "macAddress",
                "installCode",
                "Color"));

        DeviceHub hub = new DistributionBox("DistrBoxName", R.color.colorAccent, "identifier", data, "articleId");
        hub.setCustomName("hubcustomname");
        return hub;
    }
}
