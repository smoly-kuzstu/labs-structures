/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Andrey
 */
public class DemoGeneric<SomeParamType> {
    protected SomeParamType param;
    DemoGeneric(SomeParamType value){
        this.param = value;
    }
    
    public SomeParamType getValue(){
        return param;
    }
    
    public String getClassName(){
        return param.getClass().toString();
    }
}
