package com.estudo;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class FileManager {
    
    public static List<Empresa> lerEmpresas(String arquivo) throws IOException {
        List<Empresa> empresas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int linhaNum = 0;
            
            while ((linha = br.readLine()) != null) {
                linhaNum++;
                try {
                    String[] partes = linha.split(" \\| ");
                    if (partes.length == 3) {
                        String valorStr = partes[2].trim()
                            .replaceAll("[^\\d]", "");
                        
                        if (valorStr.isEmpty()) {
                            System.err.println("Valor vazio na linha " + linhaNum);
                            continue;
                        }
                        
                        long valor = Long.parseLong(valorStr);
                        empresas.add(new Empresa(
                            partes[0].trim(),
                            partes[1].trim(),
                            valor
                        ));
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Erro na linha " + linhaNum + ": " + linha);
                }
            }
        }
        return empresas;
    }

    public static void escreverEmpresas(String arquivo, List<Empresa> empresas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Empresa emp : empresas) {
                bw.write(emp.toString());
                bw.newLine();
            }
        }
    }
}