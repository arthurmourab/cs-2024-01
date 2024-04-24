import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Login login = new Login("user", "password");

        try {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (login.fazer_login(usuario, senha)) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Usuário ou senha incorretos.");
            }

        } catch (LoginInvalidoException e) {
            System.out.println("Erro de login: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
