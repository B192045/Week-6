package Mseva;
import java.util.*;

public class Msevas{
 ArrayList<String> AP=new ArrayList<String>();
 ArrayList<String> A=new ArrayList<String>();
 ArrayList<String> BC=new ArrayList<String>();
 ArrayList<String> PC=new ArrayList<String>();
 public Msevas(){
 AP.add("muscleache");
 AP.add("fever");
 AP.add("stomachache");
 AP.add("vomiting");
 AP.add("loweye");
 A.add("fever");
 A.add("fatigue");
 A.add("stomachache");
 A.add("vomiting");
 A.add("loweye");
 BC.add("stomachache");
 BC.add("vomiting");
 BC.add("loweye");
 BC.add("skinallergy");
 BC.add("lowbp");
 PC.add("stomachache");
 PC.add("vomiting");
 PC.add("loweye");
 PC.add("fever");
 PC.add("fatigue");}
 
public void diseasedetect(){
 int i;
 Scanner sc=new Scanner(System.in);
 System.out.println("1.Fever 2.Stomach ache 3.Muscleache 4.vomiting 5.low eye sight 6.fatigue 7.skin allergy 8.bp");
 System.out.println("Enter num of symptoms: ");
 int n=sc.nextInt();
 ArrayList<String> list=new ArrayList<>();
 System.out.println("Enter symptoms: ");
 for( i=0;i<n;i++){
 list.add(sc.next());}
 int c=0;
 for(i=0;i<list.size();i++){
 if(AP.contains(list.get(i))){
 c++;}}
 if(c==AP.size())
 System.out.println("Acute pancreatitis");
 else 
 c=0;
 for(i=0;i<list.size();i++){
 if(A.contains(list.get(i))){
 c++;}}
 if(c==A.size())
 System.out.println("Appendicites and pancreatic");
 else 
 c=0;
 for(i=0;i<list.size();i++){
 if(BC.contains(list.get(i))){
 c++;}}
 if(c==BC.size())
 System.out.println("Bladder cancer");
 else 
 System.out.println("viral fever");
}}
 
 
 
 
 
 
 
 
 
