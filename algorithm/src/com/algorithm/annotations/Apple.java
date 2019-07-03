package com.algorithm.annotations;

import com.algorithm.annotations.FruitColor.Color;

public class Apple {
    @FruitName("Apple")
    private static String appleName;
    
    @FruitColor(fruitColor=Color.RED)
    private String appleColor;
    
    @FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
    private String appleProvider;
}
