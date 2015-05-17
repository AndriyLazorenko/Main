package ArtCode.Lessons.lesson8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.CLASS.RUNTIME)
@Target(ElementType.FIELD)
/**
 * Created by Master on 16-May-15.
 */
public @interface Save {
}
