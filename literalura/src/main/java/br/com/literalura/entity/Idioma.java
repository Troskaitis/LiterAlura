package br.com.literalura.entity;

public enum Idioma {
    ES("Espanhol"),
    EN("Inglês"),
    FR("Francês"),
    PT("Português"),
    IT("Italiano");

    private String nome;

    public String getNome() {
        return nome;
    }

    Idioma(String nome) {
        this.nome = nome;
    }
}
