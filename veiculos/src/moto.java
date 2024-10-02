public class moto extends veiculo {
    public boolean carenagem;
    public moto(String marca, int ano, String modelo,boolean carenagem) {
        super(marca, ano, modelo);
        this.carenagem=carenagem;
    }
    public boolean temCarenagem(){
        return carenagem;
    }

    public void empinar(){
        System.out.println("244... RANDANDAN");
    }

    @Override
    public void apresentarInformacoes() {
        super.apresentarInformacoes();
        if (temCarenagem()){
            System.out.println(("Tem carenagem"));
        }else{
            System.out.println("Nao tem carenagem");
        }
    }

}
