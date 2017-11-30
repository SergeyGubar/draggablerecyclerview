package com.example.sgubar.draggableview;

import android.content.ClipData;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sgubar.draggableview.model.Device;
import com.example.sgubar.draggableview.entities.Transformer;
import com.example.sgubar.draggableview.interfaces.ItemTouchHelperAdapter;
import com.example.sgubar.draggableview.model.Hub;
import com.example.sgubar.draggableview.model.TestDevice;
import com.example.sgubar.draggableview.model.TestHub;
import com.example.sgubar.draggableview.repositoires.DevicesRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by sgubar on 11/21/17.
 */

public class DevicesRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements
        ItemTouchHelperAdapter {
    private static final String TAG = "DevicesRecyclerAdapter";
    private List<Device> mData;
    private LayoutInflater mLayoutInflater;
    public static final int TYPE_NOT_EMPTY = 1;
    public static final int TYPE_EMPTY = 0;

    public DevicesRecyclerAdapter(Context ctx, Hub hub) {
        mData = hub.getDevices();
        mLayoutInflater = LayoutInflater.from(ctx);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        switch (viewType) {
            case TYPE_NOT_EMPTY:
                View notEmptyView = mLayoutInflater.inflate(R.layout.device_not_empty_item, parent, false);
                return new DeviceHolderNotEmpty(notEmptyView);
            default:
                View emptyView = mLayoutInflater.inflate(R.layout.device_empty_item, parent, false);
                return new DeviceHolderEmpty(emptyView);
        }
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
        switch (holder.getItemViewType()) {
            case TYPE_NOT_EMPTY:
                DeviceHolderNotEmpty notEmptyHolder = (DeviceHolderNotEmpty) holder;
                notEmptyHolder.bind(position);
                break;
            case TYPE_EMPTY:
                DeviceHolderEmpty emptyHolder = (DeviceHolderEmpty) holder;
                emptyHolder.bind(position);
                break;
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (mData.get(position) == null) {
            return TYPE_EMPTY;
        } else {
            return TYPE_NOT_EMPTY;
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public boolean onItemMove(int startPosition, int endPosition) {
        Collections.swap(mData, startPosition, endPosition);
        notifyItemMoved(startPosition, endPosition);
        notifyItemChanged(startPosition);
        notifyItemChanged(endPosition);
        return true;
    }


    /**
     * Holder for not empty port displaying some device
     */

    public class DeviceHolderNotEmpty extends RecyclerView.ViewHolder {
        private TextView mPortNumberTextView;
        private TextView mNameTextView;
        private ImageView mPictureImageView;

        public DeviceHolderNotEmpty(View itemView) {
            super(itemView);
            mPortNumberTextView = itemView.findViewById(R.id.device_model_text_view);
            mNameTextView = itemView.findViewById(R.id.device_name_text_view);
            mPictureImageView = itemView.findViewById(R.id.device_picture_image_view);
        }

        public void bind(int position) {
            Device device = mData.get(position);
            mPortNumberTextView.setText(String.valueOf(position + 1));
            mNameTextView.setText(device.getDeviceName());
            mPictureImageView.setImageResource(device.getImagePath());
        }
    }

    /**
     * Holder for the empty port (if device is null)
     */

    public class DeviceHolderEmpty extends RecyclerView.ViewHolder {

        private TextView mPortNumberTextView;
        private Button mAddDeviceButton;

        public DeviceHolderEmpty(View itemView) {
            super(itemView);
            mPortNumberTextView = itemView.findViewById(R.id.device_model_text_view);
            mAddDeviceButton = itemView.findViewById(R.id.add_device_button);
            mAddDeviceButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mData.set(getAdapterPosition(), new TestDevice(R.drawable.ic_launcher_background, "Test"));
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }

        public void bind(int position) {
            mPortNumberTextView.setText(String.valueOf(position + 1));
        }

    }

}



