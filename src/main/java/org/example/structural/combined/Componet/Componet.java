package org.example.structural.combined.Componet;

public abstract class Componet {
    public abstract void add(Componet componet);
    public abstract void remove(Componet componet);
    public abstract Componet getChild(int i);
    public abstract void killVirus();
}
