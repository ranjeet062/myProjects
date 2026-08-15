package org.algo.majorityelement;

import java.util.*;
import java.util.stream.Collectors;

public class ProductReviewTest {
    public static void main(String[] args) {
        Product product1 = new Product(5, "Product A");
        Product product2 = new Product(4, "Product B");
        Product product3 = new Product(5, "Product C");
        Product product4 = new Product(3, "Product A");
        Product product5 = new Product(3, "Product C");

        System.out.println("------------------------------");
        Map<String, Integer> productReviewMap = new HashMap<>();
        Product[] products = {product1, product2, product3, product4, product5};
        for (Product product : products) {
            productReviewMap.put(product.getName(),
                    productReviewMap.getOrDefault(product.getName(), 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : productReviewMap.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Review Count: " + entry.getValue());
        }

        List<Map.Entry<String, Integer>> collect = productReviewMap.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())).collect(Collectors.toList());

        for (Map.Entry<String, Integer> entry : collect) {
            System.out.println("Sorted Product: " + entry.getKey() + ", Review Count: " + entry.getValue());
        }

        System.out.println("------------------------------");
        Map<String, Integer> sortedMap = productReviewMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        for (Map.Entry entry: sortedMap.entrySet()) {
            System.out.println("Sorted Product: " + entry.getKey() + ", Review Count: " + entry.getValue());
        }

        System.out.println("------------------------------");
        Map<String, Integer> sortedMap1 = productReviewMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        for (Map.Entry entry: sortedMap1.entrySet()) {
            System.out.println("Sorted Product: " + entry.getKey() + ", Review Count: " + entry.getValue());
        }

        System.out.println("------------------------------");
        List<Map.Entry<String, Integer>> productReviewEntries = new LinkedList<>(productReviewMap.entrySet());
        for (Map.Entry<String, Integer> entry : productReviewEntries) {
            System.out.println("Product: " + entry.getKey() + ", Review Count: " + entry.getValue());
        }

        Collections.sort(productReviewEntries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<String , Integer> shortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : productReviewEntries) {
            System.out.println("Product: " + entry.getKey() + ", Review Count: " + entry.getValue());
            shortedMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String , Integer> entry : shortedMap.entrySet()) {
            System.out.println("Sorted Product: " + entry.getKey() + ", Review Count: " + entry.getValue());
        }

    }
}
