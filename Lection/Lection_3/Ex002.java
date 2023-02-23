package Lection.Lection_3;

import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(); // Указание Integer для экономии ресурсов (без упаковки/распаковки)
       //ArrayList list = new ArrayList();
       list.add(2809);
       System.out.println(list);

    //    for (Object o : list) {
    //        System.out.println(o);
    //    }
   }
}
