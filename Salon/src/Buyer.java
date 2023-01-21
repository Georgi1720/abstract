import java.util.Scanner;

public class Buyer extends People implements Buy,Lamda, Shop{


    public Buyer(String name) {
        super(name);
    }


    @Override
    public void searchForAproduct(Director dir) {
        dir.getStaf();
        System.out.println("Выберите продавца:" );
        System.out.println("Добрый день меня зовут"+ dir.staff.get(((int) scanner())).getName());
        System.out.println("Вот что я могу Вам предложить: "  );
        dir.staff.get(((int) scanner())).getProducts();
        System.out.println("Выберите товар: ");
        products.get(scanner());
    }

    @Override
    public void buy() {

    }


    public int scanner(){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    @Override
    public void calculation() {
        
    }
}
