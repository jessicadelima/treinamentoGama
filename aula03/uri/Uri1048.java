package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario;
        float reajuste, novoSalario;

        salario = in.nextFloat();
        in.close();

        if (salario > 2000) {
            reajuste = salario*0.04f;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 4 %");
        } else {
            if (salario > 1200) {
                reajuste = salario*0.07f;
                novoSalario = salario + reajuste;
                System.out.printf("Novo salario: %.2f\n",novoSalario);
                System.out.printf("Reajuste ganho: %.2f\n",reajuste);
                System.out.println("Em percentual: 7 %");
            } else {
                if (salario > 800) {
                    reajuste = salario*0.1f;
                    novoSalario = salario + reajuste;
                    System.out.printf("Novo salario: %.2f\n",novoSalario);
                    System.out.printf("Reajuste ganho: %.2f\n",reajuste);
                    System.out.println("Em percentual: 10 %");
                } else {
                    if (salario > 400) {
                        reajuste = salario*0.12f;
                        novoSalario = salario + reajuste;
                        System.out.printf("Novo salario: %.2f\n",novoSalario);
                        System.out.printf("Reajuste ganho: %.2f\n",reajuste);
                        System.out.println("Em percentual: 12 %");
                    } else {
                        reajuste = salario*0.15f;
                        novoSalario = salario + reajuste;
                        System.out.printf("Novo salario: %.2f\n",novoSalario);
                        System.out.printf("Reajuste ganho: %.2f\n",reajuste);
                        System.out.println("Em percentual: 15 %");
                    }
                }
            }
        }
    }
}