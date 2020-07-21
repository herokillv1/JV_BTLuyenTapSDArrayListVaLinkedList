public class Product implements Comparable<Product> {
    private String tenSP;
    private Integer idSP;
    private Integer giaSP;

    public Product(){

    }

    public Product(String tenSP,Integer idSP , Integer giaSP){
        this.tenSP = tenSP;
        this.idSP = idSP;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Integer getIdSP() {
        return idSP;
    }

    public void setIdSP(Integer idSP) {
        this.idSP = idSP;
    }

    public Integer getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Integer giaSP) {
        this.giaSP = giaSP;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tenSP='" + tenSP + '\'' +
                ", idSP=" + idSP +
                ", giaSP=" + giaSP +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getTenSP().compareTo(product.getTenSP());
    }
}
