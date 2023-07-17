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
            return this.saldo + this.taxaDeJuros * this.saldo;
        } else {
            return this.saldo;
        }
    }
    
    public double saque(double sacar){
        if (sacar > (getSaldo()) || sacar <= 0){
                return 0;
                }
            else {
                return getSaldo() - sacar;
        }   
        
    }

    public double getDesposito(){
        return this.saldo += this.desposito;
    }
}
