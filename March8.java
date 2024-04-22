import java.util.*;

public class March8 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        Map<String , Integer> map = new HashMap<>();
        map.put("ramana", 1);
        map.put("raju", 2);
        map.put("sahara", 3);


        System.out.println(map);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+ "--");
            System.out.print(entry.getValue());
            System.out.println();
        }
        
        char[] arr2 = { 'R', 'C', 'S' };

        // arr.add(1);
        // arr.add(2);
        // arr.add(3);

        arr.add(0,3);
        arr.add(1,6);
        arr.add(2,9);
        //arr.remove(1);
       // arr.clear();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }
        System.out.println();
        System.out.print(arr);
    }
}