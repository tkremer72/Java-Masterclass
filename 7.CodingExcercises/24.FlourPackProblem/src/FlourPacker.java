public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {//Main validation
            return false;
        } else {
            if(bigCount * 5 + smallCount < goal) {//Supply greater than demand
                return false;
            }
            return (goal % 5 <= smallCount);//remainder of goal must be less than smallCount
        }
    }
}
