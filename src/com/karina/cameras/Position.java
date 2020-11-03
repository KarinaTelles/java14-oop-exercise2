package com.karina.cameras;

public class Position {
    protected int pan; /*Panning/horizontal/x*/
    protected int tilt;/*Tilting/vertical/y*/
    protected int zoom;/*Zoom/z*/

    public void setPan(int pan) {
        this.pan = pan;
    }

    public void setTilt(int tilt) {
        this.tilt = tilt;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    @Override
    public String toString(){
        return "Pan: " + pan + ". Tilt: " + tilt + ". Zoom: " + zoom +".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return pan == position.pan &&
                tilt == position.tilt &&
                zoom == position.zoom;
    }
}
