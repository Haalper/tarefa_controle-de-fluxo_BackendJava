public class Main {
    public static void main(String args[]) {
        double português = 8;
        double matemática = 7;
        double história = 8;
        double geografia = 5;

        double soma = português + matemática + história + geografia;

        double media = soma / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Parabéns, você está Aprovado");
        } else if (media >= 5) {
            System.out.println("Você está de Recuperação");
        } else {
            System.out.println("Você está Reprovado");
        }

    }
}