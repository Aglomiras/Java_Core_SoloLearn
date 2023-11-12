package org.mpei.WorkSololearn_8.Practic_2;

public class main {
    /**
     * Анонимные классы
     * Вы – директор магазина.
     * Вы предлагаете скидку на все товары, которые продаются в магазине. Сегодня у вас было в общей сложности 2 покупателя.
     * Первому вы предоставили скидку 10% на все приобретенные товары. Второй покупатель купил больше товаров,
     * и вы хотите дать ему скидку в 20% в знак благодарности.
     * <p>
     * Завершите программу, создав 2 объекта Purchase: 1 для обычного и 1 для особого клиента и переопределите метод totalAmount()
     * для особого клиента, чтобы он получил скидку в 20%.
     * <p>
     * Вызовы методов уже даны.
     */
    public static void main(String[] args) {
        Purchase customer = new Purchase();
        Purchase specialCustomer = new Purchase() {
            //введите код сюда
            public int totalAmount(int price) {
                return price - (price * 20) / 100;
            }
        };

        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
    }
}
