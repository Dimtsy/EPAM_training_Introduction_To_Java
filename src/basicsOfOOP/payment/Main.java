package basicsOfOOP.payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Product product = payment.new Product("Bananas",5,7);
        Payment.Product coffee = payment.new Product("coffee",9,8);
        payment.addProductMap(product,4);
        payment.addProductMap(coffee,2);
        payment.numberPriceProduct();
    }
}
