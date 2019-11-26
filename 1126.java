interface Shape{
  abstract Double getArea();
}
class Rectangle implements Shape{
  double length;
  double width;
  public Rectangle(double len,double wid){
    length=len;
    width=wid;
  }
 public String toString(){

 } 
  public double getArea(){
     System.out.println( "area=" + length*width);
  }
}

class Triangle implements Shape{
  double base;
  double height;
  public Triangle(double b,double h){
    base=b;
    height=h;
  }
  public String toString(){
    
 }  
  public double getArea(){
    System.out.println( "area=" + base*height/2);
  }
}
public class 1126{
  public static void main(String args[]){
    Rectangle rec=new Rectangle(4,5);
    Triangle tri=new Triangle(4,5);
    rec.getArea();
    tri.getArea();
}
