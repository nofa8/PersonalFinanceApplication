package Ficha4;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static Ficha4.ListaDeContas.contas;
import static Ficha4.ListaDeContas.usernameAlreadyExists;

//ok
public class Conta {

    private String username;
    private String hashPassword;
    private ListaDeRegistos registos;

    private float saldo;

    public Conta(String username, String hashPassword) {

        if(usernameAlreadyExists(username)){

        }
        this.username = username;
        this.hashPassword = stringToHash(hashPassword);
        saldo = 0;
        contas.add(this);

    }
    //SETTERS GETTERS

    public String GetUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String hashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    //REGISTO
    public void addRegisto(float valor, Categoria categoria, String descricao){
        registos.add( valor,  categoria,  descricao);
        saldo+= valor;
    }
    public void editRegisto(long id, float valor, Categoria categoria, String descricao){
        //remover o ex valorrrr TODO
        registos.edit( id, valor,  categoria,  descricao);
        saldo+=valor;
    }
    public void removeRegisto(long id){
        registos.remove(id);
    }

    //PASSWORDS
    public boolean loginConta(String password){
        String passwordHash =  stringToHash(password);
        return passwordHash == this.hashPassword;
    }

    //HASH

    private String stringToHash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xff & hashByte);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Em caso de erro, retorna null ou lança uma exceção
            return null;
        }
    }
}
