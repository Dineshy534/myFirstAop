package MySpringAOP.com.din.test;

import java.lang.reflect.Parameter;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.din.test.source.EnableAuditLogging;
import com.din.test.source.ShapeService;
import com.din.test.source.model.Circle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        
        ShapeService serv = ctx.getBean("shapeService", ShapeService.class);
        Class<ShapeService> shapeService = ShapeService.class;
        Stream.of(shapeService.getDeclaredMethods()).forEach(method ->
        {
        	System.out.println(method.isAnnotationPresent(EnableAuditLogging.class));
        	 Parameter[] j = method.getParameters();
        	 if(j.length >0 && j[0].isAnnotationPresent(EnableAuditLogging.class))
        	 {
        		 System.out.println("fields "+j[0]);
        	 }
        });
        serv.getCircle().setNameReturn("Dinesh");
        Circle c = new Circle();
        c.setName("Dinesh");
        c.setSize("32");
        serv.setCircle(c);
        System.err.println(serv.getCircle().getName());
        System.err.println(serv.getTriangle().getName());
        
    }
}
