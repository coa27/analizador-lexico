package org.example.lexer;

import org.example.enums.Tipos;
import org.example.enums.Utils;

import java.util.*;
import java.util.stream.Collectors;

public class Lexer {

    public Lexer(List<String> input){
        List<String> tokensSinSanitizar = input.stream()
                                            .map(s -> s.replaceAll("\n", ""))
                                            .filter(s -> filtro(s))
                                            .toList();

        //lineas para obtener informacion de todos los productos
        String articulo = input.stream()
                            .map(s -> s.replaceAll("\n", ""))
                            .filter(s -> s.startsWith(Tipos.ARTICULOS.patron))
                            .collect(Collectors.joining());
        String articulos[] = articulo.split(Utils.COSTO.util);

        //se obtiene el valor total de la compra
        Integer costoTotal = Arrays.stream(articulos)
                                .map(s -> s.replaceAll(" ", ""))
                                .map(s -> s.replaceAll(Utils.BASURA.util, ""))
                                .map(s -> s.replaceAll(Utils.MASBASURA.util, ""))
                                .filter(s -> !s.isBlank())
                                .mapToInt(Integer::parseInt)
                                .sum();

        tokensSinSanitizar = tokensSinSanitizar.stream()
                .filter(s -> !s.startsWith(Tipos.ARTICULOS.patron))
                .toList();

        List<String> tokens = new ArrayList<>(tokensSinSanitizar);

        tokens.add("costoTotal: " + costoTotal);

        System.out.println(tokens);

    }

    private static Boolean filtro(String s){

        for (Tipos tipo : Tipos.values()){
            if (s.startsWith(tipo.patron)){
                return true;
            }
        }
        return false;
    }

}
