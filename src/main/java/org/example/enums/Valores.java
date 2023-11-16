package org.example.enums;

public enum Valores {

    ESTADO ("(entregado|en\\sproceso|enviado|pendiente)"),
    FECHA ("\\d{4}-\\d{2}-\\d{2}"),
    MARCA ("[a-zA-ZáéíóúüñÁÉÍÓÚÜÑ]+"),
    MONTO ("-?\\d+(\\.\\d+)?");

    public final String patron;

    Valores(String s) {
        patron = s;
    }

}
