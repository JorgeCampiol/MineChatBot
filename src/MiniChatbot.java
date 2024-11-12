public class MiniChatbot {

    public String responderSaudacao(String entrada) {
        if (entrada.toLowerCase().contains("oi") || entrada.toLowerCase().contains("olá")) {
            return "Olá! Como posso ajudar?";
        }
        return null;
    }

    public String responderNome(String entrada) {
        if (entrada.toLowerCase().contains("seu nome")) {
            return "Eu sou o MiniChatbot, seu assistente virtual!";
        }
        return null;
    }

    public String responderComoEsta(String entrada) {
        if (entrada.toLowerCase().contains("como você está")) {
            return "Estou funcionando perfeitamente, obrigado!";
        }
        return null;
    }

    public String respostaPadrao() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }

    public String processarEntrada(String entrada) {
        String resposta = responderSaudacao(entrada);
        if (resposta != null) {
            return resposta;
        }

        resposta = responderNome(entrada);
        if (resposta != null) {
            return resposta;
        }

        resposta = responderComoEsta(entrada);
        if (resposta != null) {
            return resposta;
        }

        return respostaPadrao();
    }
}
