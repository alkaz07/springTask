package org.example;

public class CatGenerator implements ClassNameGenerator{
    @Override
    public String toString() {
        return "CatGenerator";
    }

    @Override
    public String getName() {
        return "Cat";
    }
}
