package com.hg.justparktest.model.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hurman on 17/07/2016.
 */
public class SearchParameters {

    @SerializedName("near")
    private Near near;

    public Near getNear() {
        return near;
    }

    public void setNear(Near near) {
        this.near = near;
    }
}
