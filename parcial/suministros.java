public class suministros{
    private String[] id;
    private int[] nivel_energia;
    private String[] prioridad;

    public suministros(String[] id, int[] nivel_energia, String[] prioridad) {
        this.id = id;
        this.nivel_energia = nivel_energia;
        this.prioridad = prioridad;

        }

        public String[] getId() {
            return id;
        }
        public int[] getNivel_energia() {
            return nivel_energia;
        }
        public String[] getPrioridad() {
            return prioridad;
        }
        @Override
        public String toString() {
            return "suministros [id=" + id + ", nivel_energia=" + nivel_energia + ", prioridad=" + prioridad + "]";
        }

    
        int[] energiacontenedores = new int[12];
        for (int i = 0; i < energiacontenedores.length; i++) {
            energiacontenedores[i1] = (int) (Math.random(101) + 50); // Asignar un valor aleatorio entre 0 y 149
        }
        int multiplosdediez[] = new int[12];
        for (int j = 0; j < energiacontenedores.length; j++) {
            if (energiacontenedores[j] % 10 == 0) {
                multiplosdediez[j] = energiacontenedores[j];

            }
         }


       
         int[][] mapacarga = new int[3][3];
         int contador = 0;
         for (int i = 0; i < mapacarga.length; i++) {
            for (int j = 0; j < mapacarga[i1].length; j++) {
                mapacarga[i1][j] = 0; 

             Object[][] matriz = null;
             Object[] datos = null;
             if (contador < datos.length) {
                    matriz[i1][j] = datos[contador];
                } else {
                    // Si se acabaron los datos, rellenamos con -1
                    matriz[i1][j] = -1;
            } // Asignar 1 para indicar que el contenedor está cargado
                contador++; 
             
             suministros[] manifiesto = new suministros[9];
             int k = 0;

             System.out.println("\nManifiesto de Objetos Generado:");
             for (int f = 0; f < 3; f++) {
             for (int c = 0; c < 3; c++) {
                int energia = mapacarga[f][c];
                
                if (energia != -1) {
                    // Determinar prioridad
                    String prio = (energia > 100) ? "ALTA" : "ESTÁNDAR";
                    // Formato ID: C-fila-columna
                    String id = "C-" + f + "-" + c;
                    
                    manifiesto[k] = new suministro(id, energia, prio);
                    System.out.println(manifiesto[k]);
                } else {
                    manifiesto[k] = null;
                    System.out.println("Posición [" + f + "][" + c + "]: VACÍO");
                }
                k++;
            }
        }
    }

}  


