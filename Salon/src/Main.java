

public class Main {
    public static void main(String[] args) {
        Director pers10 = new Director("John");
        Seller pers1 = new Seller("Gari");
        Seller pers2 = new Seller("Poli");
        Seller pers3 = new Seller("Rick");
        pers10.getAjob(pers1);
        pers10.getAjob(pers2);
        pers10.getAjob(pers3);
        pers10.getStaf();
        pers1.getProducts();
        Buyer pers100 = new Buyer("Pety");
        pers100.searchForAproduct(pers10);
//        pers10.prizeFine(pers1,-5000);
//        pers10.prizeFine(pers2, 5000);
//        System.out.println(pers1.getMoney());
//        System.out.println(pers2.getMoney());
//        System.out.println(pers10.getMoney());
//        pers10.dismiss(pers1);
//        pers10.getStaf();
//        System.out.println(pers2.getMoney());


//        System.out.println(pers1.getMoney());
//        mvideo.getProducts();

    }
}