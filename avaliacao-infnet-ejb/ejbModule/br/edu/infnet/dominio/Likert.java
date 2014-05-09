package br.edu.infnet.dominio;

public enum Likert {

	CT("Concordo Totalmente"),CO("Concordo"), NN("Não Concordo nem Discordo"), DI("Discordo"),DT("Discordo Totalmente"),NS("Não sei avaliar");

	private String stringValue;

	private Likert(String opcao) {
		this.stringValue = opcao;
	}

	public String getStringValue() {
		return stringValue;
	}

}