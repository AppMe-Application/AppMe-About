package com.appme.story.engine.app.commons;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.content.ContextCompat;

import com.appme.story.R;
import com.appme.story.engine.app.models.MaterialAboutActionItem;
import com.appme.story.engine.app.models.MaterialAboutItemOnClickAction;
import com.appme.story.engine.app.models.MaterialAboutTitleItem;
import com.appme.story.engine.app.commons.ConvenienceBuilder;
import com.appme.story.engine.app.commons.MaterialAboutCard;
import com.appme.story.engine.app.commons.MaterialAboutList;
import com.appme.story.engine.app.utils.OpenSourceLicense;

public class AboutMe {

    public static MaterialAboutList createMaterialAboutList(final Context c, final int colorIcon) {
        MaterialAboutCard.Builder appCardBuilder = new MaterialAboutCard.Builder();

        // Add items to card

        appCardBuilder.addItem(new MaterialAboutTitleItem.Builder()
                               .text("AppMe")
                               .desc("© 2017 AppMe Application")
                               .icon(R.mipmap.ic_launcher)
                               .build());

        appCardBuilder.addItem(ConvenienceBuilder.createVersionActionItem(c,
                                                                          c.getDrawable(R.drawable.ic_information_outline),
                                                                          "Version",
                                                                          false));

        /*appCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                               .text("Changelog")
                               .icon(R.drawable.ic_history)
                               .setOnClickAction(ConvenienceBuilder.createWebViewDialogOnClickAction(c, "Releases", "https://github.com/daniel-stoneuk/material-about-library/releases", true, false))
                               .build());*/

        appCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                               .text("Source Code")
                               .icon(R.drawable.ic_code_tags)
                               .setOnClickAction(new MaterialAboutItemOnClickAction() {
                                       @Override
                                       public void onClick() {
                                           
                                       }
                                   })
                               .build());

        MaterialAboutCard.Builder authorCardBuilder = new MaterialAboutCard.Builder();
        authorCardBuilder.title("Author");
//        authorCardBuilder.titleColor(ContextCompat.getColor(c, R.color.colorAccent));

        authorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                                  .text("AsepMo")
                                  .subText("Indonesia")
                                  .icon(R.drawable.ic_account)                               
                                  .build());

        authorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                                  .text("Follow on GitHub")
                                  .icon(R.drawable.ic_github)                             
                                  .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(c, Uri.parse("https://github.com/AsepMo")))
                                  .build());

        authorCardBuilder.addItem(ConvenienceBuilder.createEmailItem(c,
                                                                     c.getDrawable(R.drawable.ic_email),
                                                                     "Email",
                                                                     true,
                                                                     "appme.story@gmail.com",
                                                                     "Send Feedback"));
        
        MaterialAboutCard.Builder convenienceCardBuilder = new MaterialAboutCard.Builder();

        convenienceCardBuilder.title("Share & Feedback");
        convenienceCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                                       .text("Share this app")
                                       .icon(R.drawable.ic_share)
                                       .setOnClickAction(new MaterialAboutItemOnClickAction() {
                                               @Override
                                               public void onClick() {

                                               }
                                           })
                                       .build());
        convenienceCardBuilder.addItem(ConvenienceBuilder.createEmailItem(c, c.getDrawable(R.drawable.ic_email), "Send feedback", true, "appme.story@gmail.com",  "Question About AppMe"));                                                                                                                                                                                                                                                                                                
                                                                             
        /*MaterialAboutCard.Builder otherCardBuilder = new MaterialAboutCard.Builder();
        otherCardBuilder.title("Other");

        otherCardBuilder.cardColor(Color.parseColor("#7986CB"));

        otherCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                                 .text("HTML Formatted Sub Text")
                                 .subTextHtml("This is <b>HTML</b> formatted <i>text</i> <br /> This is very cool because it allows lines to get very long which can lead to all kinds of possibilities. <br /> And line breaks. <br /> Oh and by the way, this card has a custom defined background.")                      
                                 .icon(R.drawable.ic_language_html5)
                                 .setIconGravity(MaterialAboutActionItem.GRAVITY_TOP)
                                 .build());*/


        return new MaterialAboutList(appCardBuilder.build(), authorCardBuilder.build(), convenienceCardBuilder.build());
    }

    public static MaterialAboutList createMaterialAboutLicenseList(final Context c, int colorIcon) {

        MaterialAboutCard materialAboutLIbraryLicenseCard = ConvenienceBuilder.createLicenseCard(c,
                                                                                                 c.getDrawable(R.drawable.ic_book),
                                                                                                 "material-about-library", "2016", "Daniel Stone",
                                                                                                 OpenSourceLicense.APACHE_2);

        MaterialAboutCard androidIconicsLicenseCard = ConvenienceBuilder.createLicenseCard(c,
                                                                                           c.getDrawable(R.drawable.ic_book),
                                                                                           "Android Iconics", "2016", "Mike Penz",
                                                                                           OpenSourceLicense.APACHE_2);

        MaterialAboutCard leakCanaryLicenseCard = ConvenienceBuilder.createLicenseCard(c,
                                                                                       c.getDrawable(R.drawable.ic_book),
                                                                                       "LeakCanary", "2015", "Square, Inc",
                                                                                       OpenSourceLicense.APACHE_2);

        MaterialAboutCard mitLicenseCard = ConvenienceBuilder.createLicenseCard(c,
                                                                                c.getDrawable(R.drawable.ic_book),
                                                                                "MIT Example", "2017", "Matthew Ian Thomson",
                                                                                OpenSourceLicense.MIT);

        MaterialAboutCard gplLicenseCard = ConvenienceBuilder.createLicenseCard(c,
                                                                                c.getDrawable(R.drawable.ic_book),
                                                                                "GPL Example", "2017", "George Perry Lindsay",
                                                                                OpenSourceLicense.GNU_GPL_3);

        return new MaterialAboutList(materialAboutLIbraryLicenseCard,
                                     androidIconicsLicenseCard,
                                     leakCanaryLicenseCard,
                                     mitLicenseCard,
                                     gplLicenseCard);
    }
}

