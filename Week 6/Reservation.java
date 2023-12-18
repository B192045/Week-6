package reservations;
import java.util.*;
interface reservation_cost{
 double total_fare(Reservation[] r,int n);}

public class Reservation implements reservation_cost{ 
  String type;
 public Reservation(String type){
 this.type=type;}

 public double total_fare(Reservation[] r,int n){
 double total=0;
 System.out.println("Enter fare: ");
 Scanner sc=new Scanner(System.in);
 int fare=sc.nextInt();
 double st=(fare-fare*0.3);
 double sco=(fare-fare*0.5);
 for(int i=0;i<n;i++){
 if((r[i].type).equalsIgnoreCase("children"))
 total=total+0;
 if((r[i].type).equalsIgnoreCase("student"))
 total=total+st;
 if((r[i].type).equalsIgnoreCase("seniorcitizen"))
 total=total+sco;}
 return total;}}
 
 
 
 