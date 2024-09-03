package org.example;

public class Administrador implements Cargo {
    private static final double SALARIO_BASE = 1000;

    public double calcularSalario(Escolaridade escolaridade, int horasTrabalhadas) {
        // Salário do Administrador é sempre o Salário Base
        return SALARIO_BASE;
    }
}
