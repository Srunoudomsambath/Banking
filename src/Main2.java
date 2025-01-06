//import lombok.Getter;

import lombok.Getter;
import lombok.Setter;

abstract class Product{
    int id;
//    @Getter
    String name;
//    @Getter
    double price;
    public Product( int id, String name, double price){
        this.id = id;
        this.name=name;
        this.price=price;
    }
    public double discount() {
        return 0;
    }

    public void displayDetail(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Discount : " + discount());
    }


//    @Setter
//    @Getter
    static class Electronics extends Product {
        private int warrantYears;
        public Electronics(int id,String name,double price,int warrantYears){
            super(id,name,price);
        }

        @Override
        public double discount() {
            if (warrantYears>2) {
                ;
            }
            return price * 0.10;
        }

        @Override
        public void displayDetail() {
            super.displayDetail();
            System.out.println("Warrantyears" + warrantYears +"Months" );
        }
    }


//    @Setter
//    @Getter
    static class Clothing extends Product{
        String size;
        public Clothing(int id, String name, double price,String size) {
            super(id, name, price);

        }

//        @Override
        public double discount() {
            return price * 0.15;
        }

//        @Override
        public void displayDetail() {
            super.displayDetail();
            System.out.println("size : "+ size);
        }
    }
    public static class Main2 {
        public static void main(String[] args) {
            Product[] product = new Product[3];
            product[0] = new Electronics(1, "Washingmachine", 22,12);
            product[1] = new Clothing(2, "Zando", 22,"l");
            product[2] = new Electronics(3,"Panasonic",100,24);

            for (Product products : product) {
                products.displayDetail();
//                System.out.println("Product : " + product.getName());
            }
        }

    }
}

