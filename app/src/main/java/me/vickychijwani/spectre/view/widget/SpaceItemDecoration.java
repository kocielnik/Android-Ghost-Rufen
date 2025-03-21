package me.vickychijwani.spectre.view.widget;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    private final int horizontal;
    private final int vertical;

    public SpaceItemDecoration(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.top = vertical;
        outRect.left = horizontal;
        outRect.right = horizontal;
        outRect.bottom = vertical;
    }

}
