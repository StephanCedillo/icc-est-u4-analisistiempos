import java.util.Arrays;
import java.util.concurrent.Callable;
import models.Results;
import controllers.SortMethods;

public class App {
    public static void main(String[] args) throws Exception {
        int size= 200000;
        int[] arreglo = generate(size);
        int[] arreglo2 = arreglo.clone();
        int[] arreglo3 = Arrays.copyOf(arreglo, size);

        SortMethods metodos = new SortMethods();
        
        Callable<Void> funcionBubble = ()->{
            metodos.sortBubble(arreglo2);
            return null;            
        };

        Results rBuble = BenchMarking.medirTiempo(funcionBubble,"Burbuja",size);
        System.out.println(rBuble.getName()+ " = " + rBuble.getTime());

        
        Callable<Void> funcionBubbleAvz = ()->{
            metodos.sortBubbleAvan(arreglo3);
            return null;            
        };

        Results rBubleAvz = BenchMarking.medirTiempo(funcionBubbleAvz,"Burbuja Avanzado",size);
        System.out.println(rBubleAvz.getName()+ " = " + rBubleAvz.getTime());

    }
    public static int[] generate(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int numero = (int)(Math.random()*10000);
            array[i]=numero;
            
        }
        return array;

    }
}
