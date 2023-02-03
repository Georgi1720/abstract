package task.config;

import java.io.IOException;
import java.util.logging.*;


public class LoggerConfig {
    public static void config() throws IOException {
        FileHandler fileHandler = new FileHandler("src/task/log.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        Logger logger = Logger.getLogger("");
        logger.addHandler(fileHandler);
        logger.setLevel(Level.ALL);
    }
}
