package learning.ostap.interfaces;

import learning.ostap.objects.Bird;
import learning.ostap.objects.Cat;
import learning.ostap.objects.Animal;

public class PlayGroundInterfaces {
    public static void main(String[] args) {
        Cat mom = new Cat("TED", 5);
        Bird ptashka = new Bird("Vorona", 3, "Red");

        BusTransportationService b = new BusTransportationService();
        CarTransportationService c = new CarTransportationService();
        callTransfer(b, mom);
        callTransfer(b, ptashka);
        callTransfer(c, mom);
        callTransfer(c, ptashka);
        c.transfer(ptashka);

        Child visitor56 = new Child ("Polina", 2, "girl");
        ChildTransportationService h = new ChildTransportationService();
        System.out.println(visitor56.introduceYourSelf() + visitor56.getName() + ".");
        callTransferChild(h, visitor56);
    }


    static void callTransfer(TransportationService transportationService, Animal animal) {
        transportationService.transfer(animal);
    }
    static void callTransferChild(TransportationService transportationService, Child child) {
        transportationService.transferChild(child);
    }
}


