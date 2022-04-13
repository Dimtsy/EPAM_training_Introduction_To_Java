package programmingWithClasses.simplestClassesAndObjects.customer;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[]{
                new Customer(1,"Петров","Василий","Михайлович",
                        "Ленина 46",123,17),
                new Customer(2,"Васильев","Василий","Михайлович",
                "Ленина 46",567,58),
                new Customer(3,"Николаев","Василий","Михайлович",
                        "Ленина 46",34,87),
                new Customer(4,"Смирнов","Василий","Михайлович",
                        "Ленина 46",78,56)
        };

        AggregateArrayCustomer aggregateArrayCustomer = new AggregateArrayCustomer(customers);
        System.out.println("список покупателей в алфавитном порядке");
        aggregateArrayCustomer.buyersAlphabetical();
        System.out.println(" список покупателей, у которых номер кредитной карточки находится в заданном интервале\n");
        aggregateArrayCustomer.cardNumberInterval(0,200);
    }
}
