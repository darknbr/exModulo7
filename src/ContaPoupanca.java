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
    /*Na conta Poupança você pode criar uma regra bem simples onde o valor do saldo 
    pode variar dependendo do dia de aniversário da conta e da taxa de juros. */
    public double getSacar(){
        if (this.sacar > getSaldo()){
                return -1.413;// esse valor e apenas para n retornar 0 e da incompatibilidade
                }
            else{
                return getSaldo() - this.sacar;
        }
    }

    public double getDesposito(){
        return this.saldo += this.desposito;
    }
}
