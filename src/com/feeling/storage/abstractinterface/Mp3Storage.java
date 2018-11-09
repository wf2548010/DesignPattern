package com.feeling.storage.abstractinterface;

public class Mp3Storage implements IMobileStorage {
    @Override
    public void write() {
        System.out.println("Insert Data To Mp3Storage!");
    }

    @Override
    public void read() {
        System.out.println("Select Data From Mp3Storage!");
    }

    public void play(){
        System.out.println("Mp3 Play Music!");
    }
}
