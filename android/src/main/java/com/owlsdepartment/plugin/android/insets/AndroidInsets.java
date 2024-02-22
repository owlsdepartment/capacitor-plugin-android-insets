package com.owlsdepartment.plugin.android.insets;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.appcompat.app.AppCompatActivity;

public class AndroidInsets {

    private AppCompatActivity activity;

    public AndroidInsets(AppCompatActivity activity) {
        this.activity = activity;
    }

    public float getTop() {
        Resources resources = this.activity.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        float titleBarHeight = 0;

        if (resourceId > 0) {
            titleBarHeight = resources.getDimensionPixelSize(resourceId);
        }

        return titleBarHeight / metrics.density;
    }

    public float getBottom() {
        Resources resources = this.activity.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        int resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        float navigationBarHeight = 0;

        if (resourceId > 0) {
            navigationBarHeight = resources.getDimensionPixelSize(resourceId);
        }

        return navigationBarHeight / metrics.density;
    }
}
