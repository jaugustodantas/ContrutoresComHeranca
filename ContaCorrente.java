public  class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero){
        //construtor especifico da classe mãe
        super(agencia,numero);
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + 0.2) ;
    }

}