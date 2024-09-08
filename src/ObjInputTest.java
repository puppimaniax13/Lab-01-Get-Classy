public class ObjInputTest {
    public static void main(String[] args) {
        String testString = new SafeInputObj().getNonZeroLenString("Enter String");
        int testInt = new SafeInputObj().getRangedInt("Input in range 2 - 5", 2, 5);
        int testInt2 = new SafeInputObj().getInt("Enter int");
        double testDouble = new SafeInputObj().getRangedDouble("Input in range 2 - 5", 2, 5);
        double testDouble2 = new SafeInputObj().getDouble("Enter double");
        boolean testBoolean = new SafeInputObj().getYNConfirm("Do u want to continue?");
        String testString2 = new SafeInputObj().getRegExString("Input regex 111", "111");

    }
}
