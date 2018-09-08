/*
 * Steve Kennedy
 * Sept x, 20xx
 * 
 * Please put your name, date, and brief description of this class here.
 */
package edu.frostburg.cosc310.lab00;
import java.util.*;
/**
 * Your documentation should begin here.
 * @author SteveK
 */
public class CroweColinLab00 implements Lab00 {

    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int size = 100000;
        
        ArrayList<String> myArray = new ArrayList<String>(size);
        LinkedList<String> myLinkedList = new LinkedList<String>();
        
        long time1 = System.currentTimeMillis();
        for (int i = 0; i<myArray.size();i++){
        myArray.set(i, Integer.toString(i));
        }
        long time2 = System.currentTimeMillis();
        long firsttime = time1-time2;
        
        time1 = System.currentTimeMillis();
        for (int j = 0;j<size;j++){
        myLinkedList.add(Integer.toString(j));
        }
        time2 = System.currentTimeMillis();
        long secondtime = time1-time2;
        
        if (firsttime>secondtime){
            System.out.println("The Linked List was faster by " + (secondtime-firsttime));
            return secondtime;
        }
        else if (firsttime<secondtime) {
            System.out.println("The ArrayList was faster by "+(firsttime-secondtime));
            return firsttime;
        }
        else {
            System.out.println("The times were equal!");
            return 0;
        }
        
        
    }
    
}
