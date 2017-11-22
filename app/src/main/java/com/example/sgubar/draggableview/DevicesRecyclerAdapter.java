package com.example.sgubar.draggableview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sgubar.draggableview.entities.Device;
import com.example.sgubar.draggableview.entities.Transformer;
import com.example.sgubar.draggableview.interfaces.ItemTouchHelperAdapter;
import com.example.sgubar.draggableview.repositoires.DevicesRepository;

import java.util.Collections;
import java.util.List;

/**
 * Created by sgubar on 11/21/17.
 */

public class DevicesRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements
        ItemTouchHelperAdapter {

    private DevicesRepository mDevicesRepository;
    private List<Device> mData;
    private LayoutInflater mLayoutInflater;
    public static final int TYPE_NOT_EMPTY = 1;
    public static final int TYPE_EMPTY = 0;
    public static final int TYPE_TRANSFORMER = 2;

    public DevicesRecyclerAdapter(Context ctx) {
        mDevicesRepository = new DevicesRepository(ctx);
        mData = mDevicesRepository.getDevices();
        mLayoutInflater = LayoutInflater.from(ctx);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_NOT_EMPTY:
                View notEmptyView = mLayoutInflater.inflate(R.layout.device_not_empty_item, parent, false);
                return new DeviceHolderNotEmpty(notEmptyView);
            case TYPE_TRANSFORMER:
                View transformerView = mLayoutInflater.inflate(R.layout.device_transformer, parent, false);
                return new TransformerHolder(transformerView);
            default:
                View emptyView = mLayoutInflater.inflate(R.layout.device_empty_item, parent, false);
                return new DeviceHolderEmpty(emptyView);
        }
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
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
            // TODO: That's not okay
        } else if (mData.get(position) instanceof Transformer) {
            return TYPE_TRANSFORMER;
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
        if (startPosition < endPosition) {
            for (int i = startPosition; i < endPosition; i++) {
                Collections.swap(mData, i, i + 1);
            }
        } else {
            for (int i = startPosition; i > endPosition; i--) {
                Collections.swap(mData, i, i - 1);
            }
        }
        notifyItemMoved(startPosition, endPosition);
        return true;
    }

    public class DeviceHolderNotEmpty extends RecyclerView.ViewHolder {
        private TextView mPortNumberTextView;
        private TextView mNameTextView;
        private ImageView mPictureImageView;

        public DeviceHolderNotEmpty(View itemView) {
            super(itemView);
            mPortNumberTextView = itemView.findViewById(R.id.device_port_number_text_view);
            mNameTextView = itemView.findViewById(R.id.device_name_text_view);
            mPictureImageView = itemView.findViewById(R.id.device_picture_image_view);
        }

        public void bind(int position) {
            Device device = mData.get(position);
            mPortNumberTextView.setText(String.valueOf(position));
            mNameTextView.setText(device.getDeviceName());
            mPictureImageView.setImageResource(device.getPicturePath());
        }
    }

    public class DeviceHolderEmpty extends RecyclerView.ViewHolder {
        private TextView mPortNumberTextView;

        public DeviceHolderEmpty(View itemView) {
            super(itemView);
            mPortNumberTextView = itemView.findViewById(R.id.device_port_number_text_view);
            //TODO : Add some logic here, etc change port number
        }

        public void bind(int portNumber) {
            mPortNumberTextView.setText(String.valueOf(portNumber));
        }

    }

    public class TransformerHolder extends RecyclerView.ViewHolder {

        public TransformerHolder(View itemView) {
            super(itemView);
        }
    }

}



