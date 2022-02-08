package quizutil;

import javax.swing.JFrame;


public abstract class User extends JFrame{
	public String departName;
	public String departClass;
	public String name;
	
	abstract void initializeUser(String departmentName, String className, String userName);
	abstract void summary();
}
