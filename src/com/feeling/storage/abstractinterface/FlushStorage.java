package com.feeling.storage.abstractinterface;

public class FlushStorage implements IMobileStorage {
    @Override
    public void write() {
        System.out.println("Insert Data To FlushStorage!");
    }

    @Override
    public void read() {
        System.out.println("Select Data From FlushStorage!");
    }
}
