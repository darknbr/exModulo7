public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;   
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
            " chequeEspecial='" + getChequeEspecial() + "'" +
            "}";
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public double getSaldo(){
        return this.saldo + chequeEspecial;
    }

    public double saque(double sacar){
        if (sacar > (getSaldo()) || sacar <= 0){
                return 0;
                }
            else {
                return this.saldo = getSaldo() - sacar;
        }   
        
    }

    public double getDesposito(){
        return this.saldo += this.desposito;
    }  
}
