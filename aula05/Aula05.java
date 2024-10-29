package aula05;

public class Aula05 {
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumeroConta(1220);
       p1.setDono("Ana Julia");
       p1.abrirConta("Conta corrente");
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumeroConta(1234);
       p2.setDono("Rosa Maria");
       p2.abrirConta("Conta poupança");

       p1.depositar(300);
       p2.depositar(500);
       p2.sacar(100);
       
       p1.estadoAtual();
       p2.estadoAtual();
    }
}
