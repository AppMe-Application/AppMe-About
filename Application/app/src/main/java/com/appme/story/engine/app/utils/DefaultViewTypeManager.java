package com.appme.story.engine.app.utils;

import android.content.Context;
import android.view.View;

import com.appme.story.engine.app.adapters.holders.MaterialAboutItemViewHolder;
import com.appme.story.engine.app.models.MaterialAboutActionItem;
import com.appme.story.engine.app.models.MaterialAboutItem;
import com.appme.story.engine.app.models.MaterialAboutTitleItem;

import static com.appme.story.engine.app.utils.DefaultViewTypeManager.ItemLayout.ACTION_LAYOUT;
import static com.appme.story.engine.app.utils.DefaultViewTypeManager.ItemLayout.TITLE_LAYOUT;
import static com.appme.story.engine.app.utils.DefaultViewTypeManager.ItemType.ACTION_ITEM;
import static com.appme.story.engine.app.utils.DefaultViewTypeManager.ItemType.TITLE_ITEM;

public class DefaultViewTypeManager extends ViewTypeManager {

    public static final class ItemType {
        public static final int ACTION_ITEM = ViewTypeManager.ItemType.ACTION_ITEM;
        public static final int TITLE_ITEM = ViewTypeManager.ItemType.TITLE_ITEM;
    }

    public static final class ItemLayout {
        public static final int ACTION_LAYOUT = ViewTypeManager.ItemLayout.ACTION_LAYOUT;
        public static final int TITLE_LAYOUT = ViewTypeManager.ItemLayout.TITLE_LAYOUT;
    }

    public int getLayout(int itemType) {
        switch (itemType) {
            case ACTION_ITEM:
                return ACTION_LAYOUT;
            case TITLE_ITEM:
                return TITLE_LAYOUT;
            default:
                return -1;
        }
    }

    public MaterialAboutItemViewHolder getViewHolder(int itemType, View view) {
        switch (itemType) {
            case ACTION_ITEM:
                return MaterialAboutActionItem.getViewHolder(view);
            case TITLE_ITEM:
                return MaterialAboutTitleItem.getViewHolder(view);
            default:
                return null;
        }
    }

    public void setupItem(int itemType, MaterialAboutItemViewHolder holder, MaterialAboutItem item, Context context) {
        switch (itemType) {
            case ACTION_ITEM:
                MaterialAboutActionItem.setupItem((MaterialAboutActionItem.MaterialAboutActionItemViewHolder) holder, (MaterialAboutActionItem) item, context);
                break;
            case TITLE_ITEM:
                MaterialAboutTitleItem.setupItem((MaterialAboutTitleItem.MaterialAboutTitleItemViewHolder) holder, (MaterialAboutTitleItem) item, context);
                break;
        }
    }
}
