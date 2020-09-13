package com.atul.java.patterns._2_structural._5_facade;

import java.util.HashMap;

import com.atul.java.patterns._2_structural._7_proxy.Video;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}