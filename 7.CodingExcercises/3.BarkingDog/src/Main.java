public class Main {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 1));//should return true
        System.out.println(BarkingDog.shouldWakeUp(false, 2));//should return false
        System.out.println(BarkingDog.shouldWakeUp(true, 8));//should return false
        System.out.println(BarkingDog.shouldWakeUp(true, -1));//should return false
        System.out.println(BarkingDog.shouldWakeUp(false, 10));//should return false
        System.out.println(BarkingDog.shouldWakeUp(true, 7));//should return true
        System.out.println(BarkingDog.shouldWakeUp(true, 23));//should return true


    }
}
