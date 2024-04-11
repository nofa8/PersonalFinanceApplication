package Ficha4;

public class RegistoGasto extends Registo{
    public RegistoGasto(float valor, Categoria categoria, String descricao) {
        super(-valor, categoria, descricao);
    }


    public void setValor(float valor) {
        super.setValor(-valor);
    }

}
