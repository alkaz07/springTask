package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class JavaClassDemo implements CodeDemostrator{
    @Autowired
    ClassNameGenerator className;

    public void setClassName(ClassNameGenerator className) {
        this.className = className;
    }

    @Override
    public String generateCode(){
        return "public class "+className.getName()+" {\n" +
                "    public static void main(String[] args) {\n" +
                "    }\n" +
                "}";
    }

    @Override
    public String toString() {
        return "JavaClassDemo{" +
                "className=" + className +
                '}';
    }
}
