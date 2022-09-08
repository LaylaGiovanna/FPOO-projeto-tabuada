package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
//import javax.swing.JList;
//import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.Tabuada;

public class FrameTabuada {

	public String titulo;
	public String subtitulo;
	public int altura;
	public int largura;
	public Color corDoTexto;
	public Font fonteDoTitulo;
	public Font fonteDosLabels;
	public Font fonteDosBotoes;
	public Color corDeFundoDaTela;
	public Color corDoBotaoLimpar;
	public Color corDoBotaoCalcular;
	public Color corDoTextoBotao;
	public Color corDoTitulo;
	public Color corDoSubtitulo;
	public Color corDoJlist;
	public LineBorder corDaBorda;


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
		labelTitulo.setBounds(100, 1, 200, 50);
		labelTitulo.setFont(fonteDoTitulo);
		labelTitulo.setForeground(corDoTitulo);

		JLabel labelSubtitulo = new JLabel();
		labelSubtitulo.setText(
				"<html>Com a tabuada 1.0 os seus problemas acabaram. Calcule<br/>a tabuada que desejar em segundos!</html>");
		labelSubtitulo.setBounds(100, 50, 600, 40);
		labelSubtitulo.setFont(fonteDosLabels);
		labelSubtitulo.setForeground(corDoSubtitulo);

//		Multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(110, 80, 187, 40);
		labelMultiplicando.setFont(fonteDosLabels);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(360, 80, 187, 40);
		textFieldMultiplicando.setBorder(corDaBorda);

//		Minimo Multiplicador
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(110, 130, 187, 40);
		labelMinimoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(360, 130, 187, 40);
		textFieldMinimoMultiplicador.setBorder(corDaBorda);

//		Maximo Multiplicador
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(110, 210, 187, 40);
		labelMaximoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBounds(360, 210, 187, 40);
		textFieldMaximoMultiplicador.setBorder(corDaBorda);

//		Resultado
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(30, 340, 187, 40);
		labelResultado.setFont(fonteDosLabels);

//		botão Calcular e botão Limpar
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(110, 280, 220, 50);
		buttonCalcular.setForeground(corDoTextoBotao);
		buttonCalcular.setBackground(corDoBotaoCalcular);
		buttonCalcular.setFont(fonteDosBotoes);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(350, 280, 180, 50);
		buttonLimpar.setForeground(corDoTextoBotao);
		buttonLimpar.setBackground(corDoBotaoLimpar);
		buttonLimpar.setFont(fonteDosBotoes);

//		caixa do Jlist
		JList lista = new JList();
		JScrollPane scroll = new JScrollPane(lista);

		scroll.setBounds(50, 400, 455, 300);
		scroll.setBorder(corDaBorda);
		scroll.setBackground(corDoJlist);

//		fazendo o botao funcionar
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
				tabuada.maximoMultiplicador = Integer.parseInt(textFieldMaximoMultiplicador.getText());

				String[] resultado = tabuada.getTabuada();
				lista.setListData(resultado);

			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textFieldMultiplicando.setText("");
				textFieldMinimoMultiplicador.setText("");
				textFieldMaximoMultiplicador.setText("");

			}
		});

//		adicionar componentes ao painel (container)
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

		tela.setVisible(true);
	}
}
