public interface Shape {

    public static String someText = setSomeText();
    
    public String getName();
    public int getNumberSides();
    public int getPerimeter();

    public void setName(String name);
    public void setNumberSides(int numberSides);
    public void setPerimeter(int perimeter);

    public default String setSomeText(String text){
        return text;
    };

    public default String extra(){
        return someText;
    }
}