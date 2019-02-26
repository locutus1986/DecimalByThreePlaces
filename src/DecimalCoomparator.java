public class DecimalCoomparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){

        boolean result = false;

        if((int)(x* 1000) == (int)(y*1000)){
            result = true;
        }
        return result;
    }
}
