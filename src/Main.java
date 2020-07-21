import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager =new ProductManager();

        List<Product> lists = new ArrayList<>();
        lists.add(productManager.product0);
        lists.add(productManager.product1);
        lists.add(productManager.product2);
        lists.add(productManager.product3);
        lists.add(productManager.product4);







        Map<Integer,Product> map = new TreeMap<>();


        Collections.sort(lists,productManager);


        for (int i=0;i<lists.size();i++){
            map.put(i,lists.get(i));
        }

        System.out.println();
        System.out.println("Danh sách SP : ");
        for (Map.Entry<Integer,Product> maps : map.entrySet()){
            System.out.println(maps.getKey()+" : "+maps.getValue());
        }


        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xóa sản phẩm");
        System.out.println("3. Sửa sản phẩm");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        while (true) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    lists.add(productManager.add1());
                    Collections.sort(lists, productManager);


                    for (int i = 0; i < lists.size(); i++) {
                        map.put(i, lists.get(i));
                    }

                    System.out.println();
                    System.out.println("Danh sách SP : ");
                    for (Map.Entry<Integer, Product> maps : map.entrySet()) {
                        System.out.println(maps.getKey() + " : " + maps.getValue());
                    }
                    break;
                case 2:
                    System.out.println("Chọn id muốn xóa");
                    int id1 = sc.nextInt();

                    Collections.sort(lists, productManager);


                    for (int i = 0; i < lists.size(); i++) {
                        map.put(i, lists.get(i));
                    }


                    for (int i = 0; i < lists.size(); i++) {
                        if (id1 == lists.get(i).getIdSP()) {
                            map.remove(i);
                            break;
                        }
                    }

                    System.out.println();
                    System.out.println("Danh sách SP : ");
                    for (Map.Entry<Integer, Product> maps : map.entrySet()) {
                        System.out.println(maps.getKey() + " : " + maps.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Chọn id muốn sửa");
                    int id2 = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < lists.size(); i++) {
                        if (id2 == lists.get(i).getIdSP()) {
                            System.out.println("Sửa tên SP " + lists.get(i).getTenSP() + " thành : ");
                            String tenSP = sc.nextLine();
                            System.out.println("Sửa giá SP " + lists.get(i).getGiaSP() + " thành : ");
                            Integer giaSP = sc.nextInt();
                            Product product = new Product(tenSP, id2, giaSP);
                            lists.remove(i);
                            lists.add(product);
                            break;
                        }
                    }

                    Collections.sort(lists, productManager);


                    for (int i = 0; i < lists.size(); i++) {
                        map.put(i, lists.get(i));
                    }

                    System.out.println();
                    System.out.println("Danh sách SP : ");
                    for (Map.Entry<Integer, Product> maps : map.entrySet()) {
                        System.out.println(maps.getKey() + " : " + maps.getValue());
                    }


                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }


    }
}
