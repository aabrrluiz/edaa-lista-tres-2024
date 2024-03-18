import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
        "Breno Vinicius", "Vinícius Raphael",
        "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
        "Felipe dos Santos",
        "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
        "Henrique Cezar",
        "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
        "Marcus Paulo",
        "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino",
        "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
        "Vinicius Garcia",
        "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves",
        "Lucas Marques",
        "Marcela Maria" };

     for(String nome: nomes){
    Random random = new Random();
     int idade = random.nextInt(58) +17;
     Pessoa pessoa = new Pessoa(nome, idade);
     listaPessoas.add(pessoa);
     }

  Collections.sort(listaPessoas);

  

  for(Pessoa p: listaPessoas){
  System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade());
    }
   
}
}

    