package ra.bussinessImp;

import ra.bussiness.IProduct;

import java.util.Scanner;

public abstract class Product implements IProduct {
    private int productId;
    private String productname ;
    private String title;
    private String descriptions;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private Boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productname, String title, String descriptions, float importPrice, float exportPrice, float interest, Boolean productStatus) {
        this.productId = productId;
        this.productname = productname;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest = exportPrice - importPrice;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String inputData() {

        Scanner input = new Scanner(System.in);
        System.out.println("số lượng sản phẩm");
        int n = Integer.parseInt(input.nextLine());
        Product product = new Product() {
            @Override
            public void displayData() {
                super.displayData();
            }
        };
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập mã sản phẩm: ");
            productId = Integer.parseInt(input.nextLine());
            System.out.println("Nhập tên sản phẩm: ");
            productname = input.nextLine();
            System.out.println("Nhập tiêu đề sản phẩm: ");
            title = input.nextLine();
            System.out.println("Nhập mô tả sản phẩm: ");
            descriptions = input.nextLine();
            System.out.println("Giá nhâp : ");
            importPrice = Float.parseFloat(input.nextLine());
            System.out.println("Giá xuất : ");
            exportPrice = Float.parseFloat(input.nextLine());
            System.out.println("Trạng thái: ");
            productStatus = input.nextLine().isEmpty();
            interest = exportPrice - importPrice;
        }

        return String.valueOf(product);
    }

    @Override
    public void displayData() {
        System.out.println("Mã sản phẩm: "+ productId);
        System.out.println("Tên sản phẩm: " + productname);
        System.out.println("Tiêu đề sản phẩm: "+ title);
        System.out.println("Mô tả sản phẩm: "+ descriptions);
        System.out.println("Giá Nhập: "+ importPrice);
        System.out.println("Giá xuất: "+ exportPrice);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Trạng thái: "+ productStatus);
    }

}
