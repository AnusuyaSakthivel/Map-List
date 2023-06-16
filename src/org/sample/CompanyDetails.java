package org.sample;
//Argument Based on Datatype Count
public class CompanyDetails {
private void companyInfo(int empid) {
System.out.println("Employee Id is:" +empid);
}
private void companyInfo(long phone, String name) {
System.out.println("Employee Mobile is:" +phone+"\t"+"Employee name is:"+name);
}
//Argument Based on DateType 
private void companyInfo(float salary) {
System.out.println("Employee Salary is:"+salary);	
}
private void companyInfo(boolean Status) {
System.out.println("Employee Maritial status is:"+Status);
}
//Argument Based on Datatype order
private void companyInfo(byte year) {
System.out.println("Employee joining year:"+year);	
}
private void companynf(char gender) {
System.out.println("Employee gender is :"+gender);
}
public static void main(String[] args) {
CompanyDetails c = new CompanyDetails();
c.companyInfo(true);
c.companyInfo(2020);
c.companyInfo(98765.1233f);
c.companyInfo(1234);
c.companyInfo(98765432, "Anu");
c.companynf('f');


}
}
