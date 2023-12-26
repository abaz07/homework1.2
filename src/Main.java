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
        var massaPervogoBoica = 78.2;
        var massaVtorogoBoica = 82.7;
        var sum = massaPervogoBoica + massaVtorogoBoica;
        var raznica = massaVtorogoBoica - massaPervogoBoica;
        System.out.println(sum);
        System.out.println(raznica);
        //Задача 7
        System.out.println("Задача 7");
        System.out.println(raznica);
        var ostatokOtDeleniya = massaVtorogoBoica % massaPervogoBoica;
        System.out.println(ostatokOtDeleniya);
        System.out.println("Задача 8.1");
        var chasiRaboti = 640;
        var vremiyaNaOdnogo = 8;
        var vsegoRabotnikov = chasiRaboti / vremiyaNaOdnogo;
        System.out.println(vsegoRabotnikov);
        System.out.println("Задача 8.2");
        vsegoRabotnikov = vsegoRabotnikov + 94;
        chasiRaboti = vsegoRabotnikov * vremiyaNaOdnogo;
        System.out.println("Если в компании работает " + vsegoRabotnikov + " человек, то всего " + chasiRaboti + " часов работы может быть поделено между сотрудниками");
    }
}