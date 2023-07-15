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

    @Override
    public String toString() {
        return "{" +
            " limiteSaque='" + getLimiteSaque() + "'" +
            "}";
    }
}
