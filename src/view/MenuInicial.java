package view;

import java.util.Scanner;

public class MenuInicial {
    Scanner scanner=new Scanner(System.in);
    int selec;

    public void exibirMenuPrincipal(){
        System.out.println("========== FILMES UNIFOR ===========");
        System.out.println("Por favor digite o número correspodente a opção que seja gerenciar: ");
        System.out.println("1-CINEMA | 2-FILMES | 3-SESSAO | 4- INGRESSO | 5 -FUNCIONARIOS");
        System.out.println("Escolha uma opção: ");

        selec = scanner.nextInt();
        scanner.nextLine();

         switch (selec){
             case 1->
             case 2-> new FilmeView().exibirMenuFilme();
             case 3->
             case 4->
             case 5->
         }


    }

}
