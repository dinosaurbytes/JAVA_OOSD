import java.math.BigInteger;

public class PrintTable {
    public static void main(String[] args){
        int x = 1;
        int counter = 0;
        do{
            if (counter < 3){
                System.out.print(x + " ");
                x++;
                counter++;
            }
            else{
                System.out.println();
                counter = 0;
            }
        } while (x<10);

        System.out.println();
        System.out.println();
        x = 9;
        counter = 0;
        while (x>0){
            if (counter < 3){
                System.out.print(x + " ");
                x--;
                counter++;
            }
            else{
                System.out.println();
                counter = 0;
            }
        }

        System.out.println();
        System.out.println();

        BigInteger y = new BigInteger("1");
        BigInteger z = new BigInteger ("2");
        int count = 1;
        int contract = 1;
        while (contract<=64){
            if (count%5 != 0){
                System.out.print(y + " ");
                y=y.multiply(z);
                count++;
                contract++;
            }
            else{
                System.out.println();
                count = 1;
            }
        }


    }

}
