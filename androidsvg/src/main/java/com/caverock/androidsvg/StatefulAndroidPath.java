package com.caverock.androidsvg;

import android.graphics.Path;

public class StatefulAndroidPath extends Path {

    public String pathString = "";

    public StatefulAndroidPath() {
    }

    public StatefulAndroidPath(StatefulAndroidPath src) {
        super(src);
        pathString = src.pathString;
    }

    @Override
    public void moveTo(float x, float y) {
        pathString += "M " + x + " " + y + " ";
        super.moveTo(x, y);
    }

    @Override
    public void lineTo(float x, float y) {
        pathString += "L " + x + " " + y + " ";
        super.lineTo(x, y);
    }

    @Override
    public void quadTo(float x1, float y1, float x2, float y2) {
        pathString += "Q " + x1 + " " + y1 + " " + x2 + " " + y2 + " ";
        super.quadTo(x1, y1, x2, y2);
    }

    @Override
    public void reset() {
        pathString = "";
        super.reset();
    }
}
