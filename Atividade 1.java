class Carro {
    private String Marca;
    private String Modelo;
    private int ano;
    private String cor;
    private float velatual;

    public Carro(String Marca, String Modelo, int ano, String cor, float velatual) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.ano = ano;
        this.cor = cor;
        this.velatual = velatual;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getano() {
        return ano;
    }

    public String getcor() {
        return cor;
    }

    public float getvelatual() {
        return velatual;
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Impala", 1967, "Preto", 180);

        System.out.printf("Marca: %s\n", carro1.getMarca());
        System.out.printf("Modelo: %s\n", carro1.getModelo());
        System.out.printf("Ano: %d\n", carro1.getano());
        System.out.printf("Cor: %s\n", carro1.getcor());
        System.out.printf("Velocidade Atual: %.1f\n", carro1.getvelatual());
    }
}
