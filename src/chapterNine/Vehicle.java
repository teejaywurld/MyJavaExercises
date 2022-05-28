package chapterNine;

public class Vehicle {
    private String name = "";
    private String colour = "";
    private String model = "";
    private String company = "";
    private String engine = "800";
    public static  int count = 0;

    public Vehicle() {
        count++;
    }

    public Vehicle(String name, String colour, String model, String company, String engine) {
        this.name = name;
        this.colour = colour;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public String getEngine(){
        return engine;
    }
    private void setEngine(String engine){
        this.engine = engine;
    }
    public int getSpeed(){
        String a = getEngine();
        if (a == "800") {
            return 90;
        }
            else {
                return 120;
            }
        }
    }

