import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = null;

        Socket conexao = null;

        BufferedReader entrada = null;

        try {
            servidor = new ServerSocket(7005);
            conexao = servidor.accept();
            entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

            do {
                String texto = entrada.readLine();

                if (texto == null) {
                    break;
                }

                String[] mensagem = texto.split(" ");

                new Thread(new ThreadSocket(Integer.parseInt(mensagem[1]), mensagem[2])).start();
            } while (!"sair".equals(entrada.toString()));

        } catch (IOException e) {
            System.out.println("Algo errado aconteceu");
        } finally {
            if (conexao != null) {
                conexao.close();
                servidor.close();

            }
        }
    }
}
