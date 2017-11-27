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
    // Context can be used to manage db operations, etc.
    private Context mCtx;
    private Hub mHub;

    public DevicesRepository(Context ctx) {
        mCtx = ctx;

        ArrayList<Device> mData = new ArrayList<>();

        mData.add(new TestDevice(R.drawable.ic_launcher_background, "Oak light 01"));
        mData.add(new TestDevice(R.drawable.ic_launcher_background, "Luminaire"));
        mData.add(null);
        mData.add(null);
        mData.add(new TestDevice(R.drawable.ic_launcher_background, "NotEmpty"));

        mHub = new TestHub(android.R.color.darker_gray, "ToP Name 101",
                "Transformer 10 533", mData);

    }

    public Hub getHub() {
        return mHub;
    }
}
