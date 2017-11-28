package com.example.sgubar.draggableview.entities;

import com.example.sgubar.draggableview.model.Device;

/**
 * Created by sgubar on 11/22/17.
 */

public class Transformer  extends Device {

    private String mModel;

    public Transformer(int picturePath, String deviceName, String model) {
        super(picturePath, deviceName);
        mModel = model;
    }

    public String getModel() {
        return mModel;
    }
}
