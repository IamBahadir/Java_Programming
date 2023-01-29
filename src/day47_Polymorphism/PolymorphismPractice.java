package day47_Polymorphism;

import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolymorphismPractice {

    public static void main(String[] args) {



        Car[] cars = {
                new Toyota("Corolla",2022,20000,"Blue",59000),
                new Tesla("Model x",2021,27500,"White",2750000),
                new BMW("M5",2021,74000,"Blue",799000),


        };

        for (Car eachCar : cars) {

            if (eachCar instanceof Toyota){
                System.out.println(eachCar);
            }
            if (eachCar instanceof Tesla){
                if (eachCar.year==2021){
                    System.out.println(eachCar);
                }
            }

            if (eachCar instanceof  BMW){
                if (eachCar.price>=50000){
                    System.out.println(eachCar);
                }
            }

        }

        System.out.println("--------------------------------------------");


        int highestMile = 0;

        for (Car eachCar : cars) {

            if (eachCar instanceof Toyota){
                if (eachCar.miles>highestMile){
                    highestMile = eachCar.miles;
                }
            }

            if (eachCar instanceof Tesla){
                if (eachCar.miles>highestMile){
                    highestMile = eachCar.miles;
                }
            }
            if (eachCar instanceof BMW){
                if (eachCar.miles>highestMile){
                    highestMile = eachCar.miles;
                }
            }
        }
        System.out.println(highestMile);

        for (Car eachCar : cars) {
            if (eachCar.miles == highestMile){
                System.out.println(eachCar);
            }
        }

        System.out.println("--------------------------------------------");

        List<Car> carss = new ArrayList<>();

        List<BMW> bmwList = new ArrayList<>();

        List<Toyota> toyotaList = new ArrayList<>();

        List<Tesla> teslaList = new ArrayList<>();

        for (Car eachCar : cars) {
            carss.add(eachCar);
        }

        System.out.println(carss);

        for (Car eachCar : carss) {
            if (eachCar instanceof BMW){
                bmwList.add((BMW) eachCar);
            }
        }
        System.out.println(bmwList);

        for (Car eachCar : carss) {
            if (eachCar instanceof Toyota){
                toyotaList.add((Toyota) eachCar);
            }
        }
        System.out.println(toyotaList);

        for (Car eachCar : carss) {
            if (eachCar instanceof Tesla){
                teslaList.add((Tesla) eachCar);
            }
        }
        System.out.println(teslaList);

        System.out.println("--------------------------------------------");





    } // end line of the Main Method

}
