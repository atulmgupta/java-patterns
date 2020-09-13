package com.atul.java.patterns._2_structural.facade;
import java.io.File;

import com.atul.java.patterns._2_structural.proxy.VideoFile;
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
