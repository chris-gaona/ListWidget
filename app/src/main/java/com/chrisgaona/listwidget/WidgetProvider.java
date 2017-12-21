package com.chrisgaona.listwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

/**
 * Created by chrisgaona on 12/21/17.
 */

public class WidgetProvider extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // app widget provider is a broadcast receiver
        for (int id : appWidgetIds) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget);
            appWidgetManager.updateAppWidget(id, remoteViews);
        }
    }
}
