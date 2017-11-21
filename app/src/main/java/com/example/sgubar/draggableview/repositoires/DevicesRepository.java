package com.example.sgubar.draggableview.repositoires;

import android.content.Context;

import com.example.sgubar.draggableview.R;
import com.example.sgubar.draggableview.entities.Device;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgubar on 11/21/17.
 */

public class DevicesRepository {
    private Context mCtx;
    private List<Device> mData;

    public DevicesRepository(Context ctx) {
        mCtx = ctx;
        mData = new ArrayList<>();
        mData.add(new Device(R.drawable.ic_launcher_background, "Oak light 01", 1));
        mData.add(new Device(R.drawable.ic_launcher_background, "Luminaire", 2));
        mData.add(null);
        mData.add(null);
        mData.add(new Device(R.drawable.ic_launcher_foreground, "NotEmpty", 3));
    }

    public List<Device> getDevices() {
        return mData;
    }
}
