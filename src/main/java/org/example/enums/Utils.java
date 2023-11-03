package org.example.enums;

public enum Utils {

    COSTO ("costo:"),
    NUMEROS ("\\d+"),
    BASURA ("[\\p{L}\\p{S}]"),
    MASBASURA ("[^\\p{N}\\p{L}]");

    public final String util;

    Utils(String s) {
        util = s;
    }
}
