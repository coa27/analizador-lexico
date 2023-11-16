package org.example;

import org.example.analizador.Analizador;
import org.example.lexer.Lexer;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        //precios de productos
        //marca del producto
        //correo del cliente
        //pendiente en proceso entregado enviado
        String input = """
                <?xml version="1.0" encoding="UTF-8"?>
                     <transacciones>
                         <transaccion>
                             <id>1</id>
                             <fecha>2023-11-01</fecha>
                             <monto>120.50</monto>
                             <cliente>
                                 <id>123</id>
                                 <nombre>Cliente1</nombre>
                                 <correo>cliente1@example.com</correo>
                                 <direccion>
                                     <calle>Calle Principal</calle>
                                     <ciudad>Ciudad A</ciudad>
                                     <codigo_postal>12345</codigo_postal>
                                 </direccion>
                             </cliente>
                             <productos>
                                 <producto>
                                     <tipo>laptop</tipo>
                                     <marca>HP Pavilion</marca>
                                     <precio>899.99</precio>
                                     <caracteristicas>
                                         <procesador>Intel Core i5</procesador>
                                         <ram>8GB</ram>
                                         <almacenamiento>512GB SSD</almacenamiento>
                                     </caracteristicas>
                                 </producto>
                                 <producto>
                                     <tipo>accesorio</tipo>
                                     <marca>Ratón inalámbrico</marca>
                                     <precio>20.00</precio>
                                 </producto>
                             </productos>
                             <recomendaciones>
                                 <oferta_especial>
                                     <producto_tipo>laptop</producto_tipo>
                                     <descuento>10%</descuento>
                                 </oferta_especial>
                                 <recomendacion_personalizada>
                                     <producto_tipo>accesorio</producto_tipo>
                                     <mensaje>¡Complementa tu compra con un ratón gaming!</mensaje>
                                 </recomendacion_personalizada>
                             </recomendaciones>
                         </transaccion>
                         <transaccion>
                             <id>2</id>
                             <fecha>2023-11-02</fecha>
                             <monto>45.99</monto>
                             <cliente>
                                 <id>456</id>
                                 <nombre>Cliente2</nombre>
                                 <correo>cliente2@example.com</correo>
                                 <direccion>
                                     <calle>Avenida Secundaria</calle>
                                     <ciudad>Ciudad B</ciudad>
                                     <codigo_postal>54321</codigo_postal>
                                 </direccion>
                             </cliente>
                             <productos>
                                 <producto>
                                     <tipo>tablet</tipo>
                                     <marca>Samsung Galaxy Tab</marca>
                                     <precio>299.99</precio>
                                     <caracteristicas>
                                         <sistema_operativo>Android</sistema_operativo>
                                         <tamano_pantalla>10 pulgadas</tamano_pantalla>
                                     </caracteristicas>
                                 </producto>
                             </productos>
                             <recomendaciones>
                                 <oferta_del_dia>
                                     <producto_tipo>tablet</producto_tipo>
                                     <descuento>15%</descuento>
                                 </oferta_del_dia>
                             </recomendaciones>
                         </transaccion>
                         <!-- Otras transacciones... -->
                     </transacciones>
                """;

        Lexer lexer = new Lexer();
        List<String> tokens = lexer.generarToken(input);
        Analizador analizador = new Analizador(tokens);

    }


}