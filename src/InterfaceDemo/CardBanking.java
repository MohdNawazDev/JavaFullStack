package InterfaceDemo;

public class CardBanking implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment using Card Banking");
    }
}
