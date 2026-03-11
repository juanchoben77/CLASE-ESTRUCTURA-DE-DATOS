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
    public void setId(String[] id) {
        this.id = id;
    }
    public void setNivel_energia(int[] nivel_energia) {
        this.nivel_energia = nivel_energia;
    }
    @Override
    public String toString() {        return "suministros{" +
                "id=" + String.join(", ", id) +
                ", nivel_energia=" + String.join(", ", String.valueOf(nivel_energia)) +
                ", prioridad=" + String.join(", ", prioridad) +
                '}';
}
    


}