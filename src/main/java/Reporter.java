import java.security.CodeSource;
import java.text.MessageFormat;

public class Reporter {

    public static void printInfo(String name, Class clazz) {
        CodeSource codeSource = clazz.getProtectionDomain().getCodeSource();
        String format = MessageFormat.format("{0} implementation: {1}, loaded from {2} ", name, clazz.getName(), codeSource == null ? "JAVA " : codeSource.getLocation());
        System.out.println(format);

    }
}
