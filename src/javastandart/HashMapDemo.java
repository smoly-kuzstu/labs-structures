/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javastandart;

import java.util.HashMap;

/**
 *
 * @author Andrey
 */
public class HashMapDemo {
    public HashMapDemo(){
        HashMap<String, Double> salaryMap = new HashMap<>();
        
        salaryMap.put("Иванов", 30000.0);
        salaryMap.put("Петров", 45000.0);
        
        System.out.println("Зарплата Иванова: " + salaryMap.get("Иванов"));
        System.out.println("Зарплата Петрова: " + salaryMap.get("Петров"));
        
    }
}
