import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        System.out.println("Teste");
        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("Erro! O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            System.out.println("Erro! O segundo parâmetro deve ser maior que o primeiro");
        }else {
            int contagem = parametroDois - parametroUm;
            System.out.println("contagem: " + contagem);//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        }

        //realizar o for para imprimir os números com base na variável contagem
    }
}