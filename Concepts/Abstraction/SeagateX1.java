package Concepts.Abstraction;

import Concepts.Abstraction.Abstract.Storage;
import Concepts.Abstraction.Enums.Units;

public class SeagateX1 extends Storage {
    public SeagateX1(){
        System.out.println("SeagateX1 loaded");
        this.setName("SeagateX1").setSize(20, "TB", "SSD");
    }

    @Override
    public SeagateX1 setName(String name){
        this.name = name;
        return this;
    }
    
    @Override
    public SeagateX1 setSize (int size, Units units, String type) {
        this.size = size;
        this.type = type;
        this.units = units;
        return this;
    }

    @Override
    public void printDetails(){
        System.out.println("Size:"+ this.size+" "+this.units+" "+this.type);
    }
}