package org.example;

import org.example.lexer.Lexer;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        String input = """
                estado: compra;
                identificacionDeCompra: 234985;
                vendedor: identificacion: 312, nombre: cruise, puntuacion 4;
                usuario: identificacion: 534, nombre: tom, ubicacion: panama, panama;
                dateTime: 2023-10-13 13:42:18;
                ubicacionToEnviar: Rio Abajo;
                articulos: 
                    [
                        nombre: Fiat way,
                        descipcion: La versión de Fiat que brinda confort y a un precio accesible,
                        costo: 14500,
                        moneda: USD,
                        categoria: autos,
                    ],
                    [
                        nombre: Suzuki Celerio,
                        descripcion: Potenciá tu actitud con Onix Joy que, además de destacarse por su diseño juvenil y moderno, te ofrecé una óptima autonomía, un desempeño equilibrado y el máximo confort interior. Ya sea un viaje largo o un simple paseo por la ciudad, el confort es uno de los puntos fuertes del Onix. Esta versión incluye aire acondicionado, asientos tapizados en tela y gran espacio interior que te garantiza el máximo confort,
                        costo: 12000,
                        moneda: USD,
                        categoria: autos,
                    ]
                """;

        Lexer lexer = new Lexer(List.of(input.split(";")));

    }


}