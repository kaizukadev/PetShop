package view.menu;

public class MainMenu {

    public static final int OP_CLINTES = 1;
    public static final int OP_PETS = 2;
    public static final int OP_TP_PETS = 3;
    public static final int OP_TP_ATENDIMENTOS = 4;
    public static final int OP_SERVICOS = 5;
    public static final int OP_VENDAS = 6;
    public static final int OP_RELATORIOS = 7;
    public static final int OP_SAIR = 0;

    public static String getOpcoes() {
        return ("\n *** SISTEMA DE PETSHOP ***\n"
                + "--------------------------------------\n"
                + " 1- Menu Clientes [Disponível]\n"
                + " 2- Menu Pets\n"
                + " 3- Menu Tipos de Pets\n"
                + " 4- Menu Tipos de Atendimentos\n"
                + " 5- Menu Serviços\n"
                + " 6- Menu Vendas\n"
                + " 7- Menu Relatórios\n"
                + " 0- Sair da Aplicação"
                + "\n--------------------------------------");
    }
}
