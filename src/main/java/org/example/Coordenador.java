package org.example;

import java.util.HashMap;
import java.util.Map;

public class Coordenador implements Cargo {
    private static final double SALARIO_BASE = 1000;

    // Percentuais de aumento por escolaridade
    private static final Map<Escolaridade, Double> AUMENTOS = new HashMap<Escolaridade, Double>();

    static {
        AUMENTOS.put(Escolaridade.MEDIO, 0.0);
        AUMENTOS.put(Escolaridade.GRADUACAO, 0.10);
        AUMENTOS.put(Escolaridade.MESTRADO, 0.20);
        AUMENTOS.put(Escolaridade.DOUTORADO, 0.30);
    }

    public double calcularSalario(Escolaridade escolaridade, int horasTrabalhadas) {
        Double aumento = AUMENTOS.get(escolaridade);
        return SALARIO_BASE + (SALARIO_BASE * aumento);
    }
}
