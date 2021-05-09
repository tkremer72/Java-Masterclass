public class Gearbox {

    private boolean clutchIsIn;

//    public void operateClutch(String inOrOut) {
//        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
//    }
    //better way to do the above.
    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
