package testingfw;

import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FWContext {
    private static List<Object> objectMap = new ArrayList<>();

    public FWContext() {

        try {
            Reflections reflections = new Reflections("testingfw");
            Set<Class<?>> types = reflections.getTypesAnnotatedWith(TestClass.class);
            for (Class<?> implementationClass : types) {
                objectMap.add((Object) implementationClass.newInstance());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try{
            for(Object theTestClass: objectMap){
                for (Method method: theTestClass.getClass().getDeclaredMethods()){
                    if(method.isAnnotationPresent(Test.class)){
                        method.invoke(theTestClass);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
