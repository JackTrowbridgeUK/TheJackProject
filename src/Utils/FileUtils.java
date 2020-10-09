package Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUtils {

    public static String getCurrentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}
