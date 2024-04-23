package org.example;

public class RandomShapeGenerator implements ClassNameGenerator{
    @Override
    public String toString() {
        return "RandomShapeGenerator";
    }

    @Override
    public String getName() {
        int x = (int) (Math.random() * 3);
        String[] s = new String[]{"Circle", "Triangle", "Square"};
        return s[x];
    }
}
