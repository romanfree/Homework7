package com.geekbrains;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void setFood(int food){
        if(food >= 0) {
            this.food = food;
        } else {
            System.out.println("В тарелке с едой не может получиться отрицательного количества еды");
        }
    }
    public int getFood(){
        return food;
    }

    public void decreaseFood(int amount){
        food -= amount;
    }

    public void info(){
        System.out.println("Количество еды: " + food);
    }

    public void fillPlate(int fillAmount){
        food += fillAmount;
        System.out.println("Тарелка пополнилась на: " + fillAmount + "ед.еды");
    }
}
