package com.hg.justparktest.model.response;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    private Integer id;
    private String url;
    private Double distance;
    private String title;
    private String customTitle;
    private Currency currency;
    private Double price;
    private Double priceHour;
    private Double priceDay;
    private Double priceWeek;
    private Integer priceMonth;
    private Double addressLat;
    private Double addressLng;
    private Integer reviewCount;
    private Integer reviewAverage;
    private String address1;
    private String address2;
    private String address3;
    private String postalCode;
    private String cancellationPolicy;
    private String cancellationPolicyType;
    private List<Facility> facilities = new ArrayList<Facility>();
    private IntegrationPartner integrationPartner;
    private Location location;
    private String category;
    private Integer quantity;
    private List<Object> review = new ArrayList<Object>();
    private List<Object> gallery = new ArrayList<Object>();
    private String description;
    private StreetviewData streetviewData;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The distance
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The customTitle
     */
    public String getCustomTitle() {
        return customTitle;
    }

    /**
     * 
     * @param customTitle
     *     The custom_title
     */
    public void setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The priceHour
     */
    public Double getPriceHour() {
        return priceHour;
    }

    /**
     * 
     * @param priceHour
     *     The price_hour
     */
    public void setPriceHour(Double priceHour) {
        this.priceHour = priceHour;
    }

    /**
     * 
     * @return
     *     The priceDay
     */
    public Double getPriceDay() {
        return priceDay;
    }

    /**
     * 
     * @param priceDay
     *     The price_day
     */
    public void setPriceDay(Double priceDay) {
        this.priceDay = priceDay;
    }

    /**
     * 
     * @return
     *     The priceWeek
     */
    public Double getPriceWeek() {
        return priceWeek;
    }

    /**
     * 
     * @param priceWeek
     *     The price_week
     */
    public void setPriceWeek(Double priceWeek) {
        this.priceWeek = priceWeek;
    }

    /**
     * 
     * @return
     *     The priceMonth
     */
    public Integer getPriceMonth() {
        return priceMonth;
    }

    /**
     * 
     * @param priceMonth
     *     The price_month
     */
    public void setPriceMonth(Integer priceMonth) {
        this.priceMonth = priceMonth;
    }

    /**
     * 
     * @return
     *     The addressLat
     */
    public Double getAddressLat() {
        return addressLat;
    }

    /**
     * 
     * @param addressLat
     *     The address_lat
     */
    public void setAddressLat(Double addressLat) {
        this.addressLat = addressLat;
    }

    /**
     * 
     * @return
     *     The addressLng
     */
    public Double getAddressLng() {
        return addressLng;
    }

    /**
     * 
     * @param addressLng
     *     The address_lng
     */
    public void setAddressLng(Double addressLng) {
        this.addressLng = addressLng;
    }

    /**
     * 
     * @return
     *     The reviewCount
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * 
     * @param reviewCount
     *     The review_count
     */
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    /**
     * 
     * @return
     *     The reviewAverage
     */
    public Integer getReviewAverage() {
        return reviewAverage;
    }

    /**
     * 
     * @param reviewAverage
     *     The review_average
     */
    public void setReviewAverage(Integer reviewAverage) {
        this.reviewAverage = reviewAverage;
    }

    /**
     * 
     * @return
     *     The address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * @param address1
     *     The address_1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 
     * @return
     *     The address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 
     * @param address2
     *     The address_2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * 
     * @return
     *     The address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 
     * @param address3
     *     The address_3
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The cancellationPolicy
     */
    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * 
     * @param cancellationPolicy
     *     The cancellation_policy
     */
    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    /**
     * 
     * @return
     *     The cancellationPolicyType
     */
    public String getCancellationPolicyType() {
        return cancellationPolicyType;
    }

    /**
     * 
     * @param cancellationPolicyType
     *     The cancellation_policy_type
     */
    public void setCancellationPolicyType(String cancellationPolicyType) {
        this.cancellationPolicyType = cancellationPolicyType;
    }

    /**
     * 
     * @return
     *     The facilities
     */
    public List<Facility> getFacilities() {
        return facilities;
    }

    /**
     * 
     * @param facilities
     *     The facilities
     */
    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    /**
     * 
     * @return
     *     The integrationPartner
     */
    public IntegrationPartner getIntegrationPartner() {
        return integrationPartner;
    }

    /**
     * 
     * @param integrationPartner
     *     The integration_partner
     */
    public void setIntegrationPartner(IntegrationPartner integrationPartner) {
        this.integrationPartner = integrationPartner;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The review
     */
    public List<Object> getReview() {
        return review;
    }

    /**
     * 
     * @param review
     *     The review
     */
    public void setReview(List<Object> review) {
        this.review = review;
    }

    /**
     * 
     * @return
     *     The gallery
     */
    public List<Object> getGallery() {
        return gallery;
    }

    /**
     * 
     * @param gallery
     *     The gallery
     */
    public void setGallery(List<Object> gallery) {
        this.gallery = gallery;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The streetviewData
     */
    public StreetviewData getStreetviewData() {
        return streetviewData;
    }

    /**
     * 
     * @param streetviewData
     *     The streetview_data
     */
    public void setStreetviewData(StreetviewData streetviewData) {
        this.streetviewData = streetviewData;
    }

}
