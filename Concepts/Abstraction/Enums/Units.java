package Concepts.Abstraction.Enums;

public enum Units {
    BITS,
    BYTES,
    KB,
    MB,
    GB,
    TB;

    Units(){}

    public int convertDown(int size, int by){
        return (size*1024*by);
    }

    public int convertUp(int size, int by){
        return (size/(1024*by));
    }
}
