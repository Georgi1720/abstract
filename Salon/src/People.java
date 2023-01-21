import java.util.ArrayList;

abstract class People {
    private String name;
    protected int money = 30000;
    protected ArrayList<Shop> appliances = new ArrayList<Shop>(); //бытовая техника

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money += money;
    }




    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}