package week1.day1;

public class MobilePhone {
	
	String mobileBrand = "redmi";
	double mobilePrice = 12.5;
	int noContacts = 100;
	long imeNum = 9940037187l;
	

public void makeCall() {

System.out.println("make call");
}
public void sendMessage() {
	System.out.println("send message");

}
public void takePicture() {
	System.out.println("take picture");

}
public static void main(String[] args) {
	MobilePhone phone= new MobilePhone();
	phone.makeCall();
	phone.sendMessage();
	phone.takePicture();
	String Brand = phone.mobileBrand;
	double price = phone.mobilePrice;
	int contacts = phone.noContacts;
	long imnum = phone.imeNum;
	System.out.println(Brand);
	System.out.println(price);
	System.out.println(contacts);
	System.out.println(imnum);

}
}
