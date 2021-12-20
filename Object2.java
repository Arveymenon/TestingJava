public class Object2 implements Shape{
    
    private String name = new String();
    private int numberSides;
    private int perimeter;

    public String getName() {
        return this.name;
    }

    public int getNumberSides() {
        return this.numberSides;
    }

    public int getPerimeter() {
        return this.perimeter;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumberSides(int numberSides) {
        this.numberSides = numberSides;
    }
    
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
