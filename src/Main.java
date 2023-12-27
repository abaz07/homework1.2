public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        System.out.println("Задача 6");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var sum = weight1 + weight2;
        var result = weight1 - weight2;
        System.out.println(sum);
        System.out.println(result);
        //Задача 7
        System.out.println("Задача 7");
        System.out.println(result);
        var result2 = weight2 % weight1;
        System.out.println(result2);
        System.out.println("Задача 8.1");
        var businessHours = 640;
        var time = 8;
        var totalEmployees = businessHours / time;
        System.out.println(totalEmployees);
        System.out.println("Задача 8.2");
        totalEmployees = totalEmployees + 94;
        businessHours = totalEmployees * time;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + businessHours + " часов работы может быть поделено между сотрудниками");
    }
}