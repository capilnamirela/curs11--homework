package org.fasttrackit.curs11.homework11.extraMileExercices;

import org.fasttrackit.curs11.homework11.exercices.ex23.Person;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 5, 35000, 5000));
        cars.add(new Car("BMW", 8, 15000, 8000));
        cars.add(new Car("Toyota", 7, 18000, 4000));
        cars.add(new Car("Toyota", 2, 2000, 12000));

        System.out.println(cars);
        System.out.println("Car name + number of cars in shop: " + fromNameToNumber(cars));
        System.out.println("Car name + sum of km: " + fromNameToSumkm(cars));
        System.out.println("Cars to km range from 10.000 to 10.000: " + formKmRangeToListCars(cars));
        System.out.println("Cars price range from 5000 to 5000: " + formPriceRangeToListCars(cars));
    }

    private static Integer nrCarsName(List<Car> cars, String nameCar) {
        Integer nr = 0;
        for (Car car : cars) {
            if (car.name() == nameCar) {
                nr++;
            }
        }
        return nr;
    }

    private static Map<String, Integer> fromNameToNumber(List<Car> cars) {
        Map<String, Integer> nameToNumber = new HashMap<>();
        for (Car car : cars) {
            nameToNumber.put(car.name(), nrCarsName(cars, car.name()));
        }
        return nameToNumber;
    }

    private static Integer nameCarSumKm(List<Car> cars, String nameCar) {
        Integer sumKm = 0;
        for (Car car : cars) {
            if (car.name() == nameCar) {
                sumKm += car.km();
            }
        }
        return sumKm;
    }

    private static Map<String, Integer> fromNameToSumkm(List<Car> cars) {
        Map<String, Integer> nameToKm = new HashMap<>();
        for (Car car : cars) {
            nameToKm.put(car.name(), nameCarSumKm(cars, car.name()));
        }
        return nameToKm;
    }

   private static List<Car> range(List<Car> cars, Integer minInt, Integer maxInt) {
        List<Car> listCarsRange = new ArrayList<>();
        for (Car car : cars) {
            if (car.km() > minInt && car.km() <= maxInt) {
                listCarsRange.add(car);
            }
        }
        return listCarsRange;
    }

    private static Integer kmMax(List<Car> cars) {
        Integer kmMax = 0;
        for (Car car : cars) {
            if (car.km() > kmMax) {
                kmMax = car.km();
            }
        }
        return kmMax;
    }

    private static Map<String, List<Car>> formKmRangeToListCars(List<Car> cars) {
        Map<String, List<Car>> kmRangeToListCars = new HashMap<>();
        Integer minInt = 0;
        Integer maxInt = 10000;
        String rangeKm = minInt + " to " + maxInt;
        while (maxInt <= kmMax(cars)+10000) {
            kmRangeToListCars.put(rangeKm, range(cars, minInt, maxInt));

            minInt += 10000;
            maxInt += 10000;
            rangeKm = minInt + " to " + maxInt;
        }

        return kmRangeToListCars;
    }

    private static List<Car> rangePrice(List<Car> cars, Integer minInt, Integer maxInt) {
        List<Car> listCarsRangePrice = new ArrayList<>();
        for (Car car : cars) {
            if (car.price() > minInt && car.price() <= maxInt) {
                listCarsRangePrice.add(car);
            }
        }
        return listCarsRangePrice;
    }

    private static Integer priceMax(List<Car> cars) {
        Integer priceMax = 0;
        for (Car car : cars) {
            if (car.price() > priceMax) {
                priceMax = car.price();
            }
        }
        return priceMax;
    }

    private static Map<String, List<Car>> formPriceRangeToListCars(List<Car> cars) {
        Map<String, List<Car>> priceRangeToListCars = new HashMap<>();
        Integer minInt = 0;
        Integer maxInt = 5000;
        String rangePrice = minInt + " to " + maxInt;
        while (maxInt <= priceMax(cars)+5000) {
            priceRangeToListCars.put(rangePrice, rangePrice(cars, minInt, maxInt));

            minInt += 5000;
            maxInt += 5000;
            rangePrice = minInt + " to " + maxInt;
        }

        return priceRangeToListCars;
    }
}

