package org.example.creational.simplefactory;

import java.lang.reflect.Constructor;

public class Factory {
    public Video getVideo(Class c){
        Video video = null;
        try {
            Constructor<Video> constructor= c.getDeclaredConstructor();
            video=constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }finally {
            return video;
        }
    }

    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
