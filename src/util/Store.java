package util;

import java.util.*;
import util.Product.*;

    @SuppressWarnings("serial")
    public  class Store extends ArrayList<Aisle>{
        public ArrayList<CheckOut> checkOut = new ArrayList<CheckOut> ();
        //private Office office = new Office();
        public Store(int nAisles, int nShelves, int nProducts) {
            for(int i = 0; i < nProducts; i++) {
                add(new Aisle(nShelves, nProducts));
            }
        }
        public void toString() {
            StringBuilder result = new StringBuilder();
            for(Aisle a : this)
                for(Shelf s: a)
                    for(Product ss: s)
                    {
                        result.append(ss);
                        result.append("\n");
                    }
            //return toString();
        }
        public static void main(String[] args) {
            try {
                System.out.println(new Store(14, 5, 2));
            }
            // TODO Auto-generated method stub
            catch(Exception e) {
                throw new RuntimeException();
                //e.printStackTrace(System.out);
            }
            
        }
    }
    

