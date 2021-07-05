public class Conta {
  
private int numero;
private double saldo;
private double limite;
private String nome;

  public boolean saca(double valor){
    return true;
  }
  
  public void deposita(double valor){
    this.saldo = saldo + valor;
  }
  
  public int getNumero(){
    return numero;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }
  public double getSaldo(){
    return saldo;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }
  public double getLimite(){
    return limite;
  }
  public void setLimite(double limite){
    this.limite = limite;
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  
  
}