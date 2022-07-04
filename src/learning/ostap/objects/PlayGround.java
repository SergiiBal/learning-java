package learning.ostap.objects;

public class PlayGround {
    public static void main(String[] args) {
        Cat catOfSergii = new Cat("Tom", 2);
        Cat catOfOstap = new Cat("Rex");
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
        catOfOstap.setColor(CatColor.BLACK);
        System.out.println("Sergii's cat watched frontal camera and figured out that he is black&white");
        System.out.println(catOfSergii);
        System.out.println(catOfOstap);

        System.out.println(" A little bit later cats met each other, have something close to date, and after that new cat was born");
        Cat catOfOksana = new Cat("Rex", 1, 4, "red");
        ///new class or exception
        System.out.println(catOfOksana);

        System.out.println("And then little cat was detected by the bird predator");
        Bird predatorBird = new Bird(BirdName.EAGLE.name(), 4, 2, "grey", 90);
        ///
        System.out.println(predatorBird);
        System.out.println("one year later");
        predatorBird.setAge(5);
        predatorBird.setColor("dark grey");
        System.out.println(predatorBird);
        System.out.println("once eagle was caught, sent to the zoo, and renamed");
        predatorBird.setName(String.valueOf(BirdName.BERNARDO));
        System.out.println(predatorBird);
        System.out.println("he met a new friend in birdcage");
        Bird eagleFriend = new Bird(BirdName.ROMEO.name(), predatorBird.getAge(),  "black");
        Bird eagleFriend2 = new Bird(BirdName.ROMEO.name(), predatorBird.getAge(), "black");
        System.out.println(eagleFriend);
        System.out.println(predatorBird.equals(eagleFriend));
        System.out.println(eagleFriend2.equals(eagleFriend));
        ///
        System.out.println(predatorBird.hashCode());
        System.out.println(eagleFriend.hashCode());
        System.out.println(eagleFriend2.hashCode());
        System.out.println(eagleFriend2.equals(eagleFriend));
//        public Bird clone()         {
//            return super.clone();
//        }
      //  Cat catOfPolina = null;
     //  Cat catOfPolina = (Cat) catOfOstap.clone();
     ///   public class Cat implements Cloneable {
        System.out.println(predatorBird);

    }
}

/*
Homework
1) Practice String Methods
2) Play with cats
3) Create Bird and Dog Classes and play with Objects
4) Search for Junior Position
https://rabota.ua/ua/company788/vacancy9165606
    Basic knowledge of object-oriented programming
    Basic knowledge of REST API
    Basic knowledge of Git
    Basic knowledge of Java
    Basic knowledge of SQL- Basic knowledge of HTML/CSS
    Basic knowledge and interest in data structures and algorithms.
    Good verbal and written English
https://rabota.ua/ua/company2934598/vacancy9178324
https://www.work.ua/jobs/4812716/
https://www.work.ua/jobs/4732732/
 */
