interface Shape{
  abstract Double getArea();
}
class Rectangle implements Shape{
  double length;
  double width;
  public Rectangle(double len,double wid){
    length =len;
    width=wid;
  }
 public String toString(){

 } 
  public Double getArea(){
     System.out.println( "area=" + length*width);
  }
}

class Triangle implements Shape{
  double base;
  double height;
  
  public String toString(){
    
 }  
  public Double getArea(){
    System.out.println( "area=" + base*height/2);
  }
}
public class app11_7{
  public static void main(String args[]){
    Rectangle rec;
    rec=new Rectangle(4,5);
    Triangle tri;
    tri=new Triangle(4,5);
    rec.getArea();
    tri.getArea();
}
