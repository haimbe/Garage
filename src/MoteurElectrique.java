public class MoteurElectrique {

    int puissance;
    int cylindre;

    void MoteurElectrique(){

        puissance=0;
        cylindre=0;

     public String toString(int puissance,int cylindre){

         this.puissance=puissance;
         this.cylindre=cylindre;

         System.out.println("Moteur ELECTRIQUE "+this.puissance+"W"+" ("+(this.cylindre*23)+"€)");
        }

    }


}
