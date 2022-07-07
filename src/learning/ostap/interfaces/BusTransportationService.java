package learning.ostap.interfaces;

import learning.ostap.objects.Animal;

public class BusTransportationService implements TransportationService {

    @Override
    public void transfer(Animal animal) {
        System.out.println("Bus transfer of Animal with type " + animal.getClass().getSimpleName() + " and name " + animal.getName());
    }

    public void transferChild(Child child) {
        System.out.println("");
    }
}

