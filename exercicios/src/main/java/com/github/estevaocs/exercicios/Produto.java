package com.github.estevaocs.exercicios;

/**
 *Classe contendo o Metodo de produto() que realiza a multiplicação de dois 
 * numeros
 * 
 * @author Estevão Cristino da Silva
 * @version 1.0
 */
public class Produto {

    /**
     * Metodo que faz a multiplicação atravez de soma
     *
     * @param a fator
     * @param b fator
     * @return o produto dos fatores
     * @throws IllegalArgumentException - os fatores a e b nao podem ser
     * negativos
     *
     */
    public static int produto(int a, int b) throws IllegalArgumentException {
        int s; //soma das parcelas
        int i;// valor da parcela
        int totalParcelas = a; //total de parcelas
        int parcela = b; // parcelas

        if (a < 0) {
            throw new IllegalArgumentException("os fatores não podem ser"
                    + " negativos");
        }

        if (b < 0) {
            throw new IllegalArgumentException("os fatores não podem ser"
                    + " negativos");
        }

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }// fim if

        s = 0;

        for (i = 0; i < totalParcelas; i++) {
            s += parcela;
        }// fim for

        return (s); // retornando o valor da soma das parcelas

    }//fim método

}// fim classe
