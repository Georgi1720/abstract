import java.util.Map;
import java.util.Objects;

public class Seller extends People implements Sell, Shop {
    //protected String mood;

    public Seller(String name) {
        super(name);
    }



    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setMoney(int money) {
        super.setMoney(money);
    }



    @Override
    public void getProducts() {
        for (Map.Entry entry : products.entrySet()) {
            {
                System.out.println(entry);
            }
        }
    }
}