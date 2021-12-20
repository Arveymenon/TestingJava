public class entrypoint extends Object1{
    
    entrypoint(String name, int numberSides, int perimeter) {
        super(name, numberSides, perimeter);
    }

    public static void main(String[] args) {
        Object1 shape = new Object1("test", 4, 20);

        // Object1 shape = new Object2("test", 4, 20);
        // shape.setName("Rectangle");
    
        // shape.setNumberSides(4);
        // shape.setPerimeter(20);
    
        System.out.println("Shape: "+ shape.getName());
        System.out.println("Number Of Sides: "+shape.getNumberSides());
        System.out.println("Perimeter: " + shape.getPerimeter());

        System.out.println("Extra: " + shape.extra());
    }
}