package com.atul.java.patterns._2_structural.facade;

import java.io.File;

import com.atul.java.patterns._2_structural.proxy.VideoConversionFacade;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
