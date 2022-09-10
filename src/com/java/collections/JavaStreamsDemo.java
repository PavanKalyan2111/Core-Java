package com.java.collections;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamsDemo {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(20);

        //Print Squares of numbersList Value Using Foreach loop in List
       List<Integer> squaresList = new ArrayList<>();
        for (Integer i: numbersList) {
                squaresList.add(i*i);
        }
        System.out.println("Square Values Using Foreach loop : "+squaresList);

        //Print Squares of numbersList Value Using Java Streams in List
        List<Integer> squaresList1 = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("Square Values Using Java Streams : "+squaresList1);

        //Print Squares of numbersList Value Using Foreach loop in Set
        Set<Integer> squaresSet = new HashSet<>();
        for(Integer i: numbersList) {
            squaresSet.add(i * i);
        }
        System.out.println("Square Values of a Set : "+squaresSet); // due to HashSet the values are print random order

        Set<Integer> squaresSet1 = numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("Square Values of a Set using Java Streams : "+squaresSet1);

        List<String> languages = new ArrayList<>();
        languages.add("scala");
        languages.add("java");
        languages.add("python");
        languages.add("docker");


        List<String> filterResult = new ArrayList<>();
        for (String s: languages){
            if(s.startsWith("p")){
                filterResult.add(s);
            }
        }
        System.out.println("Languages Starts With 'p' : "+filterResult);

        List<String> filterResult1 = languages.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());
        System.out.println("Languages starts with 'p' using streams : "+filterResult1);

        System.out.println("Languages Before Sorting : "+languages);

        //sorting using java streams
        List<String> sortedLanguages = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Languages After Sorting using Java Streams :"+sortedLanguages);

        //sorting using collections
        Collections.sort(languages);
        System.out.println("Languages After Sorting : "+languages);

        //Iterate collection elements through java stream
        System.out.println("Printing Elements one by one");
        languages.stream().forEach(x -> System.out.println("Element is : "+x));

        // To print sum of all collection elements
        int sum = numbersList.stream().reduce(0,(ans,i) -> ans+i);
        System.out.println("Sum of All Elements : "+sum);
    }
}
