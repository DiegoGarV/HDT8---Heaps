import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.NoSuchElementException;


public class Tests {

    
        
    

    @Test
    public  void ProcesoTest() {

        System.out.println("----------PRUEBA UNITARIA COMPARE TO----------");

        Proceso proceso1 = new Proceso("vi", "juan02", 0);
        Proceso proceso2 = new Proceso("ls", "maria30", 20);

        int result = proceso1.compareTo(proceso2);

        if(result < 0) {
            System.out.println("proceso1 is less than proceso2");
        } else if(result > 0) {
            System.out.println("proceso1 is greater than proceso2");
        } else {
            System.out.println("proceso1 is equal to proceso2");
        }
        
        System.out.println("PRUEBA REALIZADA \n");




        System.out.println("----------PRUEBA UNITARIA PROCESOS ORDENADOS----------");

        Proceso[] procesos = new Proceso[3];
        procesos[0] = new Proceso("firefox", "rosa20", 5);
        procesos[1] = new Proceso("cat", "juan02", 5);
        procesos[2] = new Proceso("ls", "maria30", 20);

        String orden = procesos[0].procesosOrdenados(procesos);

        System.out.println("Procesos ordenados:");
        System.out.println(orden);

        System.out.println("PRUEBA REALIZADA \n");

        
    }

    
    public  void VectorHeapTest(){

        System.out.println("----------PREUBA UNITARIA PERCOLATEUP----------");

        VectorHeap<Integer> heap = new VectorHeap<Integer>();
        heap.add(4);
        heap.add(2);
        heap.add(3);
        heap.add(1);
        heap.percolateUp(3);                
        System.out.println("PRUEBA REALIZADA \n");


        System.out.println("-----------PRUEBA UNITARIA PUSHDOWNROOT----------");
        heap.add(5);
        heap.add(3);
        heap.add(7);
        heap.pushDownRoot(0);
        System.out.println("PREUBA REALIZADA \n");

        System.out.println("----------PRUEBA UNITARIA REMOVE----------");
        heap.add(3);
        heap.add(2);
        heap.add(1);
        heap.remove();
        
        System.out.println("PRUEBA REALIZADA \n");

    }


}