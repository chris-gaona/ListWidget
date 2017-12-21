package com.chrisgaona.listwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by chrisgaona on 12/21/17.
 */

public class WidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetAdapter(this);
    }
}
