package ra.run;

import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement extends Product {
        List<Product> listProduct = new ArrayList<>();
    public ProductManagement() {
        System.out.println("***************JAVA-HACKATHON-05-BASIC-MENU***************" + "\n" +
                "1. Nhập số sản phẩm và thông tin sản phẩm" + "\n" +
                "2. Hiển thị thông tin các sản phẩm" + "\n" +
                "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần" + "\n" +
                "4. Xoá sản phẩm theo mã sản phẩm" + "\n" +
                "5. Tìm kiếm sản phẩm theo tên sản phẩm" + "\n" +
                "6. Thay đổi trạng thái sản phẩm theo mã sản phẩm" + "\n" +
                "7. Thoát.");
    }

    public void addProduct(){

    }
    public static void main(String[] args) {
//        ArrayList<String> listProduct = new ArrayList<String>();
        ProductManagement productManagement = new ProductManagement();
        Scanner input = new Scanner(System.in);
        System.out.println("Chọn : ");
        int choice = input.nextInt();
        int check = 0;
do {
    switch (choice) {
        case 1:
            productManagement.inputData();
            break;
        case 2:
            System.out.println("Các sản phẩm có trong list là: ");
            for (int i = 0; i < listProduct.size(); i++) {
                System.out.println(listProduct.get(i));
            }
            break;
        case 3:

            break;
        case 4:

            break;
        case 5:
            break;
        case 6:
            break;
        case 7:
            System.exit(0);
        default:
            System.out.println("Chọn lại");
    }
}while (check != 7);


    }
    public static void inputProduct(Scanner sc) {
        System.out.println();
    }
}