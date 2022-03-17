package com.appme.story.engine.app.fragments;

import android.content.Context;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;


import com.appme.story.R;
import com.appme.story.engine.app.commons.fragments.MaterialAboutFragment;
import com.appme.story.engine.app.models.MaterialAboutActionItem;
import com.appme.story.engine.app.models.MaterialAboutItem;
import com.appme.story.engine.app.models.MaterialAboutItemOnClickAction;
import com.appme.story.engine.app.commons.MaterialAboutCard;
import com.appme.story.engine.app.commons.MaterialAboutList;
import com.appme.story.engine.app.commons.AboutMe;

public class AboutFragment extends MaterialAboutFragment {


    @Override
    protected MaterialAboutList getMaterialAboutList(final Context c) {
        MaterialAboutList list = AboutMe.createMaterialAboutList(c, R.color.mal_color_icon_dark_theme);
       
        return list;
    }

    @Override
    protected int getTheme() {
        return R.style.AppTheme_MaterialAboutActivity_Fragment;
    }
}
