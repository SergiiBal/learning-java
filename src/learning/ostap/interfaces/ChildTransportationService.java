package learning.ostap.interfaces;

import learning.ostap.objects.Animal;

public class ChildTransportationService implements TransportationService {

    @Override
    public void transferChild(Child child) {
        System.out.println("Child transfer of visitor with name " + child.getName() + " and age " + child.getAge() + " and sex " + child.getSex() + " is here.");

    }

    @Override
    public void transfer(Animal animal) {
        System.out.println("");
    }
}

