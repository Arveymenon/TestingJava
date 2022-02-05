package Concepts.Abstraction.Abstract;
// import Concepts.Abstraction.Enums.Units;
import Concepts.Abstraction.Enums.Units;

public abstract class Storage {
    protected String name;
    protected int size;
    protected String type;
    protected String units;

    public abstract Storage setName(String name);
    public abstract Storage setSize(int size, Units units, String type);

    public abstract void printDetails();
}