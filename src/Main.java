public class Main {

    public static void main(String[] args) {



        System.out.println("Hello World!");
        System.out.println("Привет МИР!");
        System.out.println("Я изучаю JAVA");
        
//Переменные(HW2)
//1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(); //пустая строка для отделения строк между заданиями
//2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(); //пустая строка для отделения строк между заданиями
//3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(); //пустая строка для отделения строк между заданиями
//4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(); //пустая строка для отделения строк между заданиями
//5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(); //пустая строка для отделения строк между заданиями
//6
        var b1 = 78.2;
        var b2 = 82.7;
        System.out.println(b1+b2);
        System.out.println(b2-b1);
        System.out.println(); //пустая строка для отделения строк между заданиями
//7
        System.out.println(b2 % b1);
        System.out.println(); //пустая строка для отделения строк между заданиями
//8.1
        var hour = 640;
        var wd = 8;
        var people = hour / wd;//всего человек работает в компании
        System.out.println("Всего работников в компании - " + people);
        System.out.println(); //пустая строка для отделения строк между заданиями
//8.2
        var peopleNew = people + 94;
        var hourNew = peopleNew * 8;
        System.out.println("Если в компании работает " + peopleNew + " человек, то всего " + hourNew + " часов работы может быть поделено между сотрудниками");


        // Cycles(HW6)
        //1
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();

        //2
        for (int a = 10; a > 0; a--){
            System.out.println(a);
        }
        System.out.println();

        //3
        for (int b = 2; b < 17; b += 2){
            System.out.println(b);
        }
        System.out.println();

        //4
        for (int c = -10; c <= 10; c++){
            System.out.println(c);
        }
        System.out.println();

        //5
        for (int year = 1904; year < 2096; year += 4){
            System.out.println(year);
        }
        System.out.println();

        //6
        for (int d = 7; d < 100; d += 7){
            System.out.println(d);
        }
        System.out.println();

        //7
        for (int e = 1; e < 1024; e *= 2){
            System.out.println(e);
        }
        System.out.println();

        //8
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + (i+1) + ",сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        //9
        int sal= 29000;
        int tot = 0;
        for (int i = 0; i < 12; i++) {
            tot = tot + tot/100;
            tot = tot + sal;
            System.out.println("Месяц " + (i + 1) + ",сумма накоплений равна " + tot + " рублей");
        }
        System.out.println();

        //10
        int f = 2;
        for (int g = 1; g < 11; g++){
            System.out.println(f + "*" + g + "=" + f*g);
        }
        System.out.println();
        
        }
}
