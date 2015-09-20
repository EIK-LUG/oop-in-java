

class Acid {

    String taste = "Sour";

    private void dissolve() {
        //Details
    }

    public void putInWater() {
        dissolve();
        //Other details
    }

}

class DNA extends Acid {

}

class RNA extends Acid {

}

class Energy {

    double amount;

    Energy(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return Double.toString(this.amount) + " kcal";
    }
}

class Matter extends Energy {

    double volumeToEnergyRation;

    Matter(int volume, double volumeToEnergyRation) {
        super(volume * volumeToEnergyRation);
        this.volumeToEnergyRation = volumeToEnergyRation;
    }

}

public class ChemistryAndPhysicsExamples {

    public static void main(String[] args) {

    }

}
