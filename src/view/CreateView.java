package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ViewManager;

@SuppressWarnings("serial")
public class CreateView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton createAccountButton;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField DOBField;
	private JTextField addressField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField phoneField;
	private JTextField zipField;
	
	/**
	 * Constructs an instance (or object) of the CreateView class.
	 * 
	 * @param manager
	 */
	
	public CreateView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the CreateView components.
	 */
	
	private void initialize() {
		
		// TODO
		//
		// this is a placeholder for this view and should be removed once you start
		// building the CreateView.
		
		this.setLayout(null);
		
		initFirstNameField();
		initLastNameField();
		initDOBField();
		initAddressField();
		initCityField();
		initStateField();
		initPhoneField();
		initZIPField();
		initCreateAccountButton();
		
		// TODO
		//
		// this is where you should build the CreateView (i.e., all the components that
		// allow the user to enter his or her information and create a new account).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
	}
	
	/*
	 * CreateView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void initCreateAccountButton() {	
		createAccountButton = new JButton("Create Account");
		createAccountButton.setBounds(205, 420, 200, 35);
		createAccountButton.addActionListener(this);
		
		this.add(createAccountButton);
	}
	
	private void initFirstNameField() {
		JLabel label = new JLabel("First Name", SwingConstants.RIGHT);
		label.setBounds(100, 100, 95, 35);
		label.setLabelFor(firstNameField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		firstNameField = new JTextField(20);
		firstNameField.setBounds(205, 100, 200, 35);
		
		this.add(label);
		this.add(firstNameField);
	}
	
	private void initLastNameField() {
		JLabel label = new JLabel("Last Name", SwingConstants.RIGHT);
		label.setBounds(100, 140, 95, 35);
		label.setLabelFor(lastNameField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		lastNameField = new JTextField(20);
		lastNameField.setBounds(205, 140, 200, 35);
		
		this.add(label);
		this.add(lastNameField);
	}
	
	private void initDOBField() {
		JLabel label = new JLabel("DOB", SwingConstants.RIGHT);
		label.setBounds(100, 180, 95, 35);
		label.setLabelFor(DOBField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		DOBField = new JTextField(20);
		DOBField.setBounds(205, 180, 200, 35);
		
		this.add(label);
		this.add(DOBField);
	}
	
	private void initAddressField() {
		JLabel label = new JLabel("Address", SwingConstants.RIGHT);
		label.setBounds(100, 220, 95, 35);
		label.setLabelFor(addressField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		addressField = new JTextField(20);
		addressField.setBounds(205, 220, 200, 35);
		
		this.add(label);
		this.add(addressField);
	}
	
	private void initCityField() {
		JLabel label = new JLabel("City", SwingConstants.RIGHT);
		label.setBounds(100, 260, 95, 35);
		label.setLabelFor(cityField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		cityField = new JTextField(20);
		cityField.setBounds(205, 260, 200, 35);
		
		this.add(label);
		this.add(cityField);
	}
	
	private void initStateField() {
		JLabel label = new JLabel("State", SwingConstants.RIGHT);
		label.setBounds(100, 300, 95, 35);
		label.setLabelFor(stateField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		stateField = new JTextField(20);
		stateField.setBounds(205, 300, 200, 35);
		
		this.add(label);
		this.add(stateField);
	}
	
	private void initPhoneField() {
		JLabel label = new JLabel("Phone Number", SwingConstants.RIGHT);
		label.setBounds(100, 340, 95, 35);
		label.setLabelFor(phoneField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		phoneField = new JTextField(20);
		phoneField.setBounds(205, 340, 200, 35);
		
		this.add(label);
		this.add(phoneField);
	}
	
	private void initZIPField() {
		JLabel label = new JLabel("ZIP Code", SwingConstants.RIGHT);
		label.setBounds(100, 380, 95, 35);
		label.setLabelFor(zipField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		zipField = new JTextField(20);
		zipField.setBounds(205, 380, 200, 35);
		
		this.add(label);
		this.add(zipField);
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The CreateView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the CreateView.
	 * 
	 * @param e
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source.equals(createAccountButton)) {
			
		}
		
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
}