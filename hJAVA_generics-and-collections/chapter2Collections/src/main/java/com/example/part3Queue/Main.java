package com.example.part3Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Queue<String> line = new LinkedList<>();
    line.add("Mike");
    line.add("Isabel");
    line.add("Jenny");

    for(String name: line) {
      System.out.println(name);
    }
    processAlphabetically(line);   
  }

  public static void processAlphabetically(Queue<String> queue){
     Queue<String> alphabeticalQueue = new PriorityQueue<>();

    for(String name: queue) {
      alphabeticalQueue.offer(name);
    }

     while(alphabeticalQueue.peek() != null) {
      String headElement = alphabeticalQueue.remove();
      System.out.println("Processing: "+ headElement);
    }
  }
}