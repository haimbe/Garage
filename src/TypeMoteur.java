public enum TypeMoteur {
    DIESEL ("DIESEL"),

    ESSENCE ("ESSENCE"),

    HYBRID ("HYBRIDE"),

    ELECTRIQUE ("ELECTRIQUE");


    private String name = "";




    TypeMoteur(String name){

        this.name = name;

    }



    public String toString(){

        return name;

    }

}