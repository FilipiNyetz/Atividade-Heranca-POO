public class Main {
    public static void main(String[] args) {
        veiculo veiculo1 = new veiculo("Citroen", 2010, "C3" );
        carro carro1 = new carro("Fiat", 2000, "palio", 4);
        moto moto1 = new moto("Honda", 2020, "CG 160", false);

        veiculo1.apresentarInformacoes();
        veiculo1.acelerar();

        System.out.println("-".repeat(10));

        carro1.apresentarInformacoes();
        carro1.abrirPortaMalas();

        System.out.println("-".repeat(10));

        moto1.apresentarInformacoes();
        moto1.empinar();

    }
}