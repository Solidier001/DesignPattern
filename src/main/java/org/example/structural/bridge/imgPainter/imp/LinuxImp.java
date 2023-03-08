package org.example.structural.bridge.imgPainter.imp;

import org.example.structural.bridge.imgPainter.ImagePainter;
import org.example.structural.bridge.imgPainter.Matrix;

public class LinuxImp implements ImagePainter {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Linux Image");
    }
}
