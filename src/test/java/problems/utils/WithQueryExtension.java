package problems.utils;

import java.io.File;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import problems.FileUtil;

@Slf4j
public class WithQueryExtension implements ParameterResolver {
    private static final String MAIN =
        "src" + File.separator + "main" + File.separator + "java" + File.separator;

    public boolean supportsParameter(ParameterContext parameterContext,
                                     ExtensionContext extensionContext)
        throws ParameterResolutionException {
        return parameterContext.isAnnotated(WithQuery.class);
    }

    public Object resolveParameter(ParameterContext parameterContext,
                                   ExtensionContext extensionContext)
        throws ParameterResolutionException {
        WithQuery config = parameterContext.getParameter().getAnnotation(WithQuery.class);
        String packageName = parameterContext.getTarget().get().getClass().getPackageName();
        packageName = packageName.replace(".", File.separator);
        String path = MAIN + packageName + File.separator;
        return FileUtil.script(path, config.value());
    }

}
