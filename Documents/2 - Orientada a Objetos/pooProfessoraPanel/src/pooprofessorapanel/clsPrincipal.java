package pooexe9;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import pooConta.clsConta;

public class clsPrincipal {

    private JFrame frmAplicaoBancria;
    private JTextField txtAgncia;
    private JTextField txtNmeroConta;
    private JTextField txtNome;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    clsPrincipal window = new clsPrincipal();
                    window.frmAplicaoBancria.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public clsPrincipal() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAplicaoBancria = new JFrame();
        frmAplicaoBancria.setTitle("Aplicação Bancária");
        frmAplicaoBancria.setBounds(450, 450, 671, 316);
        frmAplicaoBancria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frmAplicaoBancria.setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("Conta");
        menuBar.add(mnNewMenu);

        JMenuItem mntmContaInvestimento = new JMenuItem("Conta Investimento");
        mntmContaInvestimento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        JMenuItem mntmContaCorrente = new JMenuItem("Conta Corrente");
        mntmContaCorrente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        mnNewMenu.add(mntmContaCorrente);
        mnNewMenu.add(mntmContaInvestimento);

        JMenuItem mntmContaSalrio = new JMenuItem("Conta Salário");
        mnNewMenu.add(mntmContaSalrio);

        JLabel lblNome = new JLabel("Nome");

        txtNome = new JTextField();
        txtNome.setColumns(10);

        JLabel lblBanco = new JLabel("Banco");

        JComboBox<String> comboBox = new JComboBox<String>();

        // Inclua os bancos lendo um arquivo que lista todos os bancos
        comboBox.addItem("001 - Banco do Brasil");
        comboBox.addItem("341 - Banco Ita�");

        JLabel lblAgncia = new JLabel("Agência");

        txtAgncia = new JTextField();
        txtAgncia.setColumns(10);

        JLabel lblNmero = new JLabel("Número");

        txtNmeroConta = new JTextField();
        txtNmeroConta.setColumns(10);

        JLabel lblqualContaDeseja = new JLabel("Qual conta deseja operar: ");

        JButton btnNewButton = new JButton("Conta Corrente");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clsConta obj = new clsConta();
                obj.setTitular(txtNome.getText());
                obj.setNumBanco(comboBox.getSelectedIndex());
                obj.setNumAgencia(Integer.parseInt(txtAgncia.getText()));
                obj.setNumConta(Integer.parseInt(txtNmeroConta.getText()));

                new clsCCorrenteUI(obj);
            }
        });

        JButton btnNewButton_1 = new JButton("Conta Salário");

        JButton btnNewButton_2 = new JButton("Conta Investimento");
        GroupLayout groupLayout = new GroupLayout(frmAplicaoBancria.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(94)
                                .addComponent(lblNome)
                                .addGap(5)
                                .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(93)
                                .addComponent(lblBanco)
                                .addGap(5)
                                .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(82)
                                .addComponent(lblAgncia)
                                .addGap(5)
                                .addComponent(txtAgncia, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(82)
                                .addComponent(lblNmero)
                                .addGap(5)
                                .addComponent(txtNmeroConta, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(132)
                                .addComponent(lblqualContaDeseja))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(132)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(3)
                                                .addComponent(lblNome))
                                        .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(3)
                                                .addComponent(lblBanco))
                                        .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(3)
                                                .addComponent(lblAgncia))
                                        .addComponent(txtAgncia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(3)
                                                .addComponent(lblNmero))
                                        .addComponent(txtNmeroConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5)
                                .addComponent(lblqualContaDeseja)
                                .addGap(34)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(btnNewButton)
                                        .addComponent(btnNewButton_1)
                                        .addComponent(btnNewButton_2)))
        );
        frmAplicaoBancria.getContentPane().setLayout(groupLayout);
    }
}
