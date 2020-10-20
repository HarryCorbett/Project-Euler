public class ChampernownesConstant {

    public static void main(String[] args) {

        // ignoring 0 so charAt(1) is the first digit of the decimal
        StringBuilder num = new StringBuilder(".");
        for(int i = 1; i<185186 ; i++){
            num.append(i);
        }
        int result = Character.getNumericValue(num.charAt(1)) * Character.getNumericValue(num.charAt(10))
                * Character.getNumericValue(num.charAt(100)) * Character.getNumericValue(num.charAt(1000))
                * Character.getNumericValue(num.charAt(10000)) * Character.getNumericValue(num.charAt(100000))
                * Character.getNumericValue(num.charAt(1000000));
        System.out.println(result);
    }
}
