//aqui teremos um programa onde poderemos trocar os valores das duas variaveis sem precisar criar uma nova variavel pra isso
public class Main {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;

        for (int i = 0; i < 1; i++) /*um for para incrementar os valores*/ {
            A = A + B; //'A' vai receber o valor de A+B e comeca a valer 15
            B = A - B; //'B' vai receber o valor original do 'A', ou seja, antes de A+B (comeca a valer 5 pois fica 15-10)
            A = A - B; //'A' vai receber entao o valor original de 'B' (comeca a valer 10 pois fica 15-5)
        }

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("Vamo fúria!!!!!!!!!!");

    }
}