package com.company.homework3;

import java.util.*;

public class Myhashset {

    public Myhashset(){
    }

    HashSet<String> hashSet = new HashSet<String>();

    public void addHashSet(String strAfterCorrection){
        hashSet.add(strAfterCorrection);
    }

    public void printHashSet(){
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
