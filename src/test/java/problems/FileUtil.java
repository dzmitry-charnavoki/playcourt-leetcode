package problems;

import java.nio.file.Files;
import java.nio.file.Path;
import lombok.SneakyThrows;

public class FileUtil {


    @SneakyThrows
    public static String script(String scope, String fileName) {
        Path wd = Path.of("", scope);
        Path file = wd.resolve(fileName);
        return Files.readString(file);
    }
}
