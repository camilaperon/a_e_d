package aulas;

class Pessoa{
    int idade;
    String nome;
    int altura;
}
class Dados{
    String nome;
    String dataNascimento;
    String email;
    Endereco endereco;

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        
    
    }
}
class Endereco{
    String rua;
    int num;
    String cep;
    String cidade;
    String estado;
    String pais;

    public void mostar(){
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + num);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("País: " + pais);
    }
}

public class Aula32 {

public static void aula(){
        System.out.println("## REGISTROS ##");
        ex01();
        ex02();
        ex03();
    }

public static void ex01(){
    Pessoa darlon = new Pessoa();
    Pessoa camila = new Pessoa();

    darlon.idade = 21;
    darlon.nome = "Darlon Vasata";
    darlon.altura = 183;
    mostrarPessoa(darlon);

    camila.idade = 19;
    camila.nome = "Camila de Sales Peron";
    camila.altura = 157;
    mostrarPessoa(camila);
}

public static void mostrarPessoa(Pessoa p){
    System.out.println("Nome" + p.nome);
    System.out.println("Idade" + p.idade);
    System.out.println("Nome" + p.altura);
}

public static void ex02(){
    Dados pessoa1 = new Dados();

    pessoa1.nome = "Gustavo Portes Dagostim";
    pessoa1.dataNascimento = "01/12/2004";
    pessoa1.email = "gpDagostin@gmail.com";
    pessoa1.endereco.rua = "Rua. lira";
    pessoa1.endereco.num = 10;
    pessoa1.endereco.cep = "85814-700";
    pessoa1.endereco.cidade = "Cascavel";
    pessoa1.endereco.estado = "Paraná";
    pessoa1.endereco.pais = "Brasil";
    pessoa1.mostrar();
    
}

public static void ex03(){
    Dados[] pessoas = new Dados[10];

    for(int i=0; i<pessoas.length; i++){
        pessoas[i] = new Dados();

        pessoas[i].nome = "";
        pessoas[i].dataNascimento = "";
        pessoas[i].email = "";
        pessoas[i].endereco.rua = "";
        pessoas[i].endereco.num = 0;
        pessoas[i].endereco.cep = "";
        pessoas[i].endereco.cidade = "";
        pessoas[i].endereco.estado = "";
        pessoas[i].endereco.pais = "";
    }
}
}
