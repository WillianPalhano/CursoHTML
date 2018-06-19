package pooexe9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import pooConta.clsConta;
import pooConta.clsContaCorrente;

public class clsCCorrenteUI {

	private JFrame frmContaCorrente;
	private JTextField textField;
	public clsContaCorrente obj;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clsCCorrenteUI window = new clsCCorrenteUI();
					window.frmContaCorrente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public clsCCorrenteUI() {
		 initialize();
	}
	
	public clsCCorrenteUI(clsConta objconta) {
		obj = new clsContaCorrente(objconta);
		initialize();
		this.frmContaCorrente.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContaCorrente = new JFrame();
		frmContaCorrente.setTitle("Conta Corrente");
		frmContaCorrente.setBounds(100, 100, 487, 335);
		frmContaCorrente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNome = new JLabel("Nome");
		
		JLabel lblNewLabel = new JLabel(obj.getTitular());
		
		JLabel lblBanco = new JLabel("Banco");
		
		JLabel lblNewLabel_1 = new JLabel(String.valueOf(obj.getNumBanco()));
		
		JLabel lblAgncia = new JLabel("Ag\u00EAncia");
		
		JLabel lblNewLabel_2 = new JLabel(String.valueOf(obj.getNumAgencia()));
		
		JLabel lblConta = new JLabel("Conta");
		
		JLabel lblNewLabel_3 = new JLabel(String.valueOf(obj.getNumConta()));
		
		JLabel lblOperao = new JLabel("Opera\u00E7\u00E3o");
		
		JRadioButton rdbtnDepsito = new JRadioButton("Dep\u00F3sito");
		
		JRadioButton rdbtnSaque = new JRadioButton("Saque");
		
		JLabel lblValor = new JLabel("Valor");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Executar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmContaCorrente.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblNewLabel))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(lblBanco, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(lblAgncia, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(lblConta, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(lblOperao)
					.addGap(7)
					.addComponent(rdbtnDepsito, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addComponent(rdbtnSaque, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(lblValor)
					.addGap(7)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome)
						.addComponent(lblNewLabel))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBanco)
						.addComponent(lblNewLabel_1))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAgncia)
						.addComponent(lblNewLabel_2))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblConta)
						.addComponent(lblNewLabel_3))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblOperao))
						.addComponent(rdbtnDepsito))
					.addGap(7)
					.addComponent(rdbtnSaque)
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblValor))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addComponent(btnNewButton))
		);
		frmContaCorrente.getContentPane().setLayout(groupLayout);
	}

}
