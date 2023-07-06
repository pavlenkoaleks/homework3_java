import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Random;


public class task2 {
    
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
       for (int i = 0; i < 20; i++) {
        list.add(rand.nextInt(1000));
       }
       
        System.out.println(list);
        System.out.println("максимальный элемент= "+ Collections.max(list));
        System.out.println("минималльный элемент= "+Collections.min(list));
       average(list);
      }
    
static void average(List<Integer> list){
    float s =0;
    for (int i = 0; i < list.size(); i++) {
        s += list.get(i);
        }
        float aver = s/list.size();
        System.out.println("среденее арифметическое= "+aver);
        
    }
}




 
