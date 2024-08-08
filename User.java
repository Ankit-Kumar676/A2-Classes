import java.util.Scanner;
class User{
static Facebook f;
static Facebook f1;
static Facebook f2;
public static void main(String[]args){
Scanner sc = new Scanner(System.in);



System.out.println("1. Create Account Using Name , Surname , Password");
System.out.println("2. Create Account Using Name,Surname,Password,Email");
System.out.println("3. Create Account Using Name,Surname,Password,Email,DOB,Gender");
int ch = sc.nextInt();
switch(ch){
	case 1 :
		System.out.println("Enter First Name");
		String name = sc.next();
		System.out.println("Enter Surname");
		String surname = sc.next();
		System.out.println("Enter Password");
		int pwd = sc.nextInt();
		
		f = new Facebook(name,surname,pwd);

System.out.println("........Your Account Has Been Created");
System.out.println("........WELCOME TO FACEBOOK");
break;

	case 2 :
		System.out.println("Enter First Name");
		String name1 = sc.next();
		System.out.println("Enter Surname");
		String surname1 = sc.next();
		System.out.println("Enter Password");
		int pwd1 = sc.nextInt();
		System.out.println("Enter Your Email");
		String email1 = sc.next();
		
		f1 = new Facebook(name1,surname1,pwd1,email1);


System.out.println("........Your Account Has Been Created");
System.out.println("........WELCOME TO FACEBOOK");
break;

	case 3 :
		System.out.println("Enter First Name");
		String name2 = sc.next();
		System.out.println("Enter Surname");
		String surname2 = sc.next();
		System.out.println("Enter Password");
		int pwd2 = sc.nextInt();
		System.out.println("Enter Your Email");
		String email2 = sc.next();
		System.out.println("Enter your DOB");
		String dob2 = sc.next();
		System.out.println("Enter your Gender");
		String gender2 = sc.next();


		f2 = new Facebook(name2,surname2,pwd2,email2,dob2,gender2);


System.out.println("........Your Account Has Been Created");
System.out.println("........WELCOME TO FACEBOOK");
break;

		default :
		System.out.println("Check Your Inputed Value");
		break;
}

if(ch==1){
boolean flag = true;
while(flag){
System.out.println("1. Update Your Name");
System.out.println("2. Show Your Name");
System.out.println("3. Update Your E-mail");
System.out.println("4. Show Your E-mail");
System.out.println("5. Update your Password");
System.out.println("6. Update Your Gender");
System.out.println("7. Show Your Gender");
System.out.println("8. Update Your Date-Of_Birth");
System.out.println("9. Show Your Date-Of_Birth");
System.out.println("10. Exit ");
int ch1 = sc.nextInt();
switch(ch1){
	case 1 :
		System.out.println("Enter Name To update");
		String name = sc.next();
		f.setName(name);
		System.out.println("Name Updated");
		break;
	case 2 :
		System.out.println("Your Name is :  ");
		System.out.println(f.getName());
		break;
	case 3 :
		System.out.println("Enter Your Email");
		String email = sc.next();
		f.setEmail(email);
		System.out.println("Mail Updated");
		break;
	case 4 :
		System.out.println("Your Mail-Id is :  ");
		System.out.println(f.getEmail());
		break;
	case 5 :
		System.out.println("Enter Your Password");
		int pwd = sc.nextInt();
		f.setPwd(pwd);
		System.out.println("Password Updated");
		break;
	case 6 :
		System.out.println("Enter Your Gender");
		String gender = sc.next();
		f.setGender(gender);
		System.out.println("Gender Updated");
		break;
	case 7 :
		System.out.println("Your Gender is : ");
		System.out.println(f.getGender());
		break;
	case 8 :
		System.out.println("Enter Your D-O-B");
		String dob = sc.next();
		f.setDob(dob);
		System.out.println("D-O-B updated");
		break;
	case 9 :
		System.out.println("Your D-O-B is : ");
		System.out.println(f.getDob());
		break;
	default : 
		System.out.println("Exit form Facebook");

}
}
}
else if(ch==1){
boolean flag = true;
while(flag){
System.out.println("1. Update Your Name");
System.out.println("2. Show Your Name");
System.out.println("3. Update Your E-mail");
System.out.println("4. Show Your E-mail");
System.out.println("5. Update your Password");
System.out.println("6. Update Your Gender");
System.out.println("7. Show Your Gender");
System.out.println("8. Update Your Date-Of_Birth");
System.out.println("9. Show Your Date-Of_Birth");
System.out.println("10. Exit ");
int ch2 = sc.nextInt();
switch(ch2){
	case 1 :
		System.out.println("Enter Name To update");
		String name = sc.next();
		f1.setName(name);
		System.out.println("Name Updated");
		break;
	case 2 :
		System.out.println("Your Name is :  ");
		System.out.println(f1.getName());
		break;
	case 3 :
		System.out.println("Enter Your Email");
		String email = sc.next();
		f1.setEmail(email);
		System.out.println("Mail Updated");
		break;
	case 4 :
		System.out.println("Your Mail-Id is :  ");
		System.out.println(f1.getEmail());
		break;
	case 5 :
		System.out.println("Enter Your Password");
		int pwd = sc.nextInt();
		f1.setPwd(pwd);
		System.out.println("Password Updated");
		break;
	case 6 :
		System.out.println("Enter Your Gender");
		String gender = sc.next();
		f1.setGender(gender);
		System.out.println("Gender Updated");
		break;
	case 7 :
		System.out.println("Your Gender is : ");
		System.out.println(f1.getGender());
		break;
	case 8 :
		System.out.println("Enter Your D-O-B");
		String dob = sc.next();
		f1.setDob(dob);
		System.out.println("D-O-B updated");
		break;
	case 9 :
		System.out.println("Your D-O-B is : ");
		System.out.println(f1.getDob());
		break;
	default : 
		System.out.println("Exit form Facebook");

}
}
}
if(ch==1){
boolean flag = true;
while(flag){
System.out.println("1. Update Your Name");
System.out.println("2. Show Your Name");
System.out.println("3. Update Your E-mail");
System.out.println("4. Show Your E-mail");
System.out.println("5. Update your Password");
System.out.println("6. Update Your Gender");
System.out.println("7. Show Your Gender");
System.out.println("8. Update Your Date-Of_Birth");
System.out.println("9. Show Your Date-Of_Birth");
System.out.println("10. Exit ");
int ch3 = sc.nextInt();
switch(ch3){
	case 1 :
		System.out.println("Enter Name To update");
		String name = sc.next();
		f2.setName(name);
		System.out.println("Name Updated");
		break;
	case 2 :
		System.out.println("Your Name is :  ");
		System.out.println(f2.getName());
		break;
	case 3 :
		System.out.println("Enter Your Email");
		String email = sc.next();
		f2.setEmail(email);
		System.out.println("Mail Updated");
		break;
	case 4 :
		System.out.println("Your Mail-Id is :  ");
		System.out.println(f2.getEmail());
		break;
	case 5 :
		System.out.println("Enter Your Password");
		int pwd = sc.nextInt();
		f2.setPwd(pwd);
		System.out.println("Password Updated");
		break;
	case 6 :
		System.out.println("Enter Your Gender");
		String gender = sc.next();
		f2.setGender(gender);
		System.out.println("Gender Updated");
		break;
	case 7 :
		System.out.println("Your Gender is : ");
		System.out.println(f2.getGender());
		break;
	case 8 :
		System.out.println("Enter Your D-O-B");
		String dob = sc.next();
		f2.setDob(dob);
		System.out.println("D-O-B updated");
		break;
	case 9 :
		System.out.println("Your D-O-B is : ");
		System.out.println(f2.getDob());
		break;
	default : 
		System.out.println("Exit form Facebook");

}
}
}
}
}

