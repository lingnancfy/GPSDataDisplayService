package com.icbc.dataDisplayService.bean;

import java.io.Serializable;

public class GPS implements Serializable {
    private int gpsid;
    private String time;
    private String longitude;
    private String latitude;
    private String bearing;
    private String distance;

    public void setGpsid(int gpsid) {
        this.gpsid = gpsid;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setBearing(String bearing) {
        this.bearing = bearing;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getGpsid() {
        return gpsid;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getTime() {
        return time;
    }

    public String getBearing() {
        return bearing;
    }

    public String getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(100);
        buf.append("{gpsid:");
        buf.append(gpsid);
        buf.append(", ");
        buf.append("time:");
        buf.append(time);
        buf.append(", ");
        buf.append("longitude:");
        buf.append(longitude);
        buf.append(", ");
        buf.append("latitude:");
        buf.append(latitude);
        buf.append(", ");
        buf.append("bearing:");
        buf.append(bearing);
        buf.append(", ");
        buf.append("distance:");
        buf.append(distance);
        buf.append("}");
        return buf.toString();
    }
}
