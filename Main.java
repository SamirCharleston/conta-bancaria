import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean parar = false;
        System.out.println("Insira um nome para a conta:");
        String nomeCompleto = scanner.nextLine();
        ContaBancaria contaBancaria = new ContaBancaria(nomeCompleto);
        scanner.reset();
//        scanner = new Scanner(System.in);
        while(!parar){
            contaBancaria.imprimeDados();
            System.out.println("O que deseja fazer? \n");
            System.out.println(" Deposito - 1\n");
            System.out.println(" Resgate - 2 \n");
            System.out.println(" Investir - 3 \n");
            System.out.println(" Imprimir - 4 \n");
            System.out.println(" Sair - 5 \n");

            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Insira valor do Deposito: ");
                    contaBancaria.deposito(scanner.nextBigDecimal().doubleValue());
                    break;
                case 2:
                    System.out.println("Insira valor do Resgate: ");
                    if(contaBancaria.resgate(scanner.nextBigDecimal().doubleValue()))
                        System.out.println("Operacao realizada com sucesso!");
                    else
                        System.out.println("Operacao fracassou!");
                    break;

                case 3:
                    System.out.println("Insira valor do Investimento: ");
                    if(contaBancaria.investimento(scanner.nextBigDecimal().doubleValue())) {
                        System.out.println("Operacao realizada com sucesso!");
                        contaBancaria.bonus();
                    }
                    else {
                        System.out.println("Operacao fracassou!");
                    }
                    break;
                case 4:
                    contaBancaria.imprimeDados();
                    break;
                case 5:
                    return;
            }

        }
    }
}
