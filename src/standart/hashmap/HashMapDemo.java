/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.hashmap;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public class HashMapDemo {
    HashMap hashMap;
    public HashMapDemo(){
        hashMap = new HashMap(16);
        demo();
    }
    
    public void demo(){
        String surnames[] = {"Фёдоров", "Иванов", "Петров", "Сидоров"};
       
        double salary = 15000;
        for(String surname : surnames){
            hashMap.put(surname, salary);
            salary += 15000;
        }
        
        for(String surname : surnames){
            System.out.println(surname);
            try{
                hashMap.get(surname);
                System.out.println(surname + ": " + hashMap.get(surname));
            } catch (Exception e) {
            }
        }   
    }
}
