package model;

public class QuestaoMultiplaEscolha extends QuestaoSimples {

	
	private String[] alternativas;
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String[] alternativas) {
		super(enunciado, resposta);
		setAlternativas(alternativas);
		
	}
	
	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}	
	

	public String aplicarQuestao() {
		String mensagem = getEnunciado() + "\n" + "Alternativas: " + "\n";
		for(String opcao : alternativas) {
			mensagem = mensagem + opcao + " [ ] \n";
		}
		
		return mensagem;
	}
}
