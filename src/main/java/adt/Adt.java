package adt;

import java.util.*;

public class Adt {
    public static void main(String[] args) {
        System.out.println("in here");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(34);
        numbers.add(100);
        //System.out.println(numbers);

        ArrayList<Boolean> booleanNumbers = new ArrayList<Boolean>();
        booleanNumbers.add(false);
        //System.out.println(booleanNumbers);

        Iterator<Integer> numbersIterator = numbers.iterator();
        System.out.println(numbersIterator.next());
        System.out.println(numbersIterator.hasNext());
        System.out.println(numbersIterator.next());
        System.out.println(numbersIterator.hasNext());

        int y = 9;
        int b = y;

        y = 10;

        //System.out.println(b);
        //System.out.println(y);

        List<Integer> testList = new ArrayList<Integer>();
        testList.add(19);
        testList.add(200);
        System.out.println(Collections.max(testList));


        Set<String> setList = new HashSet<String>();
        setList.add("benjamin");
        setList.add("benjamin");

        System.out.println(setList.iterator().next());

        Map<String, String> dict = new HashMap<>();
        dict.put("benjamin", "12312371638");
        System.out.println(dict);
        System.out.println(dict.get("benjamin"));

    }
}
