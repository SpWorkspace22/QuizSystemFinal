package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import quizutil.FacultyUser;

public class Faculty extends JFrame implements ActionListener, screenUtils{
	private JTextField textField;
	private JComboBox<String>  departMentChooser, classChooser;
	private JButton createPaper,backButton;

	private FacultyUser facultyDeatils;
	/**
	 * Create the frame.
	 */
	public Faculty() {
		setBounds(100, 50, 1023, 574);
		this.getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		ImageIcon icon = new  ImageIcon("src/icons/quiz-img.png");
		JLabel imageLabel = new JLabel(icon);
		imageLabel.setBounds(0, 0, 433, 527);
		getContentPane().add(imageLabel);
		
		JLabel descriptionLabel = new JLabel("Please provide follwoing details");
		descriptionLabel.setForeground(Color.GRAY);
		descriptionLabel.setFont(new Font("Candara Light", Font.BOLD, 26));
		descriptionLabel.setBounds(509, 27, 446, 35);
		getContentPane().add(descriptionLabel);
		
		JLabel departmenLabel = new JLabel("Deparment");
		departmenLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		departmenLabel.setBounds(509, 128, 162, 19);
		getContentPane().add(departmenLabel);
		
		JLabel classLabel = new JLabel("Class");
		classLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		classLabel.setBounds(509, 180, 109, 22);
		getContentPane().add(classLabel);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		nameLabel.setBounds(509, 248, 109, 16);
		getContentPane().add(nameLabel);
		
		departMentChooser = new JComboBox();
		departMentChooser.setFont(new Font("Century Gothic", Font.BOLD, 16));
		departMentChooser.setBounds(711, 125, 282, 22);
		getContentPane().add(departMentChooser);
		
		classChooser = new JComboBox();
		classChooser.setFont(new Font("Century Gothic", Font.BOLD, 16));
		classChooser.setBounds(711, 180, 282, 22);
		getContentPane().add(classChooser);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField.setBounds(711, 245, 282, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		createPaper = new JButton("Create Paper");
		createPaper.setFont(new Font("Cambria", Font.BOLD, 16));
		createPaper.setBackground(Color.WHITE);
		createPaper.setBounds(509, 339, 138, 25);
		createPaper.addActionListener(this);
		getContentPane().add(createPaper);
		
		backButton = new JButton("Back");
		backButton.setBackground(Color.WHITE);
		backButton.setFont(new Font("Cambria", Font.BOLD, 16));
		backButton.setBounds(711, 339, 151, 25);
		backButton.addActionListener(this);
		getContentPane().add(backButton);
		
		initData();
	}

	//initialize the dropdown
	private void initData() {
		
		departMentChooser.addItem("MCA");
		classChooser.addItem("FY");
		classChooser.addItem("SY");
		classChooser.addItem("TY");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==createPaper) {
			if(textField.getText().length()==0) {
				JOptionPane.showMessageDialog(null,"Please enter the user name","User Error", JOptionPane.ERROR_MESSAGE);
			}else {
				getDeatilsfromScreen();
				this.setVisible(false);
				new QuestionPreparation(facultyDeatils).setVisible(true);
				
			}
		}else {
			this.setVisible(false);
			new Quiz().setVisible(true);
		}
	}


	@Override
	public void getDeatilsfromScreen() {
		// TODO Auto-generated method stub
		facultyDeatils = new FacultyUser();
		facultyDeatils.initializeUser(departMentChooser.getItemAt(departMentChooser.getSelectedIndex()),
				classChooser.getItemAt(classChooser.getSelectedIndex()), textField.getText());
		
	}
	
	
}
