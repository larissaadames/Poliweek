import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Feito por Larissa Adames, Davi Cagnato, Luis Felipe Quintiliano
        // Poliweek, perspectiva do usuário

        ArrayList<Evento> eventos = new ArrayList<Evento>();
        ArrayList<Palestra> palestras = new ArrayList<>();

        Usuario usuario = new Usuario("quintiliano","23/09/2006","123123123-12","41-40228922",
                "quintilianoemail123@gmail.com");


        Palestra palestraJoao = new Palestra(
                "Sistemas de Informação", "Fazendo códigos legais", "Auditório logo ali",
                "BSI", "blablalba", "30/09/2025", "19:00", 220, "Palestra",
                "João Silva", 1
        );

        MesaRedonda mesaPaula = new MesaRedonda(
                "Ciência da Computação", "Perguntando perguntas", "Auditório pra lá",
                "CC", "Bliblibli", "01/09/2025", "21:00", 46, "Mesa redonda",
                "Paula", 2
        );

        Oficina oficinaJorge = new Oficina(
                "Cibersegurança", "Oficina não mecânica", "Auditório vira ali",
                "CiberSec", "Blublublu", "02/09/2025", "19:00", 400, "Oficina",
                "Programação orientada a coisinhas", 3, "Jorge"
        );
        eventos.add(palestraJoao);
        eventos.add(mesaPaula);
        eventos.add(oficinaJorge);
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3){
            System.out.println("""
                    1. Minhas inscrições
                    2. Inscrever-se
                    3. Sair
                    """);

            System.out.println("Escolha a opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    inscricoes(usuario);
                    break;
                case 2:
                    inscrever(eventos, usuario);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }
    public static void inscricoes(Usuario usuario){
        usuario.printMinhasInscricoes();
    }
    public static void escolherDia(ArrayList<Evento> eventos){
        Scanner scDia = new Scanner(System.in);
        System.out.println("Escolha o dia: ");
        int dia = scDia.nextInt();

        System.out.println("Eventos do dia " + dia + ": ");
        for(Evento evento : eventos)
        {
            if (evento.getDia() == dia)
            {
                System.out.println(evento.toString());
            }
        }
    }

    public static void inscrever(ArrayList<Evento> eventos, Usuario usuario) {
        Scanner scInsc = new Scanner(System.in);
        escolherDia(eventos);

        System.out.println("Digite o titulo da palestra que deseja se inscrever: ");
        String titulo = scInsc.nextLine();

        for(Evento evento : eventos) {
            if (titulo.equals(evento.getTitulo())) {
                evento.addInscrito(usuario);
                usuario.addEvento(evento);
            }
        }

    }
}