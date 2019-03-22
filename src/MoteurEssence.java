public class MoteurEssence {

    int puissance;
    int cylindre;

    void MoteurEssence(){

        puissance=0;
        cylindre=0;

        public String toString(int puissance,int cylindre){

            this.puissance=puissance;
            this.cylindre=cylindre;

            System.out.println("Moteur ESSENCE "+this.puissance+"W"+" ("+(this.cylindre*2.25)+"€)");
        }

    }
}
