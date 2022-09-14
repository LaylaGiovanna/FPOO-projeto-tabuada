package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import br.senai.sp.jandira.JtextFieldSomenteNumeros;
import br.senai.sp.jandira.Tabuada;

public class FrameTabuada {

	public String titulo;
	public String subtitulo;
	public int altura;
	public int largura;
	public Color corDoTexto;
	public Color corDoTextField;
	public Font fonteDoTitulo;
	public Font fonteDosLabels;
	public Font fonteDoResultado;
	public Font fonteDosBotoes;
	public Font fonteDoSubtitulo;
	public Font fonteDoTextField;
	public Color corDeFundoDaTela;
	public Color corDoBotaoLimpar;
	public Color corDoBotaoCalcular;
	public Color corDoTextoBotao;
	public Color corDoTitulo;
	public Color corDoSubtitulo;
	public Color corDoJlist;
	public Color corDaLetraJList;
	
	public LineBorder corDaBorda;
	ImageIcon IconeTabuada = new ImageIcon("src/br/senai/sp/jandira/image/imagem-tabuada.png");

	public void criarTela() {

// x, y, larg, alt

//		criar a tela
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

//		obter a instância do painel de conteúdo (container)
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

//		título tabuada e subtitulo
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(100, 6, 220, 50);
		labelTitulo.setFont(fonteDoTitulo);
		labelTitulo.setForeground(corDoTitulo);

		JLabel labelSubtitulo = new JLabel();
		labelSubtitulo.setText(
				"<html>Com a tabuada 1.0 os seus problemas acabaram. Calcule<br/>a tabuada que desejar em segundos!</html>");
		labelSubtitulo.setBounds(100, 55, 600, 50);
		labelSubtitulo.setFont(fonteDoSubtitulo);
		labelSubtitulo.setForeground(corDoSubtitulo);

//		Multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(50, 120, 187, 40);
		labelMultiplicando.setFont(fonteDosLabels);

		JTextField textFieldMultiplicando = new JtextFieldSomenteNumeros();
		textFieldMultiplicando.setBounds(320, 120, 187, 40);
		textFieldMultiplicando.setBorder(corDaBorda);
		textFieldMultiplicando.setForeground(corDoTextField);
		textFieldMultiplicando.setFont(fonteDoTextField);
		textFieldMultiplicando.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldMultiplicando.transferFocus();

			}
		});

//		Minimo Multiplicador
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(50, 180, 187, 40);
		labelMinimoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMinimoMultiplicador = new JtextFieldSomenteNumeros();
		textFieldMinimoMultiplicador.setBounds(320, 180, 187, 40);
		textFieldMinimoMultiplicador.setBorder(corDaBorda);
		textFieldMinimoMultiplicador.setForeground(corDoTextField);
		textFieldMinimoMultiplicador.setFont(fonteDoTextField);
		textFieldMinimoMultiplicador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldMinimoMultiplicador.transferFocus();

			}
		});

//		Maximo Multiplicador
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(50, 240, 187, 40);
		labelMaximoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMaximoMultiplicador = new JtextFieldSomenteNumeros();
		textFieldMaximoMultiplicador.setBounds(320, 240, 187, 40);
		textFieldMaximoMultiplicador.setBorder(corDaBorda);
		textFieldMaximoMultiplicador.setForeground(corDoTextField);
		textFieldMaximoMultiplicador.setFont(fonteDoTextField);
		textFieldMaximoMultiplicador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldMaximoMultiplicador.transferFocus();

			}
		});

//		Resultado
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(50, 360, 187, 40);
		labelResultado.setFont(fonteDoResultado);

//		botão Calcular e botão Limpar
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(50, 300, 270, 60);
		buttonCalcular.setForeground(corDoTextoBotao);
		buttonCalcular.setBackground(corDoBotaoCalcular);
		buttonCalcular.setFont(fonteDosBotoes);
		buttonCalcular.setBorder(corDaBorda);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(330, 300, 175, 60);
		buttonLimpar.setForeground(corDoTextoBotao);
		buttonLimpar.setBackground(corDoBotaoLimpar);
		buttonLimpar.setFont(fonteDosBotoes);
		buttonLimpar.setBorder(corDaBorda);

//		caixa do Jlist
		JList lista = new JList();
		JScrollPane scroll = new JScrollPane(lista);

		scroll.setBounds(50, 400, 455, 300);
		scroll.setBorder(corDaBorda);
		lista.setBackground(corDoJlist);
		lista.setForeground(corDaLetraJList);
		scroll.setBackground(corDoSubtitulo);
		
		JLabel labelMensagemObrigatoria = new JLabel();
		labelMensagemObrigatoria.setBounds(100, 200, 100, 60);

//		fazendo o botao funcionar
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if ((textFieldMultiplicando.getText().isEmpty()) || (textFieldMinimoMultiplicador.getText().isEmpty())
						|| (textFieldMaximoMultiplicador.getText().isEmpty())) {
					
					JOptionPane.showMessageDialog(null, "Confira os campos, eles são obrigatórios!!");
				} else {
					
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textFieldMaximoMultiplicador.getText());

					if (tabuada.maximoMultiplicador >= tabuada.minimoMultiplicador) {
						String[] resultado = tabuada.getTabuada();
						lista.setListData(resultado);
					} else {
						JOptionPane.showMessageDialog(null, "O máximo deve ser maior que o mínimo!!");
					}
					
					
				}

				

			}
		});

		

		
		
		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				textFieldMultiplicando.setText("");
				textFieldMinimoMultiplicador.setText("");
				textFieldMaximoMultiplicador.setText("");

				String[] limparJList = { "" };
				lista.setListData(limparJList);

			}
		});

		JLabel labelIcone = new JLabel(IconeTabuada);
		labelIcone.setBounds(10, 6, 30, 30);
		labelIcone.setSize(85, 85);
		labelIcone.setIcon(IconeTabuada);
		
		
		
		

//	adicionar componentes ao painel (container)
		painel.add(labelTitulo);
		painel.add(labelSubtitulo);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(labelResultado);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(scroll);
		painel.add(labelIcone);
		painel.add(labelMensagemObrigatoria);

		tela.setVisible(true);
	}
}
