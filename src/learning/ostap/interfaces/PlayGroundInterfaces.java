package learning.ostap.interfaces;

import learning.ostap.objects.Animal;
import learning.ostap.objects.Bird;
import learning.ostap.objects.Cat;

public class PlayGroundInterfaces {
    public static void main(String[] args) {
        Cat mom = new Cat("TED", 5);
        Bird ptashka = new Bird("Vorona", 3, "Red");

//        BusTransportationService b = new BusTransportationService();
//        CarTransportationService c = new CarTransportationService();
//        callTransfer(b, mom);
//        callTransfer(b, ptashka);
//        callTransfer(c, mom);
//        callTransfer(c, ptashka);
//        c.transfer(ptashka);
        Dog dogOfSergii = new Dog ("Rex", 4, "black");
        HeliTransportationService h = new HeliTransportationService();
        callTransferDogs(h, dogOfSergii);
        dogOfSergii.bark();
    }


//    static void callTransfer(TransportationService transportationService, Animal1 animal) {
//        transportationService.transfer(animal);
//    }
    static void callTransferDogs(TransportationService transportationService, Dog dog) {
        transportationService.transferDogs(dog);
    }
}


