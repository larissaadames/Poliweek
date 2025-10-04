import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Palestra palestraJoao = new Palestra("Sistemas de Informação", "Fazendo códigos legais", "Auditório logo ali",
             "blablalba", "30/09/2025", "19:00", 220, "Palestra",
    "João Silva", 1);

    MesaRedonda mesaPaula = new MesaRedonda("Ciência da computação", "Perguntando perguntas", "Auditório pra lá", "Bliblibli",
            "01/09/2025", "21:00", 46, "Mesa redonda",
    "Paula", 2);

    Oficina oficinaJorge = new Oficina("Cibersegurança", "Oficina não mecanica", "Auditório vira ali", "Blublublu",
            "02/09/2025", "19;00", 400, "Oficina", "Programação orientada a coisa=inhas", 3, "Jorge");

    public static ArrayList<Evento> eventos = new ArrayList<>();

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4 ){
            System.out.println("""
                    1. Minhas inscrições
                    2. Inscrever-se
                    3. Ver perfil
                    4. Sair
                    """);

            System.out.println("Escolha o dia: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    inscricoes();
                    break;
                case 2:
                    escolherDia(eventos);
                    break;
                case 3:
                    perfil();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }
    public static void inscricoes(){

    }
    public static void escolherDia(ArrayList<Evento> eventos){
        Scanner scDia = new Scanner(System.in);
        System.out.println("Escolha o dia: ");
        int dia = 0;
        switch (dia){
            case 1:
                System.out.println("Eventos do dia 1: ");
                for(Evento evento : eventos){
                    if (evento.getDia() == 1){
                        System.out.println(evento);
                    }
                }
                break;
            case 2:
                System.out.println("Eventos do dia 2: ");
                for(Evento evento : eventos){
                    if (evento.getDia() == 2){
                        System.out.println(evento);
                    }
                }
                break;
            case 3:
                System.out.println("Eventos do dia 3: ");
                for(Evento evento : eventos){
                    if (evento.getDia() == 3){
                        System.out.println(evento);
                    }
                }
                break;

        }
        dia = scDia.nextInt();

    }
    public static void perfil(){

    }
}