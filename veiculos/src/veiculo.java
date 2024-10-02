public class veiculo {
    public String marca;
    public int ano;
    public String modelo;

    public veiculo(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando....");
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void apresentarInformacoes(){
        System.out.println("A marca e: " + getMarca() );
        System.out.println("O modelo e: " +getModelo());
        System.out.println("O ano e: "+ getAno());
    }
}
