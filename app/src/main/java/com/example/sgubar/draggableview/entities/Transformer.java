package com.example.sgubar.draggableview.entities;

import java.util.List;

/**
 * Created by sgubar on 11/22/17.
 */

public class Transformer  extends Device {

    private List<Device> mDevices;

    public Transformer(int picturePath, String deviceName, int portNumber) {
        super(picturePath, deviceName, portNumber);
    }

    public List<Device> getDevices() {
        return mDevices;
    }
}
