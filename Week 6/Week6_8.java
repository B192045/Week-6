import java.util.*;
import reservations.Reservation;

class Week6_8{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter num of passengers: ");
 int n=sc.nextInt();
 Reservation r[]=new Reservation[n];
 for(int i=0;i<n;i++){
 System.out.println("1.children 2.student 3.senior");
 int x=sc.nextInt();
 if(x==1)
 r[i]=new Reservation("children");
 if(x==2)
 r[i]=new Reservation("student");
 if(x==3)
 r[i]=new Reservation("senior");}
 System.out.println(r[0].total_fare(r,n));
}}