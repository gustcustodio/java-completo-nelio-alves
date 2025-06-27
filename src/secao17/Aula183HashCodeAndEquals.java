package secao17;

import secao17.wildcard2.Client;

public class Aula183HashCodeAndEquals {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Joao", "joao@gmail.com");

        String s1 = new String("Teste");
        String s2 = new String("Teste");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2); // compara referência
        System.out.println(s1.equals(s2)); // compara conteúdo
    }
}
