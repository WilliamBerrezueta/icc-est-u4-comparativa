import controllers.SortPersonaMethods;
import models.Persona;
import models.Resultado;

public class App {

    public static Persona[] generarPersonas(int cantidad) {
            Persona[] personas = new Persona[cantidad];
            
            for (int i = 0; i < cantidad; i++) {
                String nombre = "Persona" + (i + 1);
                int edad = (int) (Math.random() * 101);
                personas[i] = new Persona(nombre, edad);
            }
            return personas;
    }
    public static Persona[] generarPersonasDos(int cantidad) {

        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona" + (int)(Math.random() * cantidad);
            int edad = (int) (Math.random() * 101);

            personas[i] = new Persona(nombre, edad);
        }

        return personas;
    }

    public static Persona[] copiar(Persona[] original) {
        Persona[] copia = new Persona[original.length];

        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        return copia;
    }

    public static void imprimir(Resultado r) {
        System.out.println(r.getEscenario() + " | " + r.getAlgoritmo() + " | " + r.getSample() + " | " + r.getTiempoMilis() + " ms");
    }
    public static void main(String[] args) throws Exception {

        SortPersonaMethods sort = new SortPersonaMethods();
        int[] tamanios = {10000, 50000, 100000};

        System.out.println("ESCENARIO 1: ARREGLO DESORDENADO");

        for (int n : tamanios) {
            Persona[] base = generarPersonas(n);

            Persona[] insercion = copiar(base);
            Persona[] quick = copiar(base);

            imprimir(BenchMarking.medirTiempo(() -> {
                sort.insertionSort(insercion);
                return null;
            }, "Insercion", "Desordenado", n));

            imprimir(BenchMarking.medirTiempo(() -> {
                sort.quickSort(quick, 0, quick.length - 1);
                return null;
            }, "QuickSort", "Desordenado", n));

            System.out.println();
        }

        System.out.println("ESCENARIO 2: CASI ORDENADO + 1 PERSONA");

        for (int n : tamanios) {
            Persona[] base = generarPersonas(n);

            sort.quickSort(base, 0, base.length - 1);

            Persona[] nuevo = new Persona[n + 1];

            for (int i = 0; i < base.length; i++) {
                nuevo[i] = base[i];
            }

            nuevo[nuevo.length - 1] = new Persona("PersonaNueva", 25);

            Persona[] insercion = copiar(nuevo);
            Persona[] quick = copiar(nuevo);

            imprimir(BenchMarking.medirTiempo(() -> {
                sort.insertionSort(insercion);
                return null;
            }, "Insercion", "Casi ordenado + 1 persona", nuevo.length));

            imprimir(BenchMarking.medirTiempo(() -> {
                sort.quickSort(quick, 0, quick.length - 1);
                return null;
            }, "QuickSort", "Casi ordenado + 1 persona", nuevo.length));

            System.out.println();
        }
    }
}