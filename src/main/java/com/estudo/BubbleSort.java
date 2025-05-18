package com.estudo;

import java.util.List;

public class BubbleSort {
    
    public static void ordenarEmpresas(List<Empresa> empresas) {
        int n = empresas.size();
        boolean trocou;
        
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (empresas.get(j).getValor() < empresas.get(j + 1).getValor()) {
                    Empresa temp = empresas.get(j);
                    empresas.set(j, empresas.get(j + 1));
                    empresas.set(j + 1, temp);
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
}