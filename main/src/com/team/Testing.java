package com.team;

import com.team.addition.AdditionUtils;
import com.team.subtraction.SubtractionUtils;

public class Testing {

    public static void main(String[] args) {
        int x = AdditionUtils.addition(1,3);
        System.out.println("x value is "+x);

        int y = SubtractionUtils.subtract(3,1);
        System.out.println("y value is "+y);

    }
}
