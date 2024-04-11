package Ficha4;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ListaDeRegistos {

    private LinkedHashMap<Long, Registo> registos;
    private long contID = 0;

    public ListaDeRegistos() {
        this.registos = new LinkedHashMap<>();
    }

    public void add(float valor, Categoria categoria, String descricao) {
        this.registos.put(contID, new Registo(  valor,  categoria,  descricao));
        contID++;
    }
    public void remove(Long id) {
        this.registos.remove(contID);
    }
    public void edit(long key, float valor, Categoria categoria, String descricao) {
        Registo reg = registos.get(key);

        reg.setValor(valor);
        reg.setCategoria(categoria);
        reg.setDescricao(descricao);

    }

}
