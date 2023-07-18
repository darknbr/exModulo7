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

    public boolean saque(double sacar){
        double disponivelParaSaque = this.chequeEspecial + this.saldo;
        if (sacar > disponivelParaSaque || sacar <= 0){
                return false;
                }
            else {
                this.saldo -= sacar;
                return true;
        }   
        
    }

    public double getDesposito(){
        return this.saldo += this.desposito;
    }  
}
