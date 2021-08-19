package com.example.video.bean;

import java.util.List;

public class QueryResponse {
    private String code; // 结果代码
    private String desc; // 结果描述
    private List<VideoInfo> videoList; // 在线视频的路径列表

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setVideoList(List<VideoInfo> videoList) {
        this.videoList = videoList;
    }

    public List<VideoInfo> getVideoList() {
        return this.videoList;
    }
}
