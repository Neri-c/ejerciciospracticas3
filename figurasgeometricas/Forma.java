package figurasgeometricas;

public abstract class Forma implements Calculable {
    @Override
    public abstract double calcularArea();
    @Override
    public abstract double calcularPerimetro();
}

