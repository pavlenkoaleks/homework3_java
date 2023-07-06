import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Random;


public class task3 {
    
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Меркурий");
        list.add("Венера");
        list.add("Земля");
        list.add("Марс");
        list.add("Юпитер");
        list.add("Сатурн");
        list.add("Уран");
        list.add("Нептун");
        list.add("Плутон");

List<String> list2 = new ArrayList<>();
        Random rand = new Random();
       for (int i = 0; i < 30; i++) {
        int a  =  rand.nextInt(9);
        list2.add(list.get(a));
       }
        System.out.println(list2);
      System.out.println("количество планет Меркурий = " + Collections.frequency(list2, "Меркурий"));
       System.out.println("количество планет Венера = " +  Collections.frequency(list2, "Венера"));
        System.out.println("количество планет Земля = " +  Collections.frequency(list2, "Земля"));
         System.out.println( "количество планет Марс = " + Collections.frequency(list2, "Марс"));
          System.out.println( "количество планет Юпитер = " + Collections.frequency(list2, "Юпитер"));
           System.out.println( "количество планет Сатурн = " + Collections.frequency(list2, "Сатурн"));
            System.out.println( "количество планет Уран = " + Collections.frequency(list2, "Уран"));
             System.out.println( "количество планет Нептун = " + Collections.frequency(list2, "Нептун"));
              System.out.println("количество планет Плутон  = " +  Collections.frequency(list2, "Плутон"));
       
      }
    

}