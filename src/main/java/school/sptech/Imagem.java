package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();


    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaAreas = 0.0;

        for (Figura figura : figuras) {
            somaAreas += figura.calcularArea();

        }
        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figuraAreasMaior = new ArrayList<>();

        for (int i = 0; i < figuras.size(); i++) {
            Figura figuraDaVez = figuras.get(i);
            if (figuraDaVez.calcularArea() > 20) {
                figuraAreasMaior.add(figuraDaVez);
            }
        }
        return figuraAreasMaior;
    }

    public List<Figura> buscarQuadrados() {
       List<Figura> quadrados = new ArrayList<>();

        for (Figura figura : figuras) {
        if (figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }
        return quadrados;
    }
}
