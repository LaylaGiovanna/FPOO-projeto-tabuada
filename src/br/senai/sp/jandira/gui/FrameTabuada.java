package br.senai.sp.jandira.gui;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.Tabuada;
import br.senai.sp.jandira.model.AppTabuada;


public class FrameTabuada {
	
	public String titulo;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	
	public int altura;
	public int largura;
	public Color corDoTexto;
	public Font fonteDoTitulo;
	public Font fonteDosLabels;
	public Color corDeFundoDaTela;
	public Color corDoBotaoLimpar;
	public Color corDoBotaoCalcular;

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
		
//		Multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(30, 40, 100, 30);
		labelMultiplicando.setFont(fonteDosLabels);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(30, 70, 300, 30);
		
//		Minimo Multiplicador
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo MultiplicadorPeso:");
		labelMinimoMultiplicador.setBounds(30, 110, 300, 30);
		labelMinimoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(30, 140, 300, 30);
		
//		Maximo Multiplicador
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(30, 180, 300, 30);
		labelMaximoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBounds(30, 210, 300, 30);
		
//		Resultado
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(30, 320, 300, 30);
		labelResultado.setFont(fonteDosLabels);
		
//		botão Calcular e botão Limpar
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(400, 280, 160, 30);
		buttonCalcular.setForeground(corDoTexto);
		buttonCalcular.setBackground(corDoBotaoCalcular);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Calcular");
		buttonLimpar.setBounds(400, 280, 160, 30);
		buttonLimpar.setForeground(corDoTexto);
		buttonLimpar.setBackground(corDoBotaoLimpar);
		
//		eventos de click  botão calcular
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = textFieldMultiplicando.getText();
				tabuada.minimoMultiplicador = Double.parseDouble(textFieldMinimoMultiplicador.getText());
				tabuada.maximoMultiplicador = Double.parseDouble(textFieldMaximoMultiplicador.getText());

				labelResultado.setText(labelResultado());
			}
		});
		
		
//		botão limpar
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				
				
			}
		});

		
		
		
		
		
		
//		adicionar componentes ao painel (container)
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(labelResultado);
		painel.add(buttonLimpar);
		painel.add(buttonCalcular);
		

		tela.setVisible(true);
	}
}
	
