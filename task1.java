import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Random;


public class task1 {
    
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
       for (int i = 0; i < 20; i++) {
        list.add(rand.nextInt(1000));
       }
       
        System.out.println(list);
        removeChet(list);
       System.out.println(list);
      }
    
static void removeChet(List<Integer> list){
    for (int i = 0; i < list.size(); i++) {
        if ((list.get(i))%2==0 ){
            list.remove(i);
            i--;
        }
        
    }
}




}