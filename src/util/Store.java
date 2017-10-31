package util;

import java.util.*;

public class Store {
    private double price;
    private long weight;
    private Date date;
    private final int id;
    private String description;
    public Store(double p, long w, Date d, int id, String des) {
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
    public static Generator<Store> generator = 
    new Generator<Store> () {
        private random rand = new random(47);
        public static next() {
            return new Store(rand.nextInt(1000), new Date(), "A B C D E F G H", rand, rand + 0.99);
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
