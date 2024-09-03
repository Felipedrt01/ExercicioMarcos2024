package org.example;

public class SalarioCalculator {

    public static void main(String[] args) {
        Cargo adm = new Administrador();
        Cargo coordenador = new Coordenador();
        Cargo professor = new Professor();

        // Teste de todas as combinações
        Escolaridade[] escolaridades = Escolaridade.values();
        for (int i = 0; i < escolaridades.length; i++) {
            Escolaridade escolaridade = escolaridades[i];
            System.out.println("Escolaridade: " + escolaridade);

            // Calcula e imprime o salário para Administrador
            System.out.println("Salário Administrador: " + adm.calcularSalario(escolaridade, 0));

            // Calcula e imprime o salário para Coordenador
            System.out.println("Salário Coordenador: " + coordenador.calcularSalario(escolaridade, 0));

            // Calcula e imprime o salário para Professor com 20 horas de trabalho
            int horasTrabalhadas = 20;
            System.out.println("Salário Professor com " + horasTrabalhadas + " horas: " + professor.calcularSalario(escolaridade, horasTrabalhadas));

            System.out.println();
        }
    }
}
