package com.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public int getAppetite(){
        return appetite;
    }

    public void eat(Plate p){
        if(p.getFood() >= getAppetite()) {
            p.decreaseFood(appetite);
            this.satiety = true;
            System.out.println(name + " поел(а)");
        }
    }

    public void catInfo(){
        System.out.println(name + " сыт(а): " + satiety);
    }
}
