package com.owlsdepartment.plugin.android.insets;

import android.util.DisplayMetrics;
import androidx.appcompat.app.AppCompatActivity;

public class AndroidInsets {

    private AppCompatActivity activity;

    public AndroidInsets(AppCompatActivity activity) {
        this.activity = activity;
    }

    public float getTop() {
        DisplayMetrics metrics = this.activity.getResources().getDisplayMetrics();
        int resourceId = this.activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        float titleBarHeight = 0;

        if (resourceId > 0) {
            titleBarHeight = this.activity.getResources().getDimensionPixelSize(resourceId);
        }

        return titleBarHeight / metrics.density;
    }
}
