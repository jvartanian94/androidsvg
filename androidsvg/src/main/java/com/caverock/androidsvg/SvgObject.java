package com.caverock.androidsvg;

// Any object that can be part of the tree
public class SvgObject {
    SVG document;
    SvgContainer parent;

    public String toString() {
        return this.getClass().getSimpleName();
        //return super.toString();
    }
}
