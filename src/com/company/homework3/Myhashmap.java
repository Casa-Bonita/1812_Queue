package com.company.homework3;

import java.util.*;

public class Myhashmap {
    int sum;

    public Myhashmap(){
    }

    public Myhashmap(int sum){
        this.sum = sum;
    }

    @Override
    public int hashCode() {

        int result = 1;

        result = 31 * result;
        result = 31 * result + sum;
        result = 31 * result;

        System.out.println("HashCode = " + result);

        return result;
    }

    Map<Integer, String> hashMap = new HashMap<Integer, String>();

    public void putHashMap(int hashCode, String filmWithSymbols){
        hashMap.put(hashCode, filmWithSymbols);
    }

    public void printHashMap(){
        Iterator<Map.Entry<Integer, String>> entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println("Код фильма: " + entry.getKey() + "  " + "Название фильма: " + entry.getValue());
        }
    }
    
}