public class Banco
{
	public static void main(String[] args) {
		
		//instancias
		ContaBancaria conta = new ContaBancaria("Guilherme", 1000f);
		conta.depositar(500f); //Dinheiro a ser depositado
		conta.sacar(250f);    //Dinheiro a ser sacado 
		
		System.out.println("Titular: " +conta.getTitular());
		System.out.println("saldo: "+ conta.getSaldo());
	}
}

//classe  conta bancaria 
class ContaBancaria{
    private String titular;
    float saldo;
    
    //construtor 
    public ContaBancaria(String titular, float saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //metodo para depositar 
    public void depositar(float valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Valor invalido para deposito");
        }
    }
    
    //metodo para sacar
    public void sacar(float valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("saque realizado com sucesso");
        }else{
            System.out.println("saldo insuficiente para saque");
            System.out.println("valor: " + saldo); 
        }   
    }
    
    //getters e setters
    public String getTitular() { return titular;}
    public void settitular(String titular) { this.titular = titular;}
    
    public float getSaldo() { return saldo;}
    public void setSaldo(float saldo) { this.saldo = saldo;}
    
}
