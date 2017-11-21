package com.example.sgubar.draggableview.entities;

/**
 * Created by sgubar on 11/21/17.
 */

public class Device {
    private int mPicturePath;
    private String mDeviceName;
    private int mPortNumber;

    public Device(int picturePath, String deviceName, int portNumber) {
        mPicturePath = picturePath;
        mDeviceName = deviceName;
        mPortNumber = portNumber;
    }

    public int getPicturePath() {
        return mPicturePath;
    }

    public String getDeviceName() {
        return mDeviceName;
    }

    public int getPortNumber() {
        return mPortNumber;
    }
}
