package com.example.features.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class IteratorEx {

    public static void main(String[] args) {
         /*List<String> list = List.of("John", "Jane", "Jill", "smith", "testing", "fnsuser");
         ListIterator<String> it = list.listIterator();
         while(it.hasNext()){
             String item = it.next();
             if(item.equals("smith")){
                 it.remove();
             }
             System.out.println(item);
         }*/

     }

     public List<String> removeItemFromList(List<String> inputList, String item){
         // Create a mutable copy of the input list
         List<String> mutableList = new ArrayList<>(inputList);
         ListIterator<String> it = mutableList.listIterator();
         while (it.hasNext()) {
             String e = it.next();
             if (item.equals(e)) {
                 it.remove();
             }
         }
         return mutableList;

     }
}
