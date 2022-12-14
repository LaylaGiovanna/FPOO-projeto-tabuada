package br.senai.sp.jandira.model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.LineBorder;
import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 765;
		tela.largura = 648;
		tela.corDeFundoDaTela = new Color(255, 255, 255);
		tela.corDoJlist = new Color(255, 242, 204);
		tela.corDoBotaoCalcular = new Color (112,173,71);
		tela.corDoBotaoLimpar = new Color(255,192,0);
		tela.fonteDosLabels = new Font("Malgun Gothic", Font.PLAIN, 18);
		tela.fonteDoTextField = new Font("Malgun Gothic", Font.BOLD, 20);
		tela.fonteDoResultado = new Font("Malgun Gothic", Font.BOLD, 18);
		tela.fonteDosBotoes = new Font("Malgun Gothic", Font.BOLD, 20);
		tela.fonteDoTitulo = new Font("Malgun Gothic", Font.BOLD, 33);
		tela.fonteDoSubtitulo = new Font("Malgun Gothic", Font.PLAIN, 15);
		tela.corDoTitulo = new Color(255, 0, 0);
		tela.corDoSubtitulo = new Color(105, 105, 105);
		tela.corDoTexto = new Color(0, 0, 0);
		tela.corDoTextField = new Color(68, 114, 196);
		tela.corDaLetraJList = new Color(84, 130, 53);
		tela.corDoTextoBotao = new Color(255, 255, 255);
		tela.corDaBorda = new LineBorder(Color.BLUE, 2);
		tela.criarTela();
		
		

	}

}
