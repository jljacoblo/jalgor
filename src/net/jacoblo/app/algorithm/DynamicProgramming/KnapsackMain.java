package net.jacoblo.app.algorithm.DynamicProgramming;

import java.util.ArrayList;

import net.jacoblo.algorithm.DynamicProgramming.Knapsack;
import net.jacoblo.data.KnapsackItem;

public class KnapsackMain {
  public static void main(String[] args) {
    KnapsackItem k1 = new KnapsackItem("k1", 3,4);
    KnapsackItem k2 = new KnapsackItem("k2", 2,3);
    KnapsackItem k3 = new KnapsackItem("k3", 4,2);
    KnapsackItem k4 = new KnapsackItem("k4", 4,3);
    KnapsackItem k5 = new KnapsackItem("k5", 40,6);
    ArrayList<KnapsackItem> items = new ArrayList<>();
    items.add(k1);
    items.add(k2);
    items.add(k3);
    items.add(k4);
    items.add(k5);
    
    ArrayList<KnapsackItem> resultValue = Knapsack.knapsack(items, 6);
    System.out.println(resultValue);
    
    double result2 = Knapsack.knapsack2(items, 6);
    System.out.println(result2);
  }
}
