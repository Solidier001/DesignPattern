package org.example.structural.bridge;

import org.example.structural.bridge.image.Image;
import org.example.structural.bridge.imgPainter.ImagePainter;

public class Client {

    public static void main(String[] args) {Image image;
        ImagePainter imp;
        image = (Image)XMLUtil.getBean("image");
        imp = (ImagePainter)XMLUtil.getBean("os");
        image.setImagePainter(imp);
        image.parseFile("小龙女");
    }

}
