public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);

        Vehicule lag1 = new Laguna();
        lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256));
        lag1.addOption(new GPS());
        lag1.addOption(new Siegechauffant());
        lag1.addOption(new Vitreelectrique());
        garage.addVoiture(lag1);

        Vehicule A300B_2 = new A300B();
        A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234));
        A300B_2.addOption(new Climatisation());
        A300B_2.addOption(new Barredetoit());
        A300B_2.addOption(new Siegechauffant());
        garage.addVoiture(A300B_2);

        Vehicule d4_1 = new D4();
        d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80));
        d4_1.addOption(new Barredetoit());
        d4_1.addOption(new Climatisation());
        d4_1.addOption(new GPS());
        garage.addVoiture(d4_1);

        Vehicule lag2 = new Laguna();
        lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987));
        garage.addVoiture(lag2);

        Vehicule A300B_1 = new A300B();
        A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95));
        A300B_1.addOption(new Vitreelectrique());
        A300B_1.addOption(new Barredetoit());
        garage.addVoiture(A300B_1);

        Vehicule d4_2 = new D4();
        d4_2.setMoteur(new MoteurElectrique("100 KW", 1224));
        d4_2.addOption(new Siegechauffant());
        d4_2.addOption(new Barredetoit());
        d4_2.addOption(new Climatisation());
        d4_2.addOption(new GPS());
        d4_2.addOption(new Vitreelectrique());
        garage.addVoiture(d4_2);
        System.out.println(garage);
    }
}