package learning.ostap.interfaces;

import learning.ostap.objects.Animal;

public class HeliTransportationService implements TransportationService {

    @Override
    public void transferDogs(Dog dog) {
        System.out.println("Heli transfer of Dog with name " + dog.getName() + " and age " + dog.getAge() + " and color " + dog.getColor());

    }
}
