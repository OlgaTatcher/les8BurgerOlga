public class Burger {
    public String bun;
    public String meat;
    public boolean doubleMeat;
    public String cheese;
    public String salad;
    public String mayonnaise;

    public Burger(String bun, String meat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер.Склад: "+this.bun+", "+this.meat+", "+this.cheese+", "+this.salad+", "+this.mayonnaise);

    }
    public Burger(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println("Дієтичний бургер.Склад: "+this.bun+", "+this.meat+", "+this.cheese+", "+this.salad);


    }
    public Burger(String bun, boolean doubleMeat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер з подвіним м'ясом.Склад: "+this.bun+", "+"подвійне м'ясо"+", "+this.cheese+", "+this.salad+", "+this.mayonnaise);

    }

}
