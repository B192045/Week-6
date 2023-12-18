package Shapes;

public abstract class Shape{

  public static class Square{
  double a;
  public Square(double a){
  this.a=a;}
  public void area(){
  System.out.println(a*a);}
  public void perimeter(){
  System.out.println(4*a);}}

 public static class Circle{
  double a;
  public Circle(double a){
  this.a=a;}
  public void area(){
  System.out.println(3.14*a*a);}
  public void perimeter(){
  System.out.println(2*3.14*a);}}


}
 