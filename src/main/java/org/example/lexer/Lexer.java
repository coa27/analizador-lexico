package org.example.lexer;

import org.example.enums.Tipos;

import java.util.*;
import java.util.regex.Pattern;

public class Lexer {

    public Lexer(){
    }

    public List<String> generarToken(String input){
        String[] inputs = input.split("\n");

        List<String> tokens = Arrays.stream(inputs)
                        .map(t -> t.replaceAll(" ", ""))
                        .filter(Lexer::filtro)
                        .map(t -> t.replaceAll(">", ":"))
                        .map(t -> t.replaceAll("<", ""))
                        .map(t -> t.replaceAll("\\/[a-zA-Z:]+", ""))
                        .toList();

        return tokens;
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
