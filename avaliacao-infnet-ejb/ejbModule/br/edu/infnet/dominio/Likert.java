package br.edu.infnet.dominio;

public enum Likert {

	CT("Concordo Totalmente"),CO("Concordo"), NN("N�o Concordo nem Discordo"), DI("Discordo"),DT("Discordo Totalmente"),NS("N�o sei avaliar");

	private String stringValue;

	private Likert(String opcao) {
		this.stringValue = opcao;
	}

	public String getStringValue() {
		return stringValue;
	}

}