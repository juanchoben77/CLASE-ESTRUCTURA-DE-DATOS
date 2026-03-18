public class suministro {
    private String[] id;
    private int[] nivel_energia;
    private String[] prioridad;

    // Constructor
    public suministro(String[] id, int[] nivel_energia, String[] prioridad) {
        this.id = id;
        this.nivel_energia = nivel_energia;
        this.prioridad = prioridad;
    }

    // Getters y Setters
    public String[] getId() { return id; }
    public int[] getNivel_energia() { return nivel_energia; }
    public String[] getPrioridad() { return prioridad; }

    @Override
    public String toString() {
        return "Suministro [ID=" + String.join(", ", id) + ", Energía=" + nivel_energia[0] + "]";
    }

    public static void main(String[] args) {
        // 1. Generar datos aleatorios
        int[] energiacontenedores = new int[12];
        for (int i = 0; i < energiacontenedores.length; i++) {
            energiacontenedores[i] = (int) (Math.random() * 101) + 50;
        }

        // 2. Preparar la matriz de carga (3x3 = 9 espacios)
        int[][] mapacarga = new int[3][3];
        int contador = 0;

        System.out.println("--- Llenando Mapa de Carga ---");
        for (int i = 0; i < mapacarga.length; i++) {
            for (int j = 0; j < mapacarga[i].length; j++) {
                // Usamos los datos generados aleatoriamente para llenar la matriz
                if (contador < energiacontenedores.length) {
                    mapacarga[i][j] = energiacontenedores[contador];
                } else {
                    mapacarga[i][j] = -1; // Espacio vacío si no hay más datos
                }
                contador++;
            }
        }

        // 3. Crear el manifiesto de objetos
        suministro[] manifiesto = new suministro[9];
        int k = 0;

        System.out.println("\n--- Manifiesto de Objetos Generado ---");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                int energia = mapacarga[f][c];

                if (energia != -1) {
                    // Determinar prioridad y crear ID único
                    String prio = (energia > 100) ? "ALTA" : "ESTÁNDAR";
                    String id_generado = "C-" + f + "-" + c;

                    // Guardar en el arreglo de objetos
                    manifiesto[k] = new suministro(
                        new String[]{id_generado}, 
                        new int[]{energia}, 
                        new String[]{prio}
                    );

                    System.out.println("Posición [" + f + "][" + c + "]: ID=" + id_generado + 
                                       ", Energía=" + energia + ", Prioridad=" + prio);
                } else {
                    manifiesto[k] = null;
                    System.out.println("Posición [" + f + "][" + c + "]: VACÍO");
                }
                k++;
            }
        }
    }
}