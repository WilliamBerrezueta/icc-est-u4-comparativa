import controllers.SortPersonaMethods;
import models.Persona;
import models.Resultado;

public class App {

    public static Persona[] generarPersonas(int cantidad) {

        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona " + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }

        return personas;
    }

    public static void main(String[] args) throws Exception {

        SortPersonaMethods sorter = new SortPersonaMethods();
        int[] cantidades = {10000, 50000, 100000};
        for (int cant : cantidades) {

            Persona[] base = generarPersonas(cant);
            Persona[] paraInsercion = base.clone();
            Persona[] paraQuick = base.clone();

            Resultado resInsercion = BenchMarking.medirTiempo(() -> {sorter.insertionSort(paraInsercion);return null;},"Inserción","Desordenado",cant);
            Resultado resQuick = BenchMarking.medirTiempo(() -> {sorter.quickSort(paraQuick, 0, paraQuick.length - 1);return null;},"QuickSort","Desordenado",cant);

            System.out.println("Desordenado | Inserción | " + resInsercion.getSample() + " | " + resInsercion.getTiempoMilis() + " ms");
            System.out.println("Desordenado | QuickSort | " + resQuick.getSample() + " | " + resQuick.getTiempoMilis() + " ms");

            Persona[] baseOrdenada = base.clone();

            sorter.insertionSort(baseOrdenada);

            Persona[] personaAdicional = new Persona[cant + 1];
            for (int i = 0; i < cant; i++) {
                personaAdicional[i] = baseOrdenada[i];
            }

            personaAdicional[cant] = new Persona("Persona Nueva", (int) (Math.random() * 101));

            Persona[] paraInsercion2 = personaAdicional.clone();
            Persona[] paraQuick2 = personaAdicional.clone();

            Resultado resInsercion2 = BenchMarking.medirTiempo(() -> {sorter.insertionSort(paraInsercion2);return null;},"Inserción","Casi ordenado + 1 persona",cant + 1);
            Resultado resQuick2 = BenchMarking.medirTiempo(() -> {sorter.quickSort(paraQuick2, 0, paraQuick2.length - 1);return null;},"QuickSort","Casi ordenado + 1 persona",cant + 1);

            System.out.println("Casi ordenado + 1 persona | Inserción | " + resInsercion2.getSample() + " | " + resInsercion2.getTiempoMilis() + " ms");
            System.out.println("Casi ordenado + 1 persona | QuickSort | " + resQuick2.getSample() + " | " + resQuick2.getTiempoMilis() + " ms");
            System.out.println();
        }
    }
}