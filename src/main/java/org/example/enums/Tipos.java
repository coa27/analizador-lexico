package org.example.enums;

public enum Tipos {

//    IDENTIFICADOR ("\\b(dateTime|ubicacionToEnviar|costo|categoria)\\b"),
//    DATETIME ("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$"),
//    ESTADO ("\\b(?:compra|expiro)\\b"),
//    ESPECIAL ("[{},\"\\[\\]]+"),
//    ASIGNACION ("[:]"),
//    FECHA ("^\\d{4}-\\d{2}-\\d{2}$"),
//    HORA ("^\\d{2}:\\d{2}:\\d{2}$\"$");

    ESTADO ("estado:"),
    DATETIME ("dateTime:"),
    UBICACION ("ubicacionToEnviar:"),
    ARTICULOS ("articulos:");

    public final String patron;

    Tipos(String s){
        patron = s;
    }

}
