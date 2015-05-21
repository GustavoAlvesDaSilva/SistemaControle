
package com.gustavo.javabasico.aula11.handson;

public class Curiosidades {
    
    public static void main(String[] args) {
        
        int var1 = 2147483647;
        int var2 = 1;
        
        System.out.println(var1 + var2);
        
        double notacao = 12e3;
        
        System.out.println(notacao);
        
        /*
        -- JAVA 7 -- 
        long creditCardNumber = 1234_5678_9012_3456L;
        long cpf = 101_134_156_68L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        */
        
        // Não pode colocar underscore perto do ponto
        //float pi1 = 3_.1415F;
        // Não pode colocar underscore perto de ponto
        // float pi1 = 3._1415F;
        // Não pode colocar underscore perto de sufixos (L)
        // long cpf = 101_134_156_68_L;
        
    }
    
}
