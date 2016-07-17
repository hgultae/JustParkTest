
package com.hg.justparktest.model.response;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StreetviewData {

    private Double lat;
    private Integer heading;
    private Integer zoom;
    private Double lng;
    private Integer pitch;

    /**
     * 
     * @return
     *     The lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The heading
     */
    public Integer getHeading() {
        return heading;
    }

    /**
     * 
     * @param heading
     *     The heading
     */
    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    /**
     * 
     * @return
     *     The zoom
     */
    public Integer getZoom() {
        return zoom;
    }

    /**
     * 
     * @param zoom
     *     The zoom
     */
    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The pitch
     */
    public Integer getPitch() {
        return pitch;
    }

    /**
     * 
     * @param pitch
     *     The pitch
     */
    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

}
