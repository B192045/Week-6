import java.util.*;
import Admissions.Admission;

class Week6_9{
 public static void main(String args[]){
 Admission a=new Admission();
 ArrayList<String> select=new ArrayList<>();

 System.out.println("Enter num of students: ");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 ArrayList<String> list=new ArrayList<>();
 for(int j=0;j<n;j++){
 System.out.println("Enter name of students: ");
 list.add(sc.next());

 
 System.out.println("Enter marks of student in math,physics,chemistry,english: ");
 int math=sc.nextInt();
 int phy=sc.nextInt();
 int chem=sc.nextInt();
 int eng=sc.nextInt();
 if(a.isEligible(math,phy,chem,eng)){
 String ba=list.get(j);
 select.add(ba);}}
 System.out.println("Selected students are: ");
 System.out.println(select);
}}
 
 