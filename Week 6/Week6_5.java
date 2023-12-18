import java.util.*;
import Complex.Arith;

class Week6_5{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter complex number1: ");
 int rp=sc.nextInt();
 int ip=sc.nextInt();
 Arith a1=new Arith(rp,ip);
 System.out.println("Enter complex number2: ");
 rp=sc.nextInt();
 ip=sc.nextInt();
 Arith a2=new Arith(rp,ip);
 a1.add(a1,a2);
 a1.sub(a1,a2);}}
 
 