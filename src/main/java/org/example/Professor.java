package org.example;

import java.util.HashMap;
import java.util.Map;

public class Professor implements Cargo {
    private static final double SALARIO_BASE = 1000;
    private static final double VALOR_HORA = 50;

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
        return (VALOR_HORA * horasTrabalhadas) + (SALARIO_BASE * aumento);
    }
}
