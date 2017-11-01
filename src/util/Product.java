package util;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import util.Generators1;




    public class Product {
        private double price;
        private long weight;
        private Date date;
        private final int id;
        private String description;
        public Product(double p, long w, Date d, int id, String des) {
            price = p;
            weight = w;
            date = d;
            this.id = id;
            description = des;
            System.out.println(toString());
        }
        public String toString() {
            return id + " " + date + " " + description + " " + weight + " " + price + " ";
        }
        public void priceChange(double c) {
            price += c;
        }
        public static Generator<Product> generator = 
        new Generator<Product> () {
            private Random rand = new Random(47);
            public  Product next() {
                return new Product(Math.round(rand.nextDouble() * 1000.0) + 0.99, rand.nextInt(1000), new Date(), rand.nextInt(1000) , "A B C D" );
            }
        };
       
        public static class Shelf extends ArrayList<Product> {
            public Shelf(int nProducts) {
                Generators1.fill(this, Product.generator, nProducts);
            }
        }
        public static class Aisle extends ArrayList<Shelf> {

            public Aisle(int nShleves, int nProducts) {
                // TODO Auto-generated constructor stub
                for(int i = 0; i < nShleves; i++) {
                    add(new Shelf(nProducts));
                
            }
            
        }
        }
        public class  CheckOut{
            
        }
        public class Office{
            
        }
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
