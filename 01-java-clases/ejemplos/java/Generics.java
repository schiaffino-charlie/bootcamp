import java.util.ArrayList;

public class Generics <T> {
    private T genericfield;
    private Integer field;

    public Generics(T genericfield, Integer field){
        this.genericfield = genericfield;
        this.field = field;
    }

    public T getGenericfield(){
        return genericfield;
    }

    public void setGenericfield(T genericfield){
        this.genericfield = genericfield;
    }

    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<>();
        listado.add("Pablo");
        listado.add("Juan");
        for(String s: listado){
            System.out.println(s);
        }
    }
}
