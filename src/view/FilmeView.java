package view;

import java.util.Scanner;

public class FilmeView {
    Scanner scanner= new Scanner(System.in);
    public void exibirMenuFilme(){
        int selec;

        do {
            System.out.println("==== FILMES UNIFOR ====");
            System.out.println("DIGITE O NÚMERO CORRESPONDENTE A SUA OPÇÃO");
            System.out.println("1- CADASTRAR FILME | 2- EDITAR FILME | 3- LISTAR FILMES | 4-DELETAR FILME");
            System.out.println("5- VOLTAR AO MENU PRINCIPAL");
            System.out.println("Selecione a sua opção");

            selec=scanner.nextInt();
            scanner.nextLine();

                switch (selec){
                    case 1->
                    case 2->
                    case 3->
                    case 4->
                    case 5->
                    default->
                }
        } while (selec != 5);




    }
}
