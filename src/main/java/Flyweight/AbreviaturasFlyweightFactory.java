package Flyweight;

import Modelos.Alumno;

import java.util.HashMap;
import java.util.Map;

public class AbreviaturasFlyweightFactory extends Alumno {

    private static HashMap<String, String> cacheAbreviaturas = new HashMap<String, String>();

    public AbreviaturasFlyweightFactory() { }

    public static String getOperacionAbreviatura(String nota) {
        HashMap<String, String> abreviaturaNota = AbreviaturasFlyweightFactory.cacheAbreviaturas;
        AbreviaturasFlyweightFactory obj = new AbreviaturasFlyweightFactory();
        obj.cargaMemoriaCache();
        String nota_letra = "";
        for (Map.Entry<String, String> entry : abreviaturaNota.entrySet()) {
            String clave = entry.getKey();
            String notaAbreviada = entry.getValue();

            if (clave.equalsIgnoreCase(nota)) {
                nota_letra = notaAbreviada;
                return nota_letra;
            }
        }
        nota_letra = String.valueOf(nota.charAt(0)) + String.valueOf(nota.charAt(1));
        cacheAbreviaturas.put(nota,nota_letra);
        return nota_letra;
    }

    public static HashMap<String, String> getCacheAbreviaturas() {
        return cacheAbreviaturas;
    }

    public void cargaMemoriaCache() {
        cacheAbreviaturas.put("0", "C");
        cacheAbreviaturas.put("1", "C");
        cacheAbreviaturas.put("2", "C");
        cacheAbreviaturas.put("3", "C");
        cacheAbreviaturas.put("4", "C");
        cacheAbreviaturas.put("5", "C");
        cacheAbreviaturas.put("6", "C");
        cacheAbreviaturas.put("7", "C");
        cacheAbreviaturas.put("8", "C");
        cacheAbreviaturas.put("9", "C");
        cacheAbreviaturas.put("10", "C");
        cacheAbreviaturas.put("11", "B");
        cacheAbreviaturas.put("12", "B");
        cacheAbreviaturas.put("13", "B");
        cacheAbreviaturas.put("14", "B");
        cacheAbreviaturas.put("15", "B");
        cacheAbreviaturas.put("16", "A");
        cacheAbreviaturas.put("17", "A");
        cacheAbreviaturas.put("18", "A");
        cacheAbreviaturas.put("19", "A");
        cacheAbreviaturas.put("20", "A");
    }

}
