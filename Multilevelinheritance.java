class Animal {
    void isAnimal() {
        System.out.println("It is an animal");
    }
}
class Dog extends Animal { //Child of Animal
    void getType() {
        System.out.println(" Its a Dog");
    }
}

class Labra extends Dog{ //child of Dog & GrandChild of animal access of both
    void getBred() {
        System.out.println("It s Labra Dog");
    }
}

class GoldenRetriver extends Labra { //child of Labra & GrandChild of Dog, GreatGrandChild of animal access of 3
    void isSameBred() {
        System.out.println("yes, but it has Golden hairs named; Golden Retriver");
    }
}


public class Multilevelinheritance {
    public static void main(String[] args) {
        GoldenRetriver dog = new GoldenRetriver(); //Lowest Child Class

        dog.isAnimal(); //Can Access all of its previous Parent, GrandP, GreatGrandP
        dog.getType();
        dog.getBred();
        dog.isSameBred();

        Labra dog2 = new Labra();

        dog2.isAnimal();
        dog2.getType();
        dog2.getBred();
        //dog2.isSameBred();  // this cannot be accessible since this mtd is of its CHILD class

    }
}
