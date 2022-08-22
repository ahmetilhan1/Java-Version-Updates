package com.lambda.apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.RED));
        inventory.add(new Apple(100,Color.GREEN));
        inventory.add(new Apple(400,Color.GREEN));
        inventory.add(new Apple(150,Color.RED));

        AppleWeightPredicate abc = new AppleWeightPredicate();
        List<Apple> heavyApple = filterApples(inventory,abc);
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);

    }

    private static List<Apple> filterApples(List<Apple> inventory,ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
