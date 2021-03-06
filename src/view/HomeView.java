package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ViewManager;

@SuppressWarnings("serial")
public class HomeView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton logoutButton;
	private JButton depositButton;
	private JButton withdrawButton;
	private JButton transferButton;
	private JLabel nameLabel;
	private JLabel balanceLabel;
	
	/**
	 * Constructs an instance (or objects) of the HomeView class.
	 * 
	 * @param manager
	 */
	
	public HomeView(ViewManager manager) {
		super();
		
		this.manager = manager;
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
		
		initDepositButton();
		initWithdrawButton();
		initTransferButton();
		initLogoutButton();
		initLabels();
		
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
	
	private void initLogoutButton() {	
		logoutButton = new JButton("Logout");
		logoutButton.setBounds(205, 300, 200, 35);
		logoutButton.addActionListener(this);
		
		this.add(logoutButton);
	}
	
	private void initDepositButton() {	
		depositButton = new JButton("Deposit");
		depositButton.setBounds(205, 180, 200, 35);
		depositButton.addActionListener(this);
		
		this.add(depositButton);
	}
	
	private void initWithdrawButton() {	
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(205, 220, 200, 35);
		withdrawButton.addActionListener(this);
		
		this.add(withdrawButton);
	}
	
	private void initTransferButton() {	
		transferButton = new JButton("Transfer");
		transferButton.setBounds(205, 260, 200, 35);
		transferButton.addActionListener(this);
		
		this.add(transferButton);
	}
	
	private void initLabels() {
		nameLabel = new JLabel("User: ");
		nameLabel.setBounds(0, 0, 130, 35);
		
		balanceLabel = new JLabel("Balance: ");
		balanceLabel.setBounds(0, 40, 100, 35);
		
		this.add(nameLabel);
		this.add(balanceLabel);
	}
	
	public void updateLabels() {
		nameLabel.setText("User: " + manager.getAccount().getUser().getName());
		balanceLabel.setText("Balance: " + manager.getAccount().getBalance());
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
		
		if (source.equals(logoutButton)) {
			//NEED TO TURN ACCOUNT NULL
			manager.switchTo(ATM.LOGIN_VIEW);
		}
		else if (source.equals(depositButton)) {
			//NEED TO TURN ACCOUNT NULL
			manager.switchTo(ATM.DEPOSIT_VIEW);
		}
		else if (source.equals(withdrawButton)) {
			//NEED TO TURN ACCOUNT NULL
			manager.switchTo(ATM.WITHDRAW_VIEW);
		}
		else if (source.equals(transferButton)) {
			//NEED TO TURN ACCOUNT NULL
			manager.switchTo(ATM.TRANSFER_VIEW);
		}
		
	}
}