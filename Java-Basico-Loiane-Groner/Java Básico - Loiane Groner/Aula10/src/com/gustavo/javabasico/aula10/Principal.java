
package com.gustavo.javabasico.aula10;

public class Principal {
    
    public static void main(String[] args) {
        
        // Declaração de variáveis
        int idade;
        String nome; // classe 
        String nomeDoMeuCachorro;
        int anoDeNascimento;
        int anoAtual;
        int valor1;
        int valor2;
        int subtracaoValor1Valor2;
        
        // Atribuição de valores
        idade = 23;
        nome = "Gustavo";
        nomeDoMeuCachorro = "Max";
        anoAtual = 2015;
        anoDeNascimento = anoAtual - idade;
        valor1 = 18;
        valor2 = 5;
        
        // Operação aritmética
        subtracaoValor1Valor2 = valor1 - valor2;
        
        // Saída de valores
        System.out.println("Minha idade: " + idade);
        System.out.println("Meu nome: " + nome);
        System.out.println("Nome do meu cachorro: " + nomeDoMeuCachorro);
        System.out.println("Ano do meu nascmento: " + anoDeNascimento);
        System.out.println(valor1 + " + " +  valor2 +  " = " + subtracaoValor1Valor2);
    }
    
} // chave da classe principal
