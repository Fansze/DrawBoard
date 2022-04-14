package com.example.myapplication;

import android.graphics.Paint;
import android.graphics.Path;

public class DrawPath {
    android.graphics.Path mpath;
    Paint mpaint;

    public Path getMpath() {
        return mpath;
    }

    public Paint getMpaint() {
        return mpaint;
    }

    public void setMpaint(Paint mpaint) {
        this.mpaint = mpaint;
    }

    public void setMpath(Path mpath) {
        this.mpath = mpath;
    }
}
