package org.example.structural.combined.Componet;

public class Leaf extends Componet {

    private String fileName;

    public Leaf(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void add(Componet componet) {
        System.out.println("方法不支持");
    }

    @Override
    public void remove(Componet componet) {
        System.out.println("方法不支持");
    }

    @Override
    public Componet getChild(int i) {
        System.out.println("方法不支持");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println(fileName+"kill virus");
    }
}
