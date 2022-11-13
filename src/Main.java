import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 21;
        if (age >= 18) {
            System.out.println("Вам больше 18 лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил,нужно подождать");
        }
    }

    public static void task2() {
        int temp = 20;
        if (temp >= 5) {
            System.out.println("Сегодня теплло,можно идти без шапки");
        } else {
            System.out.println("На улице холодно,нужно надеть шапку");
        }
    }

    public static void task3() {
        int speed = 80;
        if (speed <= 60) {
            System.out.println("Превышения скорости нет,можно ездить спокойно");
        } else {
            System.out.println("Скорость превышена,придётся заплатить штраф");
        }
    }

    public static void task4() {
        int age = 26;
        if (age <= 2 && age >= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else if (age > 24)
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
    }

    public static void task5() {
        int age = 11;
        if (age < 5) {
            System.out.println("Если ребенку меньше " + age + "то он не может кататься на аттракицоне");
        } else if (age > 5 && age < 14) {
            System.out.println("если ребенку больше " + age + " то он может кататься только в сопровождение взрослого");
        } else if (age > 14) {
            System.out.println("Если ребенку больше " + age + " то он может кататься без сопровождения взрослого ");
        }
    }

    public static void task6() {
        int totalCapacity = 102;
        int seatsCapacity = 60;
        int otherCapacity = totalCapacity - seatsCapacity;

        int usedSeats = 45;
        int usedOther = 30;

        int availableSeats = seatsCapacity - usedSeats;
        int availableOther = otherCapacity - usedOther;

        if (availableSeats == 0 && availableOther == 0) {
            System.out.println("В вагоне нет мест!");
        } else {
            if (availableSeats > 0) {
                System.out.println("В вагоне есть " + availableSeats + " сидячих мест ");
            }
            if (availableOther > 0) {
                System.out.println("В вагоне есть " + availableOther + " стоячих мест");
            }
        }
    }
    public static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        int max = one;
        if(two>max){
            max = two;
        }
        if(three>max){
            max=three;
        }
        System.out.println("Максимум из чисел " + one + "," + two + ","  +  three + " равен " + max );
    }
}



