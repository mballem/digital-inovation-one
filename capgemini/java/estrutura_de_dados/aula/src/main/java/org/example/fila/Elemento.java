package org.example.fila;

public class Elemento {
    private Object object;
    private Elemento elemento;

    public Elemento(){
    }

    public Elemento(Object object){
        this.elemento = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "object=" + object +
                '}';
    }
}
