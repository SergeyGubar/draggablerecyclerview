package com.example.sgubar.draggableview.adapters;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.sgubar.draggableview.adapters.DevicesRecyclerAdapter;
import com.example.sgubar.draggableview.adapters.ItemTouchHelperAdapter;

/**
 * Created by sgubar on 11/21/17.
 */

public class ItemTouchHelperSampleCallback extends ItemTouchHelper.Callback{
    // Used to notify the adapter, that the drag occured, and the data should be changed
    private final ItemTouchHelperAdapter mAdapter;


    public ItemTouchHelperSampleCallback(ItemTouchHelperAdapter adapter) {
        mAdapter = adapter;
    }

    // Define our directions. Swipe flags can be ommited, because we don't implement this feature
    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
        int swipeFlags = ItemTouchHelper.START | ItemTouchHelper.END;

        if (viewHolder.getItemViewType() == DevicesRecyclerAdapter.TYPE_NOT_EMPTY) {
            return makeMovementFlags(dragFlags, swipeFlags);
        } else {
            return 0;
        }
    }

    // Nope, we're not swapping :)
    @Override
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        // We don't support swiping, but this callback must be overriden
    }

    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        if (viewHolder.getItemViewType() == DevicesRecyclerAdapter.TYPE_EMPTY) {
            return false;
        } else {
            mAdapter.onItemMove(viewHolder.getAdapterPosition(),
                    target.getAdapterPosition());
            return true;
        }
    }

}
