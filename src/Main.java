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



        
        }
}
