package quizutil;

import java.util.ArrayList;
import java.util.HashMap;

public class Question {

	private String question;
	private HashMap<String, ArrayList<String>> questionAnswer;
	private ArrayList<String> optionAnswers;
	private User person;
	
	public Question(User user) {
		questionAnswer = new HashMap<String, ArrayList<String>>();
		optionAnswers = new ArrayList<String>();
		person = user;
	}
	
	
	public void addQuestionAndAnswers(String question,String op1,String op2, String op3,
			String op4, String ans) {
		
		optionAnswers.add(op1);
		optionAnswers.add(op2);
		optionAnswers.add(op3);
		optionAnswers.add(op4);
		optionAnswers.add(ans);
		
		questionAnswer.put(question, optionAnswers);
	
	}
	
	// This method will save data to file
	public void prepare() {
		
	}
}
