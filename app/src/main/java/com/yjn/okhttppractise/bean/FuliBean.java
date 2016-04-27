package com.yjn.okhttppractise.bean;

import java.util.List;

/**
 * Author:0027008122 [yang.jianan@zte.com.cn]
 * Date:2016-04-27
 * Time:15:36
 * Version:1.0
 * TaskId:
 */
public class FuliBean {

    /**
     * error : false
     * results : [{"_id":"5720370967765974fbfcf992","createdAt":"2016-04-27T11:50:33.254Z","desc":"在线 JSON 转 POJO ，超简单实用","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/joelittlejohn/jsonschema2pojo","used":true,"who":"mthli"},{"_id":"571f76e967765974fca8308e","createdAt":"2016-04-26T22:10:49.704Z","desc":"Android平台室内地图控件MapView","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/onlylemi/MapView","used":true,"who":"onlylemi"},{"_id":"571f769a67765974fbfcf985","createdAt":"2016-04-26T22:09:30.446Z","desc":"CursorWheelLayout","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/BCsl/CursorWheelLayout","used":true,"who":"onlylemi"},{"_id":"571f764967765974fca8308d","createdAt":"2016-04-26T22:08:09.994Z","desc":"A list of useful Java frameworks","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/Vedenin/useful-java-links","used":true,"who":"onlylemi"},{"_id":"571f728167765974fbfcf982","createdAt":"2016-04-26T21:52:01.759Z","desc":"详细的介绍了git和github的使用和git工作流的分类。","publishedAt":"2016-04-27T12:04:15.19Z","source":"web","type":"Android","url":"http://blog.jobbole.com/76843/","used":true,"who":null},{"_id":"571ed93567765974f5e27e14","createdAt":"2016-04-26T10:57:57.79Z","desc":"Android App的设计架构：MVC,MVP,MVVM与架构经验谈","publishedAt":"2016-04-26T11:58:55.460Z","source":"web","type":"Android","url":"https://www.sdk.cn/news/2501","used":true,"who":null},{"_id":"571e396f67765974fbfcf979","createdAt":"2016-04-25T23:36:15.705Z","desc":"FragmentAnimation","publishedAt":"2016-04-26T11:58:55.460Z","source":"chrome","type":"Android","url":"https://github.com/kakajika/FragmentAnimations","used":true,"who":"Jason"},{"_id":"571e158467765974fbfcf975","createdAt":"2016-04-25T21:03:00.108Z","desc":"RxJoke:RxJava+MVP的开源项目-幼苗项目","publishedAt":"2016-04-26T11:58:55.460Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/9430eca553a5","used":true,"who":null},{"_id":"571dbc6c67765974f5e27e06","createdAt":"2016-04-25T14:42:52.739Z","desc":"A collections of tips in Android developing","publishedAt":"2016-04-26T11:58:55.460Z","source":"chrome","type":"Android","url":"https://github.com/JohnTsaiAndroid/AndroidTips#genymotion","used":true,"who":"蒋朋"},{"_id":"571db47067765974fca8307b","createdAt":"2016-04-25T14:08:48.71Z","desc":"An event bus designed to allowing your application to communicate efficiently.","publishedAt":"2016-04-26T11:58:55.460Z","source":"web","type":"Android","url":"https://github.com/AndroidKnife/RxBus","used":true,"who":"HwangJR"}]
     */

    private boolean error;
    /**
     * _id : 5720370967765974fbfcf992
     * createdAt : 2016-04-27T11:50:33.254Z
     * desc : 在线 JSON 转 POJO ，超简单实用
     * publishedAt : 2016-04-27T12:04:15.19Z
     * source : chrome
     * type : Android
     * url : https://github.com/joelittlejohn/jsonschema2pojo
     * used : true
     * who : mthli
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
