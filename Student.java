public class student{
public static void main(String[] args){
	Data d1=new Data("Fatima","Lahore",03331,3.4);
	d1.setName("Fatima");
	d1.setAdress("Lahore");
	d1.setPhoneNum(03331);
	d1.setGPA(3.4);
	String name1=d1.getName();
	String adress1=d1.getAdress();
	int PhoneNum1=d1.getPhoneNum();
	double GPA1=d1.getGPA();
	d1.display("Student 1 data:" + name1, adress1, PhoneNum1, GPA1);

	Data d2=new Data("noor","lahore",0334,3.4);
	d2.setName("noor");
	d2.setAdress("lahore");
	d2.setPhoneNum(0334);
	d2.setGPA(3.);
	String name2=(d2.getName());
	String adress2=(d2.getAdress());
	int PhoneNum2=(d2.getPhoneNum());
	double GPA2=(d2.getGPA());
d2.display("Student 2 data: " + name2, adress2, PhoneNum2, GPA2);
}

}