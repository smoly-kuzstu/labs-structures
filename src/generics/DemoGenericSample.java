/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Andrey
 */
public class DemoGenericSample {
    public DemoGenericSample(){
        DemoGeneric<Integer> intGeneric = new DemoGeneric<>(55);
        //Приведение типов не требуется
        int intValue = intGeneric.getValue();
        System.out.println(intValue);
        DemoGeneric<String> strGeneric = new DemoGeneric<>("Hello");
        //Приведение типов не требуется
        String strValue = strGeneric.getValue();
        //Следующая строчка не скомпилируется
        //strValue = intGeneric.getValue();
        System.out.println(strValue);    
    }
}
