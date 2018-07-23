package com.caverock.androidsvg;

import java.util.List;

// Any object in the tree that corresponds to an SVG element
public class SvgElementBase extends SvgObject {
    public String id = null;
    public Boolean spacePreserve = null;
    public Style baseStyle = null;   // style defined by explicit style attributes in the element (eg. fill="black")
    public Style style = null;       // style expressed in a 'style' attribute (eg. style="fill:black")
    public List<String> classNames = null;  // contents of the 'class' attribute
}
