package com.feeling.storage.abstractinterface;

public class HardStorage implements IMobileStorage {
    @Override
    public void write() {
        System.out.println("Insert Data To HardStorage!");
    }

    @Override
    public void read() {
        System.out.println("Select Data From HardStorage!");
    }
}
