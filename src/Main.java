import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MiniChatbot chatbot = new MiniChatbot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("MiniChatbot: Tchau! Até a próxima.");
                break;
            }

            String resposta = chatbot.processarEntrada(entrada);
            System.out.println("MiniChatbot: " + resposta);
        }

        scanner.close();
    }
}
