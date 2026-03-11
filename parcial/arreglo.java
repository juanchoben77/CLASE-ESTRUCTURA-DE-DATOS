public class arreglo {
    public static void main(String[] args) {
        int[] energiacontenedores = new int[12];
        for (int i = 0; i < energiacontenedores.length; i++) {
            energiacontenedores[i] = (int) (Math.random() * 150); // Asignar un valor aleatorio entre 0 y 149
        }
        int multiplosdediez[] = new int[12];
        for (int i = 0; i < energiacontenedores.length; i++) {
            if (energiacontenedores[i] % 10 == 0) {
                multiplosdediez[i] = energiacontenedores[i];

            }
        }
       
         int[][] mapacarga = new int[3][3];
         int contador = 0;
         for (int i = 0; i < mapacarga.length; i++) {
            for (int j = 0; j < mapacarga[i].length; j++) {
                mapacarga[i][j] = 0; 

             Object[][] matriz = null;
             Object[] datos = null;
             if (contador < datos.length) {
                    matriz[i][j] = datos[contador];
                } else {
                    // Si se acabaron los datos, rellenamos con -1
                    matriz[i][j] = -1;
            } // Asignar 1 para indicar que el contenedor está cargado
                contador++; 
             
            

            }
        }
    }
}