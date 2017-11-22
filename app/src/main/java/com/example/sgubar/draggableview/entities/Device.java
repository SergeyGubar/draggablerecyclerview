package com.example.sgubar.draggableview.entities;

/**
 * Created by sgubar on 11/21/17.
 */

public class Device {
    private int mPicturePath;
    private String mDeviceName;

    public Device(int picturePath, String deviceName) {
        mPicturePath = picturePath;
        mDeviceName = deviceName;
    }

    public int getPicturePath() {
        return mPicturePath;
    }

    public String getDeviceName() {
        return mDeviceName;
    }


}
