package Day2Example1;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Day2Example1 {

        public static void main(String[] args){

            double money = 3.141592;

            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String formattedMoney = nf.format(money);
            System.out.print(formattedMoney);

            String number = "1234.56789";
            Double d = Double.parseDouble(number);
            System.out.println(d+1);

            System.out.println((int)Math.floor(Math.random() * 6));

            Calendar cal1 = Calendar.getInstance();
            GregorianCalendar cal2 = new GregorianCalendar();

            System.out.println(cal1.get(Calendar.DAY_OF_MONTH));

            DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CANADA);
            System.out.println(df.format(cal2.getTime()));

            //int speeds[] =new int[5];
            int speeds[] = {80, 90, 100, 110};
            for (int s : speeds)
            {
                System.out.println(s + "km/h");
            }

        }

}
