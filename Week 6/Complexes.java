package Complex;

class Arith{
 int rp,ip;
 Arith(){
 rp=0;
 ip=0;}

 Arith(int rp,int ip){
 this.rp=rp;
 this.ip=ip;}

 void add(int a1,int a2){
 rp=a1.rp+a2.rp;
 ip=a1.ip+a2.ip;
 System.out.println(rp+"+"+"i"+ip);}

 void sub(int a1,int a2){
 rp=a1.rp-a2.rp;
 ip=a1.ip-a2.ip;
 System.out.println(rp+"-"+"i"+ip);}
}
 
 