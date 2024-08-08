class Facebook{

private String name,surname;
private String email;
private int pwd;
private String dob;
private String gender;

Facebook(){

}



Facebook(String name,String surname,int pwd){
this();
this.name = name;
this.surname = surname;
this.pwd = pwd;
}


Facebook(String name,String surname,int pwd,String email){
this(name,surname,pwd);
this.email = email;
}


Facebook(String name,String surname,int pwd,String email,String dob,String gender){
this(name,surname,pwd,email);
this.dob = dob;
this.gender = gender;
}

public String getName(){
return name;
}

public void setName(String name){
this.name = name;
}

public String getSurname(){
return surname;
}

public void setSurname(String surname){
this.surname = surname;
}

public String getEmail(){
return email;
}

public void setEmail(String email){
this.email = email;
}

public void setPwd(int pwd){
this.pwd = pwd;
}

public String getDob(){
return dob;
}

public void setDob(String dob){
this.dob = dob;
}

public String getGender(){
return gender;
}

public void setGender(String gender){
this.gender = gender;
}

}