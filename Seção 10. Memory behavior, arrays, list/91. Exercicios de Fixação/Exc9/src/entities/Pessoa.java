package entities;

public class Pessoa {
    int nPessoa;
    String[] name = new String[nPessoa];
    int[] idade = new int[nPessoa];

    public Pessoa(String[] name, int[] idade) {
        this.name = name;
        this.idade = idade;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public String toString() {
        return "name:" + name + "idade" + idade;
    }
}