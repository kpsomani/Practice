/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kpsomani2
 */
import java.util.ArrayList;

 class Node1<K,V>
{
     K key;
    V val;
    Node1(K key,V val)
    {
        this.key=key;
        this.val=val;
                
    }
}
 
 public class HashRe<K,V> {
 
     ArrayList<Node1<K,V>>obj1;
     int size;
     
      public HashRe()
     {
         obj1=new ArrayList<>();
         int buketSize=10;
         int size=0;
         
         for(int i=0;i<buketSize;i++)
         {
             obj1.add(null);
         }
     }
     
     int getHashCode(K key)
     {
         int hashcode1=key.hashCode();
          int index=hashcode1%size;
          return index;
     }
     
     V get()
     {
         
     }
     
     void add()
     {
         
     }
     void get(K key)
     {
         int hashcode=getHashCode(key);
         
     }
 

    public static void main(String args[])
    {
        
    }
 }

