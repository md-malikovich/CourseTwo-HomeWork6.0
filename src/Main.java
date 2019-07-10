import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        List<Car> car = new ArrayList<>();
        Car c1 = new Car("Toyota", 2000, 5.7);
        car.add(c1);

        car.add(new Car("Mercedes", 2010, 3.7));
        car.add(new Car("BMW", 2012, 5.0));
        car.add(new Car("Honda", 2018, 2.3));
        car.add(new Car("Mitsubishi", 2003, 2.5));
        car.add(new Car("Mazda", 2015, 2.0));
        car.add(new Car("Opel", 2019, 2.4));
        car.add(new Car("Reno", 2007, 3.0));
        car.add(new Car("WV", 2003, 3.7));
        car.add(new Car("Audi", 2014, 4.0));

        System.out.println("_________________________");

        Collections.sort(car);

        Collections.sort(car, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        });

        Iterator<Car> iter1 = car.iterator();
        while (iter1.hasNext()) {
            Car c2 =  iter1.next();
            System.out.println(c2.getModel() + " - " + c2.getYear() + " - " + c2.getVolume());
        }
    }
}
//Создать класс Car с полями model, year, volume                                                  +
//Создать список с машинами из 10 элементов                                                       +
//Реализовать классом Car интерфейс Comparable и определить сортировку по году выпуска машины     +
//И отсортировать список ваших машин                                                              +
