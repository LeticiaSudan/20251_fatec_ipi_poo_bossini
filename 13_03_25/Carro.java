public class Carro{
    private String nome;
    private String marca;


    public Carro(String nome, String marca) {
        this.setNome(nome);
        this.setMarca(marca);
    }

    public void setNome(String nome){
        this.nome = nome;
    }   
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getNome(){
        return this.nome;
    }
    public String getMarca(){
        return this.marca;
    }

    public void ligar(){
        System.out.println("O carro \"" + this.nome + "\" esta ligado!");
    }  
    public void desligar(){
        System.out.println("O carro \"" + this.nome + "\" esta desligado!");
    }
}