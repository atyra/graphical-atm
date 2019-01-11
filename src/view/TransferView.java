package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ViewManager;

@SuppressWarnings("serial")
public class TransferView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton cancelButton;
	private JButton confirmButton;
	private JTextField amountField;
	private JTextField accountField;
	private double amount;
	private BankAccount account;
	
	
	/**
	 * Constructs an instance (or objects) of the HomeView class.
	 * 
	 * @param manager
	 */
	
	public TransferView(ViewManager manager) {
		super();
		
		this.manager = manager;
		this.amount = 0;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the HomeView components.
	 */
	
	private void initialize() {
		
		// TODO
		//
		// this is a placeholder for this view and should be removed once you start
		// building the HomeView.
		
//		this.add(new javax.swing.JLabel("HomeView", javax.swing.SwingConstants.CENTER));
		
		this.setLayout(null);
		
		initAmountField();
		initConfrimButton();
		initCancelButton();
		
		// TODO
		//
		// this is where you should build the HomeView (i.e., all the components that
		// allow the user to interact with the ATM - deposit, withdraw, transfer, etc.).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
	}
	
	/*
	 * HomeView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The HomeView class is not serializable.");
	}
	
	private void initCancelButton() {	
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(205, 300, 200, 35);
		cancelButton.addActionListener(this);
		
		this.add(cancelButton);
	}
	
	private void initAmountField() {
		JLabel label = new JLabel("Amount:", SwingConstants.RIGHT);
		label.setBounds(100, 140, 95, 35);
		label.setLabelFor(amountField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		amountField = new JTextField(20);
		amountField.setBounds(205, 140, 200, 35);
		
		this.add(label);
		this.add(amountField);
	}
	
	private void initAccountField() {
		JLabel label = new JLabel("Destination Account:", SwingConstants.RIGHT);
		label.setBounds(100, 140, 95, 35);
		label.setLabelFor(amountField);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		accountField = new JTextField(20);
		accountField.setBounds(205, 140, 200, 35);
		
		this.add(label);
		this.add(accountField);
	}
	
	private void initConfrimButton() {
		confirmButton = new JButton("Confrim");
		confirmButton.setBounds(205, 260, 200, 35);
		confirmButton.addActionListener(this);
		
		this.add(confirmButton);
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the HomeView.
	 * 
	 * @param e
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
		Object source = e.getSource();
		
		if (source.equals(cancelButton)) {
			manager.switchTo(ATM.HOME_VIEW);
		}
		else if (source.equals(confirmButton)) {
			amount = Double.parseDouble(amountField.getText());
			manager.transfer(account, amount);
			manager.switchTo(ATM.HOME_VIEW);
		}
		
	}
}