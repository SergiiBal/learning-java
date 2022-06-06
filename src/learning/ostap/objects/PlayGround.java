package learning.ostap.objects;

public class PlayGround {
    public static void main(String[] args) {
        Cat catOfSergii = new Cat("Tom", 2);
        Cat catOfOstap = new Cat("Bob");
        System.out.println(catOfSergii);
        System.out.println(catOfOstap);

        System.out.println("After some time");
        catOfOstap.setAge(7);
        catOfOstap.setName("uncle Bob");
        System.out.println(catOfSergii);
        System.out.println(catOfOstap);

        System.out.println("cats evolved");
        Cat.setPalmsAmount(6);
        System.out.println(catOfSergii);
        System.out.println(catOfOstap);

        System.out.println("Once Ostap's cat played with the mirror, where he saw himmself");
        catOfOstap.setColour("red&white");
        System.out.println("Sergii's cat watched frontal camera and figured out that he is black&white");
        System.out.println(catOfSergii);
        System.out.println(catOfOstap);

        System.out.println(" A little bit later cats met each other, have something close to date, and after that new cat was born");
        Cat catOfOksana = new Cat("Rex", 1, 4, "black&red&white");
        ///new class or exception
        System.out.println(catOfOksana);

        System.out.println("And then little cat was detected by the bird predator");
        Bird predatorBird = new Bird("eagle", 4, 2, "grey", 90);
        ///
        System.out.println(predatorBird);
        System.out.println("one year later");
        predatorBird.setAge(5);
        predatorBird.setColour("dark grey");
        System.out.println(predatorBird);
        System.out.println("once eagle was caught, sent to the zoo, and renamed");
        predatorBird.setName("Bernardo");
        System.out.println(predatorBird);
        System.out.println("he met a new friend in birdcage");
        Bird eagleFriend = new Bird("Romeo", "black");
        System.out.println(eagleFriend);
        ///
    }
}

/*
Homework
1) Practice String Methods
2) Play with cats
3) Create Bird and Dog Classes and play with Objects
4) Search for Junior Position
https://rabota.ua/ua/company788/vacancy9165606
https://rabota.ua/ua/company2934598/vacancy9178324
https://www.work.ua/jobs/4812716/
https://www.work.ua/jobs/4732732/
 */
