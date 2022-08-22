package com.Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTest {

    public static void main(String[] args) {

        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        DishData.getAll().stream()
                .map(Dish->Dish.getName().length())
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

        DishData.getAll().stream()
                .filter(Dish->Dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        DishData.getAll().stream()
                .filter(Dish->Dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);



    }


}
