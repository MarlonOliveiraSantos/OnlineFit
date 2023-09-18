package MercadoFit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao,escolha;
        String categoria="0",pessoa;
        List<String> alimentacao = Arrays.asList("Coma Banana", "Coma Aveia", "Coma Proteinas em geral", "Coma Grãos", "Evitar embutidos", "Evitar Margarina", "Evitar Açucares em excesso");

        while (true) {
            System.out.println("\n********* Universo Fit Online *********");
            System.out.println(" ");
            System.out.println("      1 - Curiosidades Fitness");
            System.out.println("      2 - Dicas de treino");
            System.out.println("      3 - Alimentação");
            System.out.println("      4 - Cancelar operação");
            System.out.println("***************************************");
            System.out.println(" ");
            System.out.println("Digite uma opção para prosseguir:");

            opcao = ler.nextInt();

            if (opcao == 4) {
                    System.out.println("\nVocê saiu do Mercado Fit.");
                    ler.close();
                    System.exit(0);
            }

            try {
                if (opcao == 0 || opcao > 4) {
                    throw new RuntimeException("Digite uma opção válida!");
                }
            } catch (Exception e) {
                System.err.println("\nExceção: " + e);
                ler.nextLine();
                System.out.println("\nDigite uma opção válida!");
            }

            switch (opcao) {
                case 1:
                    System.out.println("Algumas Curiosidades Fitness:\n");
                    System.out.println("A. Estudos mostram que ouvir música durante o exercício pode aumentar o desempenho e a resistência, pois pode distrair da fadiga e melhorar o humor.\n");
                    System.out.println("B. O músculo mais forte do corpo humano é o glúteo máximo, que está localizado na parte traseira da coxa.\n");
                    System.out.println("C. A endorfina, conhecida como o hormônio da felicidade, é liberada durante o exercício e pode gerar uma sensação de bem-estar e reduzir a percepção da dor.\n");
                    System.out.println("D. O exercício regular pode melhorar a função cognitiva, a memória e reduzir o risco de distúrbios neurológicos como o Alzheimer.\n");
                    break;

                case 2:
                    System.out.println("Você é Iniciante ou Avançado na musculação?");
                    categoria = ler.next();

                    if (categoria.equalsIgnoreCase("Iniciante")) {
                            ClienteCompleto p = new ClienteCompleto(" ");
                            p.basico();
                    } else if (categoria.equalsIgnoreCase("Avançado")) {
                            Dicas dicas = new Dicas();
                            dicas.exibirListaDicas();
                            for (Dicas lista : dicas.exibirListaDicas()) {
                                System.out.println(lista.texto);
                            }
                    }
                    break;
                case 3:

                    System.out.println("Aqui teremos resultados conforme a sua escolha (Digite 1 ou 2)");
                    System.out.println("1. Alimentos bons\n2. Alimentos a serem evitados");
                    escolha = ler.nextInt();

                    if (escolha == 1) {
                        List <String> alimentacaoC = alimentacao.stream()
                                .filter(x-> x.toString().startsWith("C"))
                                .collect(Collectors.toList());
                        for (String i : alimentacaoC) {
                            System.out.println(i);
                        }

                    } else if (escolha == 2) {
                        List <String> alimentacaoE = alimentacao.stream()
                                .filter(x-> x.toString().startsWith("E"))
                                .collect(Collectors.toList());
                        for (String i : alimentacaoE) {
                            System.out.println(i);
                        }
                    }
                    break;
            }
        }
    }
}
