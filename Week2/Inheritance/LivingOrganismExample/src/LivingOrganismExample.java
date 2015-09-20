
/*
* Define the relationships between organisms.
* Don't repeat yourself. Try to express the relationships by using inheritance.
*
* If organism A has a lot in common with organism B then organism B should probably extend organism A.
*
* Note: This is not really the place to think about implementation details.
*
* */

class BaseOrganism {

    Energy energy;
    DNA dna = new DNA();
    RNA rna = new RNA();

    public void aquireEnergy(Matter matter) {

    }

}

//Many more classes

class Dog {

}

public class LivingOrganismExample {

    public static void main(String[] args) {

    }

}
