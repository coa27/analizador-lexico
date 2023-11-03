package org.example.lexer;

import org.example.enums.Tipos;

public class Token {

    private String valor;
    private Tipos tipo;

    public Token(String valor, Tipos tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
}
