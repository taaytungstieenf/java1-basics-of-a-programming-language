package com.example.part2CreatingAnArrayExplicity;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
  }
}