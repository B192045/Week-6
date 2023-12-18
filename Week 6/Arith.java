package Complex;

public class Arith{
 int rp;
 int ip;
 
 public Arith(){
 rp=0;
 ip=0;}

 public Arith(int rp,int ip){
 this.rp=rp;
 this.ip=ip;}

 public void add(Arith a1,Arith a2){
 int ip=a1.ip+a2.ip;
 int rp=a1.rp+a2.rp;
 System.out.println(ip+"i"+rp);}

 public void sub(Arith a1,Arith a2){
 int ip=a1.ip-a2.ip;
 int rp=a1.rp-a2.rp;
 System.out.println(ip+"i"+rp);}}


 

 
 
 
 