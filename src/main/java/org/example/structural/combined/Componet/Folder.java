package org.example.structural.combined.Componet;

import java.util.ArrayList;

public class Folder extends Componet{

    private String folderName;

    private ArrayList<Componet> componets=new ArrayList();

    @Override
    public void add(Componet componet) {
        componets.add(componet);
    }

    @Override
    public void remove(Componet componet) {
        componet.remove(componet);
    }

    @Override
    public Componet getChild(int i) {
        return componets.get(i);
    }

    @Override
    public void killVirus() {
        for (Componet componet:componets)
            componet.killVirus();
        System.out.println("Folder:"+folderName+"kill virus");
    }
}
