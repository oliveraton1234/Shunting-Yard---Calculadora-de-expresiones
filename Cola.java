public class Cola {

    Cola inicio = null;
    Cola fin = null;

    public void add(char dato) {
        Cola nuevo = new Cola();
        nuevo.dato = dato;
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
    }

    public void recorre() {
        Cola aux = fin;
        while (aux != null) {
            System.out.print(aux.dato + " ");
            //System.out.println(aux.dat);
            aux = aux.anterior;
        }
    }

    public int sacar() {

        if (fin != null) {
            Cola aux = fin;
            int resultado = aux.dato;
            if (fin.anterior != null) {
                fin = fin.anterior;
                fin.siguiente = null;
                aux.anterior = null;
            } else {
                fin = null;
            }
            return resultado;
        }
        return 0;

    }

    public boolean isEmpty() {
        return (inicio == null) && (fin == null);
    }

}
