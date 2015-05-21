
package com.gustavo.javabasico.aula11;

public class Principal {

    public static void main(String[] args) {
        /*
            Tipos Primitivos
        boolean                Números
                    Inteiro             Ponto Flutuante
             byte short int long char   float double
        */
        
        /*
            Tipos Inteiros
        BYTE
        Tamanho: 8 bits
        Intervalo de Valores: -128 a 127
        -( 2 ^ 7 ) a 2 ^ 7 -1 
        
        SHORT 
        Tamanho: 16 bits
        Intervalo de Valores: -32.768 a 32.767
        - ( 2 ^ 15) a 2 ^ 15 - 1 
        
        INT
        Tamanho: 32 bits
        Intervalo de Valores: -2.147.483.648 a 2.147.483.647
        - ( 2 ^ 31 ) a 2 ^ 31 - 1
        
        LONG
        Tamanho: 64 bits
        Intervalo de Valores; - 9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        - ( 2 ^ 63 ) a 2 ^ 63 - 1
        */
        
        /*
            Pontos Flutuantes
        FLOAT 
        Tamanho: 32 bits
        
        DOUBLE
        Tamanho: 64 bits
        */
        
        // Char = 1 caractere
        // Char pode ser um inteiro representado na tabela ASCII
        // http://pt.wikipedia.org/wiki/ASCII
        
        // Declaração de variáveis
        char o = 111;
        char i = 105;
        char valor1 = 'a';
        char valor2 = 'g';
        char interrogacao = 0x00E1; // caractere unicode
        
        // Saída dos valores
        System.out.println("o = " + o);
        System.out.println("i = " + i);
        
        System.out.println(valor1 + valor2);
        System.out.println("" + valor1 + valor2); // forma de exibir as letras ao invés de somar os valores do char
        System.out.println("" + interrogacao);
        
        // Unicode: http://en.wikipedia.org/wiki/List_of_Unicode_characters
        
        // Booleanos = TRUE ou FALSE
    }
    
}
