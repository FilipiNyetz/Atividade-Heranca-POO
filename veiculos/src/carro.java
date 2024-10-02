public class carro extends veiculo {
    int portas;
    public carro(String marca, int ano, String modelo,int portas) {
        super(marca, ano, modelo);
        this.portas=portas;
    }

    public int getPortas() {
        return portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo porta malas...");
    }

    @Override
    public void apresentarInformacoes() {
        super.apresentarInformacoes();
        System.out.println("número de portas: " + getPortas());
    }

}
