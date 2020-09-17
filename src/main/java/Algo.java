public class Algo {

    public static void main(String[] args) {

        String binary = "1001";


        int result = convertBinToInt(binary);
        System.out.println(result);


        String octa="17";
        int result2 =convertOctToInt(octa);
        System.out.println(result2);

    }

    private static int convertBinToInt(String octa) {

        int result=0;
        int conclusion=1;
        for (int i = 0; i < octa.length(); i++) {
            if(octa.charAt(octa.length()-1-i) =='1' ){

                result +=conclusion;
            }
            conclusion*=2;
        }


        return result;
    }

    private static int convertOctToInt(String binary) {
        int conclusion = 1;
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {

            char c = binary.charAt(binary.length() - 1 - i);
            int number=Integer.parseInt(String.valueOf(c));
            result += number * conclusion;


            conclusion *= 8;
        }
        return result;
    }







}
