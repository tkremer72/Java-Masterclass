public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(7487412);
        timsPhone.powerOn();
        timsPhone.callPhone(7487412);
        timsPhone.answer();

        timsPhone = new MobilePhone(7427418);
        //timsPhone.powerOn();
        timsPhone.callPhone(7427418);
    }
}
