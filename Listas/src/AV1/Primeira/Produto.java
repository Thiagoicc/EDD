package AV1.Primeira;

public class Produto {
    private int codProd,
                quantProd;

    private double precProd;

    public Produto() {

    }

    public Produto(int codProd, int quantProd, double precProd) {
        this.codProd = codProd;
        this.quantProd = quantProd;
        this.precProd = precProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getQuantProd() {
        return quantProd;
    }

    public void setQuantProd(int quantProd) {
        this.quantProd = quantProd;
    }

    public double getPrecProd() {
        return precProd;
    }

    public void setPrecProd(double precProd) {
        this.precProd = precProd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProd=" + codProd +
                ", quantProd=" + quantProd +
                ", precProd=" + precProd +
                '}';
    }
}
