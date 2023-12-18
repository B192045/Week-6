import java.util.*;
import Remote.Remotes;

class Week6_7{
 public static void main(String args[]){
 Remotes r=new Remotes();
 while(true){
 System.out.println("enter 1.switch on 2.star sports 3.ngc 4.discovery 5.starmovies 6.switch off");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 switch(n){
 case 1:
 r.switch_on();
 break;
 case 2:
 r.starsports();
 break;
 case 3:
 r.ngc();
 break;
 case 4:
 r.discovery();
 break;
 case 5:
 r.starmovies();
 break;
 case 6:
 System.exit(0);}}}}
 