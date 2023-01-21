import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Director extends People implements Dir,Shop,Sell{
    protected ArrayList<Seller> staff = new ArrayList<>();

    public Director(String name) {
        super(name);
    }
    @Override
    public void getAjob(Seller seller) {
        staff.add(seller);
    }
    @Override
    public void dismiss(Seller seller) {
        staff.remove(seller);
    }


    @Override
    public void prizeFine(Seller seller, int mone) {
        seller.setMoney(mone);
    }

    public void getStaf(){
        System.out.println(staff.toString());
    }

    public void getStafOnly(int number){
        staff.get(number);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getMoney() {
        return super.getMoney();
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
