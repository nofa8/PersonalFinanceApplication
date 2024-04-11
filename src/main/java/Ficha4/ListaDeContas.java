package Ficha4;
import java.util.LinkedList;
import java.util.List;

public  class ListaDeContas {

    public static LinkedList<Conta> contas = new LinkedList<>();



    public LinkedList<Conta> contas() {
        LinkedList<Conta> contasCopy = new LinkedList<>(contas);
            return contasCopy;
    }

    public void add(Conta conta) {
        this.contas.add(conta);
    }
    public void remove(Conta conta) {
        this.contas.remove(conta);
    }

    public static boolean usernameAlreadyExists(String username)
    {
        for(Conta continha : contas) {
            if(continha.GetUsername() == username){
                return true;
            }
        }
        return false;
    }

    public static boolean login(String username, String password){
        for(Conta continha : contas) {
            if(continha.GetUsername() == username){
                return continha.loginConta(password);
            }
        }
        return false;
    }
}
