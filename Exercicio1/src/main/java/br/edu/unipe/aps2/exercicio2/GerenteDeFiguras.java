package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        double maior = 0;
        for (FiguraGeometrica figura : figuras) {
            double area = figura.calculaArea();
            if (area > maior) {
                maior = area;
            }
        }
        return maior;
    }

    public double getAreaTotal() {
        double soma = 0;
        for (FiguraGeometrica figura : figuras) {
            soma += figura.calculaArea();
        }
        return soma;
    }
}
