package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Барсик", 5, false);
        cat[1] = new Cat("Том", 5, false);
        cat[2] = new Cat("Мурка", 5, false);
        Plate plate = new Plate(10);

        plate.info();
        for (Cat value : cat) {
            value.eat(plate);
            value.catInfo();
            plate.info();
        }

        plate.fillPlate(5);
        cat[2].eat(plate);
        cat[2].catInfo();


    }
}
