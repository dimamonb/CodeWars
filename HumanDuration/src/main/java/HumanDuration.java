import java.util.ArrayList;
import java.util.List;

public class HumanDuration {
    //1 minute = 60 seconds
    //1 hour = 60 x 60 = 3600
    //1 day = 3600 x 24 = 86400
    //1 year = 86400 x 365 = 31536000

    public static String pluralize(int digit) {
        return digit == 1 ? "" : "s";
    }

    public static String formatDuration(int seconds) {
        final int ONE_YEAR = 31536000;
        final String[] units = new String[]{"year", "day", ""};
        StringBuilder result = new StringBuilder();
        List<String> partsOfDate = new ArrayList<>();

        if (seconds == 0) {
            result.append("now");
            return result.toString();
        }

        int y = (int) Math.floor(seconds / ONE_YEAR);
        if (y > 0) partsOfDate.add("" + y + " year" + pluralize(y));

        int d = (int) Math.floor((seconds % ONE_YEAR) / 86400);
        if (d > 0) partsOfDate.add("" + d + " day" + pluralize(d));

        int h = (int) Math.floor(((seconds % ONE_YEAR) % 86400) / 3600);
        if (h > 0) partsOfDate.add("" + h + " hour" + pluralize(h));

        int m = (int) Math.floor((((seconds % ONE_YEAR) % 86400) % 3600) / 60);
        if (m > 0) partsOfDate.add("" + m + " minute" + pluralize(m));

        int s = seconds % 60;
        if (s > 0) partsOfDate.add("" + s + " second" + pluralize(s));

//        int years   = (int)Math.floor(seconds / (60 * 60 * 24 * 365));
//        int days    = (int)Math.floor(seconds / (60 * 60 * 24      )) % 365;
//        int hours   = (int)Math.floor(seconds / (60 * 60           )) % 24;
//        int minutes = (int)Math.floor(seconds /  60                 ) % 60;
//        int ss =            seconds %  60;

        for (int i = 0; i < partsOfDate.size(); i++) {
            if (partsOfDate.size() == 1){
                result.append(partsOfDate.get(i));
                break;
            }

            if(i == partsOfDate.size()-1) {
                result.deleteCharAt(result.length()-2);
                result.append("and " + partsOfDate.get(i));
            } else {
                result.append(partsOfDate.get(i)+ ", ");
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        //15731080 182 days, 1 hour, 44 minutes and 40 seconds  65731080
        System.out.println(formatDuration(62));
    }
}
