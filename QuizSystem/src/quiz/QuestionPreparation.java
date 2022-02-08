package quiz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import quizutil.FacultyUser;

public class QuestionPreparation extends JFrame {

	private JPanel contentPane;
	private FacultyUser faculty;

	/**
	 * Create the frame.
	 */
	public QuestionPreparation(FacultyUser FacultyUser) {
		this.faculty = FacultyUser; 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1023, 574);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel facultyName = new JLabel("Welcome "+faculty.name+"!!!");
		facultyName.setForeground(new Color(119, 136, 153));
		facultyName.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 18));
		facultyName.setBounds(0, 0, 1005, 78);
		contentPane.add(facultyName);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(105, 105, 105));
		separator.setBounds(0, 85, 1005, 2);
		contentPane.add(separator);
		
	}
}
