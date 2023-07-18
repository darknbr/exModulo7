public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "{" +
            " diaAniversario='" + getDiaAniversario() + "'" +
            ", taxaDeJuros='" + getTaxaDeJuros() + "'" +
            "}";
    }

    public int getDiaAniversario() {
        return this.diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public double getTaxaDeJuros() {
        return this.taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getSaldo(){
        if(diaAniversario >= 20){
            return this.saldo + (this.taxaDeJuros * this.saldo);
        } else {
            return this.saldo;
        }
    }
    
    public boolean saque(double sacar){

        double disponivelParaSaque = getSaldo();
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
}
