package annotationTest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JDK5.0中提供了注解的功能，允许开发者定义和使用自己的注解类型。该功能由一个定义注解类型的语法和描述一个注解声明的语法，读取注解的API，
 * 一个使用注解修饰的class文件和一个注解处理工具组成。
 * 
 * Annotation并不直接影响代码的语义，但是他可以被看做是程序的工具或者类库。它会反过来对正在运行的程序语义有所影响。
 * 
 * Annotation可以冲源文件、class文件或者在运行时通过反射机制多种方式被读取。
 */

/**
 * 
 */
@Target({ElementType.FIELD})
/**
 * 
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowire {

	String value() default "";
}
