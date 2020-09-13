package com.atul.java.patterns._2_structural.facade;

import java.util.HashMap;

import com.atul.java.patterns._2_structural.proxy.Video;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}