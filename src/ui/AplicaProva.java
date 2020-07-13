package ui;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

import java.util.Scanner;

public class AplicaProva {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		QuestaoSimples[] questoes = new QuestaoSimples[5];
		
		questoes[0] = new QuestaoSimples("Quem matou o morto ?", "mordomo");
		questoes[1] = new QuestaoSimples("Qual a cor do cavalo branco de Napole�o ?", "marrom");
		questoes[2] = new QuestaoComDica("Quem roeu a roupa do rei de roma?", "rato", "animal que gosta muito de queijo");
		questoes[3] = new QuestaoMultiplaEscolha("Quanto � 1 + 1 ?", "2", new String[] { "5", "6", "7", "8", "2" });
		questoes[4] = new QuestaoMultiplaEscolha("Qual palavra usamos para ampliar uma classe pai em uma subclasse ?", "heran�a", new String[] {"alian�a fant�stica", "vingadores", "liga da justi�a", "heran�a"});

		int pontos=0;
		
		for(int i = 0; i < questoes.length; i++) {	
			boolean resultado = false;
			String resposta = "";
			System.out.println(questoes[i].aplicarQuestao());
			resposta = teclado.nextLine();
			
			resultado = questoes[i].corrigir(resposta);
			
			if(resultado) {
				System.out.println("Parab�ns mano, voc� acertou");
				pontos++;
			}else {
				System.out.println("Resposta errada");
			}
			System.out.println();
		}
		
		System.out.println("Voc� fez um total de " + pontos + " / " + questoes.length);
		
		
		
		
		
		
		
		
	}
	
}
