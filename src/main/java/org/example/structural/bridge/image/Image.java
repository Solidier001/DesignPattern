package org.example.structural.bridge.image;

import org.example.structural.bridge.imgPainter.ImagePainter;
import org.example.structural.bridge.imgPainter.Matrix;

public abstract class Image {

    protected ImagePainter imagePainter;

    public void setImagePainter(ImagePainter imagePainter) {
        this.imagePainter = imagePainter;
    }

    public abstract Matrix parseFile(String fileName);

}
