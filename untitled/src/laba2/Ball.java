package laba2;

public class Ball {
    private String color;
    private String size;
    public  Ball(String color, String size){
        this.color = color;
        this.size = size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public String toString(){
        return ("Size : " + size +"\nColor : " + this.color );
    }
}

