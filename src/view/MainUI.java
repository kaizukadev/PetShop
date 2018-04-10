package view;

import util.Console;
import view.menu.MainMenu;

public class MainUI {

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt(" Digite sua opção: ");
            switch (opcao) {
                case MainMenu.OP_CLINTES:
                    new ClienteUI().executar();
                    break;
                case MainMenu.OP_PETS:
                    break;
                case MainMenu.OP_TP_PETS:
                    break;
                case MainMenu.OP_TP_ATENDIMENTOS:
                    break;
                case MainMenu.OP_SERVICOS:
                    break;
                case MainMenu.OP_VENDAS:
                    break;
                case MainMenu.OP_RELATORIOS:
                    break;
                case MainMenu.OP_SAIR:
                    System.out.println("Aplicação finalizada!!!");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != MainMenu.OP_SAIR);
    }

}
