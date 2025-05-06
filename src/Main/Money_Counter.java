package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Currency;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Money_Counter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static Currency moneyCounter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					moneyCounter = new Currency();
					Money_Counter frame = new Money_Counter();
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
	public Money_Counter() {
		setTitle("Money Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 640);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Column headers
		JPanel BillsPanel = new JPanel();
		BillsPanel.setBackground(new Color(255, 215, 0));
		BillsPanel.setBounds(55, 11, 190, 45);
		contentPane.add(BillsPanel);
		
		JLabel BillsLabel = new JLabel("Bills");
		BillsLabel.setFont(new Font("Arial Black", Font.BOLD, 28));
		BillsPanel.add(BillsLabel);
		
		JPanel CoinsPanel = new JPanel();
		CoinsPanel.setBackground(new Color(255, 215, 0));
		CoinsPanel.setBounds(287, 11, 190, 45);
		contentPane.add(CoinsPanel);
		
		JLabel CoinsLabel = new JLabel("Coins");
		CoinsLabel.setFont(new Font("Arial Black", Font.BOLD, 28));
		CoinsPanel.add(CoinsLabel);
		
		JPanel RollsPanel = new JPanel();
		RollsPanel.setBackground(new Color(255, 215, 0));
		RollsPanel.setBounds(505, 11, 190, 45);
		contentPane.add(RollsPanel);
		
		JLabel RollsLabel = new JLabel("Rolls");
		RollsLabel.setFont(new Font("Arial Black", Font.BOLD, 28));
		RollsPanel.add(RollsLabel);
		
		//Hundred Dollar
		JPanel $100 = new JPanel();
		$100.setBackground(new Color(255, 215, 0));
		$100.setBounds(77, 70, 80, 45);
		contentPane.add($100);
		
		JLabel $100Label = new JLabel("$100");
		$100.add($100Label);
		$100Label.setForeground(new Color(0, 0, 255));
		$100Label.setBackground(new Color(0, 255, 255));
		$100Label.setFont(new Font("Arial Black", Font.PLAIN, 24));		
		
		JTextArea Num100s = new JTextArea();
		Num100s.setFont(new Font("Arial Black", Font.PLAIN, 30));
		Num100s.setBounds(158, 70, 70, 45);
		
		contentPane.add(Num100s);
		
		
		//Fifty Dollar Bills
		
		JPanel $50 = new JPanel();
		$50.setBackground(new Color(255, 215, 0));
		$50.setBounds(77, 139, 80, 45);
		contentPane.add($50);
		
		JLabel $50Label = new JLabel("$50");
		$50Label.setForeground(new Color(0, 0, 255));
		$50Label.setFont(new Font("Arial Black", Font.PLAIN, 24));
		$50Label.setBackground(Color.CYAN);
		$50.add($50Label);
		
		JTextArea Num50s = new JTextArea();
		Num50s.setFont(new Font("Arial Black", Font.PLAIN, 30));
		Num50s.setBounds(158, 139, 70, 45);
		contentPane.add(Num50s);
		
		
		//Twenty dollar bills
		JPanel $20 = new JPanel();
		$20.setBackground(new Color(255, 215, 0));
		$20.setBounds(77, 209, 80, 45);
		contentPane.add($20);
		
		JLabel $20Label = new JLabel("$20");
		$20Label.setForeground(new Color(0, 0, 255));
		$20Label.setFont(new Font("Arial Black", Font.PLAIN, 24));
		$20Label.setBackground(Color.CYAN);
		$20.add($20Label);
		
		JTextArea Num20s = new JTextArea();
		Num20s.setFont(new Font("Arial Black", Font.PLAIN, 30));
		Num20s.setBounds(158, 209, 70, 45);
		contentPane.add(Num20s);
		
		//Ten dollar bills
		JPanel $10 = new JPanel();
		$10.setBackground(new Color(255, 215, 0));
		$10.setBounds(77, 278, 80, 45);
		contentPane.add($10);
		
		JLabel $10Label = new JLabel("$10");
		$10Label.setForeground(new Color(0, 0, 255));
		$10Label.setFont(new Font("Arial Black", Font.PLAIN, 24));
		$10Label.setBackground(Color.CYAN);
		$10.add($10Label);

		JTextArea Num10s = new JTextArea();
		Num10s.setFont(new Font("Arial Black", Font.PLAIN, 30));
		Num10s.setBounds(158, 278, 70, 45);
		contentPane.add(Num10s);
		
		//Five dollar bills
		JPanel $5 = new JPanel();
		$5.setBackground(new Color(255, 215, 0));
		$5.setBounds(77, 347, 80, 45);
		contentPane.add($5);
		
		JLabel $5Label = new JLabel("$5");
		$5Label.setForeground(new Color(0, 0, 255));
		$5Label.setFont(new Font("Arial Black", Font.PLAIN, 24));
		$5Label.setBackground(Color.CYAN);
		$5.add($5Label);
		
		JTextArea Num5s = new JTextArea();
		Num5s.setFont(new Font("Arial Black", Font.PLAIN, 30));
		Num5s.setBounds(158, 347, 70, 45);
		contentPane.add(Num5s);
		
		
		//Dollar coins
		JPanel $1 = new JPanel();
		$1.setBackground(new Color(255, 215, 0));
		$1.setBounds(309, 70, 80, 45);
		contentPane.add($1);
		
		JLabel $1Label = new JLabel("$1");
		$1Label.setForeground(new Color(0, 0, 255));
		$1Label.setFont(new Font("Arial Black", Font.PLAIN, 24));
		$1Label.setBackground(Color.CYAN);
		$1.add($1Label);
		
		JTextArea NumDollars = new JTextArea();
		NumDollars.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumDollars.setBounds(390, 70, 69, 45);
		contentPane.add(NumDollars);
		
		//Quarters
		JPanel QuarterPanel = new JPanel();
		QuarterPanel.setBackground(new Color(255, 215, 0));
		QuarterPanel.setBounds(309, 139, 80, 45);
		contentPane.add(QuarterPanel);
		
		JLabel Quarters = new JLabel("$0.25");
		Quarters.setForeground(new Color(0, 0, 255));
		Quarters.setFont(new Font("Arial Black", Font.PLAIN, 24));
		Quarters.setBackground(Color.CYAN);
		QuarterPanel.add(Quarters);

		JTextArea NumQuarters = new JTextArea();
		NumQuarters.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumQuarters.setBounds(390, 139, 69, 45);
		contentPane.add(NumQuarters);
		
		
		//Dimes
		JPanel DimePanel = new JPanel();
		DimePanel.setBackground(new Color(255, 215, 0));
		DimePanel.setBounds(309, 209, 80, 45);
		contentPane.add(DimePanel);
		
		JLabel Dimes = new JLabel("$0.10");
		Dimes.setForeground(new Color(0, 0, 255));
		Dimes.setFont(new Font("Arial Black", Font.PLAIN, 24));
		Dimes.setBackground(Color.CYAN);
		DimePanel.add(Dimes);
		
		JTextArea NumDimes = new JTextArea();
		NumDimes.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumDimes.setBounds(390, 209, 69, 45);
		contentPane.add(NumDimes);
		
		
		//Nickels
		JPanel NickelPanel = new JPanel();
		NickelPanel.setBackground(new Color(255, 215, 0));
		NickelPanel.setBounds(309, 278, 80, 45);
		contentPane.add(NickelPanel);
		
		JLabel Nickels = new JLabel("$0.05");
		Nickels.setForeground(new Color(0, 0, 255));
		Nickels.setFont(new Font("Arial Black", Font.PLAIN, 24));
		Nickels.setBackground(Color.CYAN);
		NickelPanel.add(Nickels);

		JTextArea NumNickels = new JTextArea();
		NumNickels.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumNickels.setBounds(390, 278, 69, 45);
		contentPane.add(NumNickels);
		
		//Dollar Rolls
		JPanel $1_Rolls = new JPanel();
		$1_Rolls.setBackground(new Color(255, 215, 0));
		$1_Rolls.setBounds(527, 70, 80, 45);
		contentPane.add($1_Rolls);
		
		JLabel $1Label_1 = new JLabel("$1");
		$1Label_1.setForeground(new Color(0, 0, 255));
		$1Label_1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		$1Label_1.setBackground(Color.CYAN);
		$1_Rolls.add($1Label_1);
		
		JTextArea NumDollarRoll = new JTextArea();
		NumDollarRoll.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumDollarRoll.setBounds(608, 70, 69, 45);
		contentPane.add(NumDollarRoll);
		
		
		//Quarter Rolls
		JPanel QuarterRolls = new JPanel();
		QuarterRolls.setBackground(new Color(255, 215, 0));
		QuarterRolls.setBounds(527, 139, 80, 45);
		contentPane.add(QuarterRolls);
		
		JLabel Quarters_1 = new JLabel("$0.25");
		Quarters_1.setForeground(new Color(0, 0, 255));
		Quarters_1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		Quarters_1.setBackground(Color.CYAN);
		QuarterRolls.add(Quarters_1);

		JTextArea NumQuarterRoll = new JTextArea();
		NumQuarterRoll.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumQuarterRoll.setBounds(608, 139, 69, 45);
		contentPane.add(NumQuarterRoll);
		
		//Dime Rolls
		JPanel DimeRolls = new JPanel();
		DimeRolls.setBackground(new Color(255, 215, 0));
		DimeRolls.setBounds(527, 209, 80, 45);
		contentPane.add(DimeRolls);
		
		JLabel DimeRoll = new JLabel("$0.10");
		DimeRoll.setForeground(new Color(0, 0, 255));
		DimeRoll.setFont(new Font("Arial Black", Font.PLAIN, 24));
		DimeRoll.setBackground(Color.CYAN);
		DimeRolls.add(DimeRoll);
		
		JTextArea NumDimeRoll = new JTextArea();
		NumDimeRoll.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumDimeRoll.setBounds(608, 209, 69, 45);
		contentPane.add(NumDimeRoll);
		
		//Nickel Rolls
		JPanel NickelRolls = new JPanel();
		NickelRolls.setBackground(new Color(255, 215, 0));
		NickelRolls.setBounds(527, 278, 80, 45);
		contentPane.add(NickelRolls);
		
		JLabel NickelsRoll = new JLabel("$0.05");
		NickelsRoll.setForeground(new Color(0, 0, 255));
		NickelsRoll.setFont(new Font("Arial Black", Font.PLAIN, 24));
		NickelsRoll.setBackground(Color.CYAN);
		NickelRolls.add(NickelsRoll);
		
		JTextArea NumNickelRoll = new JTextArea();
		NumNickelRoll.setFont(new Font("Arial Black", Font.PLAIN, 30));
		NumNickelRoll.setBounds(608, 278, 69, 45);
		contentPane.add(NumNickelRoll);
		
		JTextPane TotalAmount = new JTextPane();
		TotalAmount.setText("0");
		TotalAmount.setFont(new Font("Arial Black", Font.PLAIN, 22));
		TotalAmount.setBounds(349, 441, 174, 33);
		contentPane.add(TotalAmount);
		
		JButton totalButton = new JButton("Total");
		totalButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		totalButton.setForeground(new Color(0, 0, 255));
		totalButton.setBackground(new Color(245, 245, 245));
		totalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set bills
				moneyCounter.setHundredsCount(Integer.parseInt(Num100s.getText()));
				moneyCounter.setFiftiesCount(Integer.parseInt(Num50s.getText()));
				moneyCounter.setTwentiesCount(Integer.parseInt(Num20s.getText()));
				moneyCounter.setTensCount(Integer.parseInt(Num10s.getText()));
				
				//set coins
				moneyCounter.setDollarCount(Integer.parseInt(NumDollars.getText()));
				moneyCounter.setQuarterCount(Integer.parseInt(NumQuarters.getText()));
				moneyCounter.setDimeCount(Integer.parseInt(NumDimes.getText()));
				moneyCounter.setNickelCount(Integer.parseInt(NumNickels.getText()));
				
				//setRolls
				moneyCounter.setDollarRolls(Integer.parseInt(NumDollarRoll.getText()));
				moneyCounter.setQuarterRolls(Integer.parseInt(NumQuarterRoll.getText()));
				moneyCounter.setDimeRolls(Integer.parseInt(NumDimeRoll.getText()));
				moneyCounter.setNickelRolls(Integer.parseInt(NumNickelRoll.getText()));
				
				//Calculate total amount
				moneyCounter.calculateTotal();
				
				//Display Total amount
				TotalAmount.setText(moneyCounter.printAmount());
			}
		});
		totalButton.setBounds(237, 441, 110, 33);
		contentPane.add(totalButton);
		
		
	}
}
