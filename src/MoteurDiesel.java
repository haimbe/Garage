public class MoteurDiesel extends Moteur{



       public void MoteurDiesel(String puissance , double prix){

            this.puissance=puissance;
            this.prix=prix;
            this.typeMoteur=TypeMoteur.DIESEL;

            }

        public String toString(){

            return "Moteur "+ this.typeMoteur.toString() + " "+ this.puissance+ " Chevaux " + "("+this.prix+")"+" ";
        }






    }

