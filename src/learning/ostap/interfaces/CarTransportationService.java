package learning.ostap.interfaces;

import learning.ostap.objects.Animal;

public class CarTransportationService implements TransportationService {

    @Override
    public void transfer(Animal animal) {
        System.out.println("Car transfer of Animal with type " + animal.getClass().getSimpleName() + " and name " + animal.getName());

    }
}
