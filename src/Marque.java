public enum Marque {

    Reno ("RENO"),

    TROEN ("TROEN"),

    PIGEOT ("PIGEOT");


    private String name = "";




    Marque(String name){

        this.name = name;

    }



    public String toString(){

        return name;

    }

}