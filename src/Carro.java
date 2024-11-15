public class Carro {
   String marca;
   String modelo;
   int ano;

   public Carro(String marca, String modelo, int ano){
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
   }

   public void exibirInformacoes(){
      System.out.println("Seu carro é o carro da marca: " + marca + ", do modelo: " + modelo + " e ano: " + ano);
   }
}
