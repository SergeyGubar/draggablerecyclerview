package com.example.sgubar.draggableview.model;

/**
 * Created by sgubar on 11/24/17.
 */

public class Hub {
    private static final Hub ourInstance = new Hub();

    public static Hub getInstance() {
        return ourInstance;
    }

    private Hub() {
    }
}
