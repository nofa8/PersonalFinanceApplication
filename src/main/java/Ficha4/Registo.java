package Ficha4;

public class Registo {

    private float valor;
    private Categoria categoria;
    private String descricao;

    public Registo( float valor, Categoria categoria, String descricao) {

        this.valor = valor;
        this.categoria = categoria;
        this.descricao = descricao;

    }


    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Categoria categoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String descricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
