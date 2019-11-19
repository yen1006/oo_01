abstract class Cshape{
  protected String color;
  public void setColor(Sting str){
    color=str;
  }
  public abstract void show();
 }
  
class CTriangle extends CShape{
  protected Double aline,bline,cline;
  public CTriangle(double a,double b,double c){
    aline=a;
    bline=b;
    cline=c;
  }
  public void show(){
    System.out.println("area="+0.5*a*b);
  }
}
public class hw1
{
  public static void main(String args[]){
    CTraingle ctra=new CTraingle(3,4,5);
    ctra.setColor("Red");
      ctra.show();
  }
}
