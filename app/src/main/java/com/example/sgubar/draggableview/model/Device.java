package com.example.sgubar.draggableview.model;

/**
 * Created by sgubar on 11/21/17.
 */

public abstract class Device {

    private int mImagePath;

    private String mDeviceName;

    public Device(int imagePath, String deviceName) {
        mImagePath = imagePath;
        mDeviceName = deviceName;
    }

    public int getImagePath() {
        return mImagePath;
    }

    public String getDeviceName() {
        return mDeviceName;
    }


}
