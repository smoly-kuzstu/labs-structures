/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standart.hashmap;

import standart.linkedlist.LinkedList;
import standart.linkedlist.LinkedListItem;

/**
 *
 * @author Andrey
 */
public class HashMap {
    protected int bucketsCount;
    protected LinkedList[] buckets;
    protected int count;
    protected final int HASH_MODULE = 13;
    
    public HashMap(int bucketsCount){
        this.bucketsCount = bucketsCount;
        this.buckets = new LinkedList[bucketsCount];
        count = 0;
    }
    
    public void put(String key, double value){
        int ind = getHash(key);
        LinkedList bucket = buckets[ind];
        if (bucket == null){
            bucket = new LinkedList();
            buckets[ind] = bucket;
        }
        bucket.add(key, value);
        count++;
    }
    
    public double get(String key) throws Exception{
        LinkedListItem searchItem = this.searchKey(key);
        if (searchItem == null){
            throw new Exception("Key doesn't exists");
        }
        return searchItem.getValue();
    }
     /**
     * @return the count
     */
    public int getCount() {
        return count;
    }
    
    public boolean hasKey(String key){
        LinkedListItem searchItem = this.searchKey(key);
        return (searchItem != null);
    }
    
    public LinkedListItem searchKey(String key){
        int ind = getHash(key);
        LinkedList bucket = buckets[ind];
        if (bucket == null){
            return null;
        } else {
           while(bucket.hasCurrent()){
             LinkedListItem curItem = bucket.getCurrentItem();
             if (curItem.getKey() == key){
                 return curItem;
             }
             bucket.next();
           } 
        }
        return null;
    }
    
    protected int getHash(String key){
        int s = 0;
        for (int i = 0; i < key.length(); i++) {
            s += key.charAt(i) + i + 1;
            s %= HASH_MODULE;
        }
        s %= this.bucketsCount;
        return s;
    }

   
    
}
