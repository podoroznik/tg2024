package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class QuickShare  extends View {

    private final Theme.ResourcesProvider resourcesProvider;
    private float animationProgress = 0f;

    public QuickShare(Context context, ViewGroup parent, Theme.ResourcesProvider resourcesProvider) {
        super(context);

        setBackground(Theme.createServiceDrawable(AndroidUtilities.dp(18), this, parent, getThemedPaint(Theme.key_paint_chatActionBackground)));

        this.resourcesProvider = resourcesProvider;
    }

    private Paint getThemedPaint(String paintKey) {
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(paintKey) : null;
        return paint != null ? paint : Theme.getThemePaint(paintKey);
    }

}
