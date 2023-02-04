package problems.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.ExtendWith;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(
    status = API.Status.EXPERIMENTAL,
    since = "0.01"
)
@Inherited
@ExtendWith(WithQueryExtension.class)
public @interface WithQuery {

    String value() default "script.sql";

}
