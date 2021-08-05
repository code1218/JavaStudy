package chapters11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;

public class SwingTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTest frame = new SwingTest();
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
	public SwingTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(118, 85, 902, 473);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB808\uC774\uBE14");
		lblNewLabel.setBounds(56, 35, 57, 15);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(125, 32, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(286, 31, 30, 23);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(353, 31, 97, 23);
		panel.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(478, 31, 115, 23);
		panel.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(56, 77, 121, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(195, 77, 121, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(353, 77, 135, 23);
		panel.add(tglbtnNewToggleButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(56, 106, 311, 127);
		panel.add(textArea);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(398, 106, 342, 127);
		panel.add(formattedTextField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(56, 292, 311, 21);
		panel.add(passwordField);
		
		table = new JTable();
		table.setBounds(692, 259, -293, 94);
		panel.add(table);
	}
}
