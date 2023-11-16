package org.example.analizador;

import org.example.enums.Valores;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.regex.Pattern;


public class Analizador {

    public Analizador(List<String> tokens){
        List<String[]> tokenValor =  tokens.stream()
                    .map(t -> t.split(":"))
                    .collect(Collectors.toList());

        tokenValor.stream()
                        .forEach(t -> {
                            if (!(verficar(t[0], t[1]))){
                                throw new RuntimeException("Error sintactico.");
                            }
                        });

        System.out.println("todo bien");
    }

    public static boolean verficar(String tipo, String valor){
        Optional<Valores> va = Arrays.stream(Valores.values())
                .filter(it -> Pattern.matches(it.patron, valor)).findAny();
        return va.isPresent();
    }

}
