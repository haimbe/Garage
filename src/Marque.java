public enum Marque {

    Laguna ("RENO"),

    D4 ("TROEN"),

    A300B ("PIGEOT");


    private String name = "";




    Marque(String name){

        this.name = name;

    }



    public String toString(){

        return name;

    }

}