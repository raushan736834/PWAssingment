package Stack_HashMap_Queue.Hashmap;

import java.util.*;

public class PrintSortedList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of Key-pair: ");  
        
        int n = sc.nextInt();

       
        TreeMap<Integer, String> tm = new TreeMap<>();

        System.out.print("Enter the elements in Key and value : ");  
        for(int i=0;i<n;i++){
            int key = sc.nextInt();
            String value = sc.next();
            tm.put(key, value);
        }
        sc.close();
        System.out.println("The value of Map is: " + tm);

    }
}
