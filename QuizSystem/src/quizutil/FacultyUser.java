package quizutil;

public class FacultyUser extends User {

	public FacultyUser(){
		
	}
	
	@Override
	public void initializeUser(String departmentName, String className, String userName) {
		// iniialize the user
		this.departName = departmentName;
		this.departClass = className;
		this.name = userName;
	}
	
	

	@Override
	public void summary() {
		// TODO Auto-generated method stub
	}

}
