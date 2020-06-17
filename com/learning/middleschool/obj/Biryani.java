package com.learning.middleschool.obj;

public class Biryani {
    public enum Type{
        CHICKEN,
        MUTTON,
        VEGETABLE
    }

    private Type type;
    private String name;

    public Type getType(){
        return this.type;
    }
    public void setType(Type type){
        this.type = type;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void make(){
        System.out.printf("Making %s using %s \n", this.name, this.type);
    }

    
}