public class ContaSalario extends Conta{
    private int limiteSaque;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque ) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
    }    

    public int getLimiteSaque() {
        return this.limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getSaldo(){
        return this.saldo;
    }
    
    public boolean saque(double sacar){

        double disponivelParaSaque = this.saldo;
        if (sacar > disponivelParaSaque || sacar <= 0){
                return false;
                }
            else {
                this.saldo = disponivelParaSaque - sacar;
                return true;
        }   
        
    }

    public double getDesposito(){
        return this.saldo += this.desposito;
    }

    @Override
    public String toString() {
        return "{" +
            " limiteSaque='" + getLimiteSaque() + "'" +
            "}";
    }
}
