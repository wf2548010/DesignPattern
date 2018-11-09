package com.feeling.storage.abstractinterface;

public class Computer {
    IMobileStorage i;

    public Computer() {
    }

    public Computer(IMobileStorage i) {
        this.i = i;
    }

    public IMobileStorage getI() {
        return i;
    }

    public void setI(IMobileStorage i) {
        this.i = i;
    }

    public void writeData(){
        i.write();
    }

    public void readData(){
        i.read();
    }

}
