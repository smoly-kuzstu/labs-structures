/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.hashmap;

import standart.linkedlist.LinkedList;
import standart.linkedlist.LinkedListItem;
import standart.linkedlist.ValueObject;

/**
 *
 * @author Andrey
 */
public class HashMap <ValueType> {
    protected int bucketsCount;
    protected LinkedList[] buckets;
    protected int count;
    protected final int HASH_MODULE = 13;
      
    public HashMap(int bucketsCount){
        this.bucketsCount = bucketsCount;
        this.buckets = new LinkedList[bucketsCount];
        count = 0;
    }
    
    protected int getHash(String key){
        int s = 0;
        
        for (int i = 0; i < key.length(); i++) {
            s += key.charAt(i);
        }
        
        s %= this.bucketsCount;
        return s;
    } 
    
    public void put(String key, ValueType value){
        int ind = getHash(key);
        LinkedList bucket = buckets[ind];
        if (bucket == null){
            bucket = buckets[ind] = new LinkedList();
        }
        
        ValueObject<String, ValueType> valueObject = new ValueObject<>();
        valueObject.setKey(key);
        valueObject.setValue(value);
        
        bucket.add(valueObject);
        count++;
    }
    
    public ValueObject<String, ValueType> searchKey(String key){
        int ind = getHash(key);
        LinkedList bucket = buckets[ind];
        if (bucket == null){
            return null;
        } else {
            bucket.rewind();
            while(!bucket.empty()){
               LinkedListItem curItem = bucket.getCurrentItem();
               ValueObject<String, ValueType> valueObj;
               valueObj = curItem.getValue();  
               String curKey = valueObj.getKey();
               if ( curKey == key){
                   return valueObj;
               }
               bucket.next();
           } 
        }
        return null;
    }
       
    public  ValueType get(String key) throws Exception{
        ValueObject<String, ValueType> res = this.searchKey(key);
        if (res == null){
            throw new Exception("Key doesn't exists");
        }
        return res.getValue();
    }
    
        
    public boolean hasKey(String key){
        ValueObject<String, ValueType> searchItem = this.searchKey(key);
        return (searchItem != null);
    }
    
 
    
    public int dbgBucketsUses(){
        int cnt = 0;
        for(int i = 0; i < bucketsCount; i++){
            if (buckets[i] != null) cnt++;
        }
        return cnt;
    }
    
    public int getCount() {
        return count;
    }
    
}
