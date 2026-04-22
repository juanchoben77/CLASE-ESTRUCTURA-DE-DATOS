 import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;


 public class historialdenavegacion{
    public static void main(String[] args) {
    
        LinkedList<String> historial = new LinkedList<>();

        
        historial.add("google.com");
        historial.add("github.com");
        historial.add("stackoverflow.com");

        System.out.println(" historial de navegacion ");

        System.out.println(historial.getLast());
        historial.removeLast();
       //-----------------------------


        Map<Integer, String> productos = new LinkedHashMap<>();
        productos.put(110, "Laptop");
        productos.put(102, "Mouse");
        productos.put(103, "Teclado");

        System.out.println(productos.containsKey(102));

        productos.put(101,"Pantalla");

        System.out.println(productos);

        productos.forEach((key, value) -> System.out.println("[Codigo: " + key + "] producto -> [" + value + "]"));

        //-----------------------------

        Map<String, LinkedList<String>> pedidos= new LinkedHashMap<>();
        pedidos.put("ana", new LinkedList<>());
        pedidos.get("ana").add("camisa");
        pedidos.get("ana").add("pantalon");
        pedidos.put("luis", new LinkedList<>());
        pedidos.get("luis").add("zapatos");
        pedidos.get("luis").add("sombrero");
       

        pedidos.forEach((cliente, productosPedidos) -> {
            System.out.println("Cliente: " + cliente);
            System.out.println("Productos pedidos: " + productosPedidos + " (Cantidad: " + productosPedidos.size() + ")");
        });

    
     
    }
 }




    
    



    
    

        
    
    

