package Concepts.Abstraction;

import Concepts.Abstraction.Abstract.Storage;
import Concepts.Abstraction.Enums.Units;

public class CorsairX1 extends Storage{
    public CorsairX1(){
        System.out.println("CorsairX1 loaded");
        this.setName("CorsairX1").setSize(32, "TB", "HDD");
    }

    @Override
    public CorsairX1 setName(String name){
        this.name = name;
        return this;
    }

    @Override
    public CorsairX1 setSize (int size, Units units, String type) {
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
