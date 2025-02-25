class Data{
private String name;
static String registrationid;
private String adress;
private int phoneNum;
private double GPA;

public Data(String name,String adress,int phoneNum,double GPA){
	this.name=name;
	this.adress=adress;
	this.phoneNum=phoneNum;
	this.GPA=GPA;
	
}
public void setName(String name){
	this.name=name;
}
public void setAdress(String adress ){
	this.adress=adress;
}
public void setPhoneNum(int phoneNum){
	this.phoneNum=phoneNum;
}
public void setGPA(double GPA){
	this.GPA=GPA;
}

public String getName(){
	return name;
}
public String getAdress(){
	return adress;
}
public int getPhoneNum(){
	return phoneNum;
}
public double getGPA(){
	return GPA;
}
public void display(String name,String adress,int phoneNum,double GPA){
System.out.printf("%s,%s,%d,%.2f,\n",name,adress,phoneNum,(double)GPA);

}
}