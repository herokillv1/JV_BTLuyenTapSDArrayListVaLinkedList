import java.util.Comparator;
import java.util.Scanner;

public class ProductManager extends Product implements Comparator<Product> {

    Product product0 = new Product("Điện Thoại",1,1000);
    Product product1 = new Product("Máy Tính",2,2000);
    Product product2 = new Product("Đồng Hồ",3,500);
    Product product3 = new Product("Ô Tô",4,4000);
    Product product4 = new Product("Xe Đạp",5,800);



    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getGiaSP() > o2.getGiaSP()){
            return -1;
        }else if(o1.getGiaSP() == o2.getGiaSP()){
            return 0;
        }else{
            return 1;
        }
    }

    public Product add1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên SP mới : ");
        String tenSP = sc.nextLine();
        System.out.println("ID SP mới : ");
        Integer idSP = sc.nextInt();
        System.out.println("Giá SP mới : ");
        Integer giaSP = sc.nextInt();

        Product productx = new Product(tenSP,idSP,giaSP);
        return productx;
    }

}
