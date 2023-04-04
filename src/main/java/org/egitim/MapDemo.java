package org.egitim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

    static ConcurrentHashMap<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        int integerPozitifSinir = 2147483647;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++){
            list.add(i);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        list.parallelStream().forEach(sayi -> map.put(sayi,sayi+1));
        System.out.println(map.size());

        list.parallelStream().forEach(sayi -> addMap(sayi, sayi+1));
        System.out.println(concurrentHashMap.size());
       // map.put(1,null);
       // concurrentHashMap.put(1,null);
    }

    public static void addMap(int key, int value){

        concurrentHashMap.put(key,value);
    }
}
