class Main {
  public static void main(String[] args) {
  
   
  Conta conta1 = new Conta();
  conta1.setNome("João");
  conta1.setNumero(814);
  conta1.setSaldo(1000);
  conta1.setLimite(100);
  System.out.println("Conta de " + conta1.getNome());
  System.out.println("Seu saldo é de " + conta1.getSaldo());
  System.out.println("Depositando na conta...");
  conta1.deposita(100);
  System.out.println("Seu saldo é de " + conta1.getSaldo());
  
  System.out.println("--------------------------------------");
  
  Conta conta2 = new Conta();
  conta2.setNome("Maria");
  conta2.setNumero(2751);
  conta2.setSaldo(2000);
  conta2.setLimite(200);
  System.out.println("Conta de " + conta2.getNome());  
  System.out.println("Número da conta: " + conta2.getNumero());
  System.out.println("Saldo: " + conta2.getSaldo());
  System.out.println("Limite: " + conta2.getLimite());
  
  }
 }