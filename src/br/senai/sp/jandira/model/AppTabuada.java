package br.senai.sp.jandira.model;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 600;
		tela.largura = 600;
		tela.corDeFundoDaTela = new Color(196, 196, 255);
		tela.corDoBotaoCalcular = new Color(0, 128, 192);
		tela.corDoBotaoLimpar = new Color(0, 128, 192);
		tela.fonteDosLabels = new Font("Malgun Gothic", Font.PLAIN, 12);
		tela.fonteDoTitulo = new Font("Malgun Gothic", Font.BOLD, 16);
		tela.corDoTexto = new Color(0, 0, 0);
		tela.criarTela();

	}

}
