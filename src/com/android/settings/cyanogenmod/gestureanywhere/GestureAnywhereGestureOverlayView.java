/*
 * Copyright (C) 2013 The ChameleonOS Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.cyanogenmod.gestureanywhere;

import android.content.Context;
import android.gesture.GestureOverlayView;
import android.util.AttributeSet;
import com.android.internal.logging.MetricsLogger;

public class GestureAnywhereGestureOverlayView extends GestureOverlayView {
    public GestureAnywhereGestureOverlayView(Context context) {
        this(context, null);
    }

    public GestureAnywhereGestureOverlayView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override
    protected int getMetricsCategory() {
        // todo add a constant in MetricsLogger.java
        return MetricsLogger.MAIN_SETTINGS;
    }

    public GestureAnywhereGestureOverlayView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mClearPerformedGesture = false;
    }
}
