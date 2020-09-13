package com.atul.java.patterns._2_structural._5_facade;
import java.io.File;

import com.atul.java.patterns._2_structural._7_proxy.VideoFile;
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
