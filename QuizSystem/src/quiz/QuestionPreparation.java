package quiz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import quizutil.FacultyUser;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class QuestionPreparation extends JFrame {

	private JPanel contentPane;
	private FacultyUser faculty;
	private JTextArea  question;
	private JTextField optionA;
	private JTextField optionB;
	private JTextField optionC;
	private JTextField optionD;
	private JTextField finalAnswer;
	

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
		
		JLabel questionLabel = new JLabel("Question");
		questionLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		questionLabel.setBounds(12, 131, 150, 16);
		contentPane.add(questionLabel);
		
		JLabel optionLabelA = new JLabel("Option A");
		optionLabelA.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionLabelA.setBounds(12, 218, 101, 16);
		contentPane.add(optionLabelA);
		
		JLabel optionLabelB = new JLabel("Option B");
		optionLabelB.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionLabelB.setBounds(12, 265, 86, 16);
		contentPane.add(optionLabelB);
		
		JLabel optionLabelC = new JLabel("Option C");
		optionLabelC.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionLabelC.setBounds(12, 316, 86, 16);
		contentPane.add(optionLabelC);
		
		JLabel optionLabelD = new JLabel("Option D");
		optionLabelD.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionLabelD.setBounds(12, 368, 86, 16);
		contentPane.add(optionLabelD);
		
		JLabel anserLable = new JLabel("Answer");
		anserLable.setFont(new Font("Tahoma", Font.BOLD, 14));
		anserLable.setBounds(12, 438, 86, 16);
		contentPane.add(anserLable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(125, 128, 666, 74);
		contentPane.add(scrollPane);
		
		
		question = new JTextArea();
		scrollPane.setViewportView(question);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setRows(3);
		question.setFont(new Font("Monospaced", Font.BOLD, 16));
		
	
		
		optionA = new JTextField();
		optionA.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionA.setBounds(125, 215, 387, 22);
		contentPane.add(optionA);
		optionA.setColumns(10);
		
		optionB = new JTextField();
		optionB.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionB.setBounds(125, 262, 387, 22);
		contentPane.add(optionB);
		optionB.setColumns(10);
		
		optionC = new JTextField();
		optionC.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionC.setBounds(125, 313, 387, 22);
		contentPane.add(optionC);
		optionC.setColumns(10);
		
		optionD = new JTextField();
		optionD.setFont(new Font("Tahoma", Font.BOLD, 14));
		optionD.setBounds(125, 365, 387, 22);
		contentPane.add(optionD);
		optionD.setColumns(10);
		
		finalAnswer = new JTextField();
		finalAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		finalAnswer.setBounds(125, 435, 387, 22);
		contentPane.add(finalAnswer);
		finalAnswer.setColumns(10);
		
		JButton btnNewButton = new JButton("Save and Next");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(753, 328, 229, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Summary");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(753, 396, 229, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(753, 467, 229, 25);
		contentPane.add(btnNewButton_2);

		
	}
}
