    class carro{
        private String Marca;
        private String Modelo;
        private int ano;
        private char cor;
        private float velatual;
    }
    
    Carro(String Marca, String Modelo, int ano, char cor, float velatual) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.ano = ano;
        this. cor = cor;
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
    public char getcor() {
        return cor;
    }
    public float getvelatul() {
        return velatual;
    }
    public class Main {
        public static void main(String[] args) {
            Carro carro1 = new Carro("Chevrolet", "Impala", 1967, preto, 180);
            
            System.out.println("Marca: " + carro1.getMarca()); 
            System.out.println("Modelo: " + carro1.getModelo()); 
            System.out.println("Ano: " + carro1.getano()); 
            System.out.println("Cor: " + carro1.getcor()); 
            System.out.println("Velocidade Atual: " + carro1.velatual()); 
        }
    }

