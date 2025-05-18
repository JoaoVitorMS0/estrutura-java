package com.estudo;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String arquivoEntrada = "Empresas_BubbleSort.txt";
        String arquivoSaida = "Empresas_Ordenadas.txt";
        
        if (!new File(arquivoEntrada).exists()) {
            System.err.println("Arquivo de entrada não encontrado!");
            return;
        }

        try {
            System.out.println("Lendo arquivo...");
            List<Empresa> empresas = FileManager.lerEmpresas(arquivoEntrada);
            
            if (empresas.isEmpty()) {
                System.err.println("Nenhuma empresa válida encontrada!");
                return;
            }
            
            System.out.println("Ordenando " + empresas.size() + " empresas...");
            long inicio = System.currentTimeMillis();
            BubbleSort.ordenarEmpresas(empresas);
            long tempo = System.currentTimeMillis() - inicio;
            
            System.out.println("Tempo de ordenação: " + tempo + " ms");
            System.out.println("Salvando arquivo ordenado...");
            FileManager.escreverEmpresas(arquivoSaida, empresas);
            
            System.out.println("Processo concluído! Arquivo gerado: " + 
                new File(arquivoSaida).getAbsolutePath());
            
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}