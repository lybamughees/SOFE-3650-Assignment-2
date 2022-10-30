import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PaymentOption extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public PaymentOption() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please select your payment method!");
		lblNewLabel.setBounds(111, 11, 196, 14);
		contentPane.add(lblNewLabel);
		
		JButton cashBtn = new JButton("Cash");
		cashBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SuccessPage successPage = new SuccessPage();
				successPage.setVisible(true);
			}
		});
		cashBtn.setBounds(38, 103, 89, 23);
		contentPane.add(cashBtn);
		
		JButton debitBtn = new JButton("Debit Card");
		debitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaymentPage paymentPage = new PaymentPage();
				paymentPage.setVisible(true);
			}
		});
		debitBtn.setBounds(145, 103, 111, 23);
		contentPane.add(debitBtn);
		
		JButton creditBtn = new JButton("Credit Card");
		creditBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaymentPage paymentPage = new PaymentPage();
				paymentPage.setVisible(true);
			}
		});
		creditBtn.setBounds(266, 103, 104, 23);
		contentPane.add(creditBtn);
		
		JButton cancelbtn = new JButton("Cancel Session");
		cancelbtn .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StartSessionPage startSessionPage = new StartSessionPage();
				startSessionPage.setVisible(true);
			}
		});
		cancelbtn.setBounds(140, 227, 146, 23);
		contentPane.add(cancelbtn);
	}

}
