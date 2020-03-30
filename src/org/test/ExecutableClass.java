package org.test;

public class ExecutableClass extends BaseClass {
public static void main(String[] args) {
	launch("https://www.facebook.com/");
	LoginPage l=new LoginPage();
	
	fill(l.getUser(),"sivag918@gmail.com");
	fill(l.getPass(),"0809");
	btn(l.getBtn());
	kill();
}
}
