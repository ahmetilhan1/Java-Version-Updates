package com.Task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
@Data
@AllArgsConstructor
@Getter
@Setter

public class Dish {

        private String name;
        private boolean vegetarian;
        private int calories;
        private Type type;
    }



