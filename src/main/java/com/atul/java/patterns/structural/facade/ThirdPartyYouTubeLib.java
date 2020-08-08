package com.atul.java.patterns.structural.facade;

import com.atul.java.patterns.structural.proxy.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}