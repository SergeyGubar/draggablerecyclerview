package com.example.sgubar.draggableview.model;

import java.util.List;

/**
 * Created by sgubar on 11/24/17.
 */

public abstract class Hub extends Device {
    private List<Device> mDevices;
    private String mModel;
    public Hub(int imagePath, String deviceName, String model, List<Device> devices) {
        super(imagePath, deviceName);
        mDevices = devices;
        mModel = model;
    }

    public List<Device> getDevices() {
        return mDevices;
    }

    public String getModel() {
        return mModel;
    }
}
