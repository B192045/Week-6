package Calculator;

interface operations{
 void addition(double a,double b);
 void subtraction(double a,double b);
 void multiplication(double a,double b);
 void division(double a,double b);}

public class Operation implements operations{
 public void addition(double a,double b){
 System.out.println("Addition is: "+(a+b));}
 public void subtraction(double a,double b){
 System.out.println("Subtraction is "+(a-b));}
 public void multiplication(double a,double b){
 System.out.println("Multiplication is "+(a*b));}
 public void division(double a,double b){
 System.out.println("Division is: "+(a/b));}}
 
 