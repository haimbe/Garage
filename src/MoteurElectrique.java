public class MoteurElectrique extends Moteur{




        public MoteurElectrique( String puissance , double prix){

                this.puissance=puissance;
                this.prix=prix;
            this.typeMoteur=TypeMoteur.ELECTRIQUE;

            }

    public String toString(){

        return "Moteur "+ this.typeMoteur.toString() + " "+ this.puissance+ " Chevaux " + "("+this.prix+")"+" ";
    }




    }


