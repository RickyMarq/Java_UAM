package javaapplication7;

public class Lutador {
    private String name;
    private String nacionalidade;
    private int idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
        System.out.println("Lutador: " + name);
    }
    
    public void status() {
        System.out.println("Nome: " + name);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("peso: " + peso);
        System.out.println("categoria: " + categoria);
        System.out.println("vitórias " + vitorias);
        System.out.println("derrotas " + derrotas);
        System.out.println("empates" + empates);
    }
    
    public void ganharLuta() {
        System.out.println("O lutador " + name + "ganhou a luta");
    }
    
    public void perderLuta() {
        System.out.println("O lutador " + name + "perdeu a luta");
    }
    
    public void empatarLuta() {
        System.out.println("Os lutadores empataram");
    }
       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
}
