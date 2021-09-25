package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaMenu implements ActionListener {
	// Atributos
	private static JFrame frmMenuInicial = new JFrame("Menu Inicial");
	private static JLabel lblTituloInicial = new JLabel("Loja de Perfumes");
	private static JButton btnProduto = new JButton("Produto");
	private static JButton btnCliente = new JButton("Cliente");
	private static JButton btnCompra = new JButton("Compra");

	//Constutor iniciando a montagem dos componentes gráficos da tela inicial
	public TelaMenu() {
		// Configura os componentes da JFrame do Menu Inicial
		frmMenuInicial.setBounds(100, 100, 698, 449);
		frmMenuInicial.getContentPane().setLayout(null);
		frmMenuInicial.setResizable(false);
		frmMenuInicial.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmMenuInicial.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		//Configura o Label titulo
		lblTituloInicial.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTituloInicial.setBounds(255, 24, 192, 59);
		frmMenuInicial.getContentPane().add(lblTituloInicial);

		//Configura o Botão para iniciar eventos sobre Produto
		btnProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnProduto.setBounds(200, 120, 274, 47);
		frmMenuInicial.getContentPane().add(btnProduto);

		//Configura o Botão para iniciar eventos sobre Cliente
		btnCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCliente.setBounds(200, 193, 274, 47);
		frmMenuInicial.getContentPane().add(btnCliente);

		//Configura o Botão para iniciar eventos sobre Compra
		btnCompra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCompra.setBounds(201, 262, 274, 47);
		frmMenuInicial.getContentPane().add(btnCompra);

		//Permitindo que a JFrame fique visível
		frmMenuInicial.setVisible(true);
	}

	public static void main(String[] args) {
		//Altera o estilo da GUI
		alterarEstiloGUI();

		//Inicia a aplicação através do Construtor
		TelaMenu menu = new TelaMenu();

		//Direciona e configura os eventos dos botões
		btnProduto.addActionListener(menu);
		btnCliente.addActionListener(menu);
		btnCompra.addActionListener(menu);
	}

	public static void alterarEstiloGUI() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Armazena o botão escolhido
		Object botao = e.getSource();

		//Implementa as ações gráficas sobre Produto
		if (botao == btnProduto) {
			
		}
		
		//Implementa as ações gráficas sobre Cliente
		if (botao == btnCliente) {
			
		}
		
		//Implementa as ações gráficas sobre Compra
		if (botao == btnCompra) {
			
		}
	}

}
