public interface Shape {

    public String getName();
    public int getNumberSides();
    public int getPerimeter();

    public void setName(String name);
    public void setNumberSides(int numberSides);
    public void setPerimeter(int perimeter);

    public default String extra(){
        return "Extra";
    }
}