
package com.hg.justparktest.model.response;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    private Double locationLat;
    private Integer locationLng;
    private Integer total;
    private Integer start;
    private Integer perPage;
    private Object previous;
    private String next;

    /**
     * 
     * @return
     *     The locationLat
     */
    public Double getLocationLat() {
        return locationLat;
    }

    /**
     * 
     * @param locationLat
     *     The location_lat
     */
    public void setLocationLat(Double locationLat) {
        this.locationLat = locationLat;
    }

    /**
     * 
     * @return
     *     The locationLng
     */
    public Integer getLocationLng() {
        return locationLng;
    }

    /**
     * 
     * @param locationLng
     *     The location_lng
     */
    public void setLocationLng(Integer locationLng) {
        this.locationLng = locationLng;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The start
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * 
     * @param perPage
     *     The per_page
     */
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * 
     * @return
     *     The previous
     */
    public Object getPrevious() {
        return previous;
    }

    /**
     * 
     * @param previous
     *     The previous
     */
    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    /**
     * 
     * @return
     *     The next
     */
    public String getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    public void setNext(String next) {
        this.next = next;
    }

}
