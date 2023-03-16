public class Passageiro extends pessoa{
   
  String NomePassageiro;
  int Telefone;
  double Saldo;
  int Nota;
  
        Passageiro(String nome, int nota, double saldo, int telefone){
        this.NomePassageiro = nome;
        this.Nota = nota;
        this.Saldo = saldo;
        this.Telefone = telefone;
    
        }

        public String getNomePassageiro() {
            return NomePassageiro;
        }

        public void setNomePassageiro(String nomePassageiro) {
            NomePassageiro = nomePassageiro;
        }

        public int getTelefone() {
            return Telefone;
        }

        public void setTelefone(int telefone) {
            Telefone = telefone;
        }

        public double getSaldo() {
            return Saldo;
        }

        public void setSaldo(double saldo) {
            Saldo = saldo;
        }

        public int getNota() {
            return Nota;
        }

        public void setNota(int nota) {
            Nota = nota;
        }

    
}
