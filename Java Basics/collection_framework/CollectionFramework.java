/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_framework;

//import java.util.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author manasvi
 */
public class CollectionFramework {

    /**
     * @param args the command line arguments
     */
    void print(Object obj) {
        System.out.println(obj);
    }

//    Collection<--List<--LinkedList
    void workWithLinkedList() {
//        List<String> list1 = new LinkedList<>();
//        
//
//        list1.add("A");
//        list1.add("B");
//        list1.add("C");
//        
//        
//        print("For in loop");
//        for (String s : list1) {
//             print(s);
//
//        }
//
//        
//        
//        
//        
//        Iterator<String> it = list1.iterator();
//        print("Using Iterator");
//        while (it.hasNext()) {
//            print(it.next()); // pointer increments and returns the value
//        }
//
//        print(list1.get(0));
//
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("X");
        list2.add("Y");
        list2.add("Z");
        
        
        // just for retrieval
        print("Peek "+list2.peek());// 
        print("Peek First "+list2.peekFirst());
        print("Peek Last "+list2.peekLast());
        
        // retrieves and removes
        print("Poll "+list2.poll());
        print("Poll First "+list2.pollFirst());
        print("Poll Last "+list2.pollLast());
        
        
        //for stack mechanism
        list2.push("U");
        list2.push("V");
        list2.push("W");
        print("Pop "+list2.pop());
        print("Pop "+list2.pop());
//        


    }
//    Collection<--List<--ArrayList
    void workWithArrayList() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList list2 = new ArrayList();
        list2.add("1");
        list2.add(1);
        list2.add('1');

//        list2.clear();
        Iterator<Object> itr = list2.iterator();

        
        while (itr.hasNext()) {
            print(itr.next());
        }
        
        

    }

    
//    Collection<--Set<--HashSet    
    // no order is maintained
    void workWithHashSet() {

        Set<Integer> set1 = new HashSet<Integer>();

        set1.add(100);
        set1.add(200);
        set1.add(300);
        System.out.println("Set1 : " + set1);

        HashSet<Integer> set2 = new HashSet<Integer>();

        set2.add(400);
        set2.addAll(set1); // is like taking a union
        set2.add(500);
        set2.add(100);
        System.out.println("Set2 : " + set2);

        //intersection
        set2.retainAll(set1);
        print("Intersection of set2 and set1 : \n" + set2);

        set2.add(400);
        set2.add(500);

        //difference
        set2.removeAll(set1);
        print("Difference of set2 and set1 : \n" + set2);

        //subset
        print("Is set2 subset of set1 : \n" + set2.containsAll(set1));

    }
    
//    Collection<--Set<--TreeSet
    //sorted order
    void workWithTreeSet() {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(5);
        set1.add(6);
        set1.add(1);
        set1.add(3);

        print("Set 1 :" + set1);
        print("First : " + set1.first());
        print("Last : " + set1.last());

        print("Higher : " + set1.higher(3));
        print("Lower : " + set1.lower(3));

        print("Ceiling : " + set1.ceiling(3));
        print("Floor : " + set1.floor(3));

        print("Head Set : " + set1.headSet(3));
        print("Tail Set : " + set1.tailSet(3));
        print("SubSet : " + set1.subSet(2, 6));

    }

//    Map<--HashMap    
    void workWithHashMap() {

        Map<Integer, String> maps = new HashMap<>();
        maps.put(400, "Cats");
        maps.put(100, "Rabbits");
        maps.put(200, "Monkeys");
        maps.put(300, "Dogs");

        print(maps);

        for (Integer key : maps.keySet()) {
            print(key);
        }

        for (String value : maps.values()) {
            print(value);
        }

        print(maps.get(400));

    }

//    Map<--SortedMap<--NavigableMap<--TreeMap
    void workWithTreeMap() {
        TreeMap<Integer, String> maps = new TreeMap<>();
        maps.put(500, "Chess");
        maps.put(200, "Hockey");
        maps.put(300, "Swimming");
        maps.put(100, "Cricket");
        maps.put(400, "Football");

        print(maps);

        print(maps.get(200));

        print(maps.replace(100, "Tennis"));
        print(maps.get(100));

        print(maps.firstKey());
        print(maps.lastKey());

    }

    public static void main(String[] args) {
        // TODO code application logic here
        CollectionFramework obj = new CollectionFramework();
        obj.workWithLinkedList();
//        obj.workWithArrayList();
//        obj.workWithHashSet();
//        obj.workWithTreeSet();
//        obj.workWithHashMap();
//        obj.workWithTreeMap();
    
        

//        List obj1 =  new LinkedList();
//        LinkedList obj2= new LinkedList();
//        
//        obj2.add("Hello");
//        obj2.add(13);
//        obj2.add('M');
//        obj2.add(true);
//        obj2.add(84.56766);
//        
//        LinkedList<Integer> obj3= new LinkedList();
//        
//        obj3.add(1);
//        obj3.add(2);
//        obj3.add(3);
//        
//        
//        System.out.println(obj3.get(2));
        
        
            
    
    }

}
