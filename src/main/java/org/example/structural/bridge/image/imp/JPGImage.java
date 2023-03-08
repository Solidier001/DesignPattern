package org.example.structural.bridge.image.imp;

import org.example.structural.bridge.image.Image;
import org.example.structural.bridge.imgPainter.Matrix;

public class JPGImage extends Image {
    @Override
    public Matrix parseFile(String fileName) {
        System.out.println(fileName+"is a jpg");
        Matrix matrix=new Matrix();
        imagePainter.doPaint(matrix);
        return null;
    }
}
