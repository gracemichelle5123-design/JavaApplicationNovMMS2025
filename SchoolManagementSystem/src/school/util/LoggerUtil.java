package school.util;
import java.util.logging.Level;
import java.time.LocalDateTime;

public class LoggerUtil {
    public static void log(Level level, String msg){
        System.out.println("[" + LocalDateTime.now() + "] [" + level + "] " + msg);
    }
}