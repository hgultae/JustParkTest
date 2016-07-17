package com.hg.justparktest.webservice;

import com.hg.justparktest.model.request.Near;
import com.hg.justparktest.model.response.ResponseData;
import com.hg.justparktest.utils.Constants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Hurman on 17/07/2016.
 */
public interface IWebService {

    @POST(Constants.REGION_SEARCH)
    Call<ResponseData> performRegionSearch(@Body Near near);

}
