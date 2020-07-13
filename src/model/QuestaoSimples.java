package model;

public class QuestaoSimples {

	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		setEnunciado(enunciado);
		setResposta(resposta);
	}
	
	public String getEnunciado() {
		return this.enunciado;
	}
	
	public void setEnunciado(String enunciado) {
		if(!enunciado.isEmpty()) {
			this.enunciado = enunciado;
		}
	}
	
	public void setResposta(String resposta) {
		if(!resposta.isEmpty() ) {
			this.resposta = resposta;
		}
	}
	
	public String aplicarQuestao() {
		return "Q: " + getEnunciado();
	}
	
	public boolean corrigir(String resposta) {
		return resposta.toLowerCase().equals(this.resposta);
	}
}
