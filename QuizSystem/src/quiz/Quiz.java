package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Quiz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton faculty,student;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz frame = new Quiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Quiz() {
		//Background of frame and size setting
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1200, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Image 
		ImageIcon icon = new ImageIcon("src/icons/quiz-img.png");
		JLabel imageLable = new JLabel(icon);
		imageLable.setBounds(0, 0, 1182, 503);
		contentPane.add(imageLable);
		
		
		//Button that will open a screen related to faculty
		ImageIcon teacherIcon = new ImageIcon("src/icons/teacher.png");
		faculty = new JButton(teacherIcon);
		faculty.setBackground(Color.WHITE);
		faculty.setBounds(382, 692, 127, 120);
		faculty.addActionListener(this);
		contentPane.add(faculty);
		
		//Button that will open a screen related to Student
		ImageIcon studentIcon = new ImageIcon("src/icons/reading.png");
		student = new JButton(studentIcon);
		student.setBackground(Color.WHITE);
		student.setBounds(630, 692, 127, 120);
		student.addActionListener(this);
		contentPane.add(student);
		
		//Just a label displaying text
		JLabel lblNewLabel_1 = new JLabel("Are You...");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(80, 582, 1044, 74);
		contentPane.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Open the screen when button is clicked for either student and faculty
		
		if(e.getSource()==faculty) {
			this.setVisible(false);
			new Faculty().setVisible(true);
		}
	}
}
