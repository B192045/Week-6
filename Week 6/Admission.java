package Admissions;

public class Admission{
 public boolean isEligible(int m_marks,int p_marks,int c_marks,int e_marks){
 if(m_marks>=90&&p_marks>=95&&c_marks>=70&&e_marks>=80)
 return true;
 return false;}


 
 }