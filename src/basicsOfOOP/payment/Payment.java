package basicsOfOOP.payment;

import java.util.HashMap;
import java.util.Map;

public class Payment {

    private Map<Product,Integer> productMap = new HashMap<>();

    public void addProductMap(Product product, Integer number) {
        productMap.put(product,number);
    }

    public void numberPriceProduct() {
         double summa=0;
        for(Map.Entry<Product, Integer> item : productMap.entrySet()){

            System.out.printf("Продукт: %s  \nЦена за шт.: %s  \nКоличество: %s \n", item.getKey().getName(), item.getKey().getPrice(), item.getValue());
            summa +=item.getKey().getPrice()*item.getValue();
        }
        System.out.println("Итого: "+summa);


    }


    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    class Product{
        private String name;
        private int price;
        private int weight;

        public Product(String name, int price, int weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}
