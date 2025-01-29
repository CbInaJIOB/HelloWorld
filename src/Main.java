public class Main {

    public static void main(String[] args) {

        // Условный оператор(HW4)
        //1
        byte age = 10;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();// разделитель строк в консоли

        //2
        short t = 6;
        if (t >= 5){
            System.out.println("На улице " + t + " градусов, сегодня тепло, можно идти без шапки");
        } else if (t < 5){
            System.out.println("На улице " + t + " градусов, на улице холодно, нужно надеть шапку");
        }
        System.out.println();// разделитель строк в консоли

        //3
        int vel = 61;
        if (vel > 60){
            System.out.println("Если скорость " + vel + ", то придется заплатить штраф");
        } else if (vel <= 60){
            System.out.println("Если скорость " + vel + ", то можно ездить спокойно");
        }
        System.out.println();// разделитель строк в консоли


        //4
        byte age1 = 7;
        if (age1 >= 2 && age1 <= 6){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else if (age1 > 24){
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }
        System.out.println();// разделитель строк в консоли

        //5
        byte age2 = 6; // возраст ребенка
        boolean adult = true; // наличие сопровождающего взрослого
        if (age2 < 5){
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            if (adult == true) {
                System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе без сопровождении взрослого");
            }
        } else if (age2 >=14) {
            System.out.println("Если возраст ребенка равен" + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();// разделитель строк в консоли

        //6
        byte a = 103;
        if (a <= 60){
            System.out.println("Есть сидячее место!");
        } else if (a > 60 && a <= 102){
            System.out.println("В вагоне есть места стоячие");
        } else {
            System.out.println("Вагон полон!");
        }
        System.out.println();

        //7
        int one = 1;
        int two = 3;
        int three = 2;
        if (one > two ){
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}