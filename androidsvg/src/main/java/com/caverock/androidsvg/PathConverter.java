package com.caverock.androidsvg;

import android.graphics.Path;

/*
 *  Convert an internal PathDefinition to an android.graphics.Path object
 */
public class PathConverter implements PathInterface {
    android.graphics.Path path = new android.graphics.Path();
    float lastX, lastY;

    public PathConverter(PathDefinition pathDef) {
        if (pathDef == null)
            return;
        pathDef.enumeratePath(this);
    }

    public Path getPath() {
        return path;
    }

    @Override
    public void moveTo(float x, float y) {
        path.moveTo(x, y);
        lastX = x;
        lastY = y;
    }

    @Override
    public void lineTo(float x, float y) {
        path.lineTo(x, y);
        lastX = x;
        lastY = y;
    }

    @Override
    public void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        path.cubicTo(x1, y1, x2, y2, x3, y3);
        lastX = x3;
        lastY = y3;
    }

    @Override
    public void quadTo(float x1, float y1, float x2, float y2) {
        path.quadTo(x1, y1, x2, y2);
        lastX = x2;
        lastY = y2;
    }

    @Override
    public void arcTo(float rx, float ry, float xAxisRotation, boolean largeArcFlag, boolean sweepFlag, float x, float y) {
        SVGAndroidRenderer.arcTo(lastX, lastY, rx, ry, xAxisRotation, largeArcFlag, sweepFlag, x, y, this);
        lastX = x;
        lastY = y;
    }

    @Override
    public void close() {
        path.close();
    }

}
