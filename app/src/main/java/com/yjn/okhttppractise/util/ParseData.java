package com.yjn.okhttppractise.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yjn.okhttppractise.bean.FuliBean;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:0027008122 [yang.jianan@zte.com.cn]
 * Date:2016-04-27
 * Time:15:38
 * Version:1.0
 * TaskId:
 */
public class ParseData {
    String result;
    public ParseData(String result) {
        this.result = result;
    }

    public List parseResponse(String result) {

        List<FuliBean> list = null;
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(result);
            Gson gson = new Gson();
            list = gson.fromJson(
                    jsonObject.getString("results"),
                    new TypeToken<List<FuliBean>>() {
                    }.getType());
        } catch (JSONException e) {
            e.printStackTrace();
            list = new ArrayList<>();
        }
        return list;
    }

}
