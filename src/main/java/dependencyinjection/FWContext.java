package dependencyinjection;

import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FWContext {
    private static List<Object> objectMap = new ArrayList<>();

    public FWContext() {
        try {
            Reflections reflections = new Reflections("dependencyinjection");
            Set<Class<?>> types = reflections.getTypesAnnotatedWith(Service.class);
            for (Class<?> impletationsClass : types) {
                objectMap.add((Object) impletationsClass.newInstance());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        performDI();
    }

    private void performDI() {
        try {
            for (Object theTestClass : objectMap) {
                for (Field field : theTestClass.getClass().getDeclaredFields()) {
                    Class<?> theFieldType = field.getType();
                    Object instance = getBeanOfType(theFieldType);

                    field.setAccessible(true);
                    field.set(theTestClass, instance);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBeanOfType(Class interfaceClass) {
        Object service = null;
        try {
            for (Object theTestClass : objectMap) {
                Class<?>[] interfaces = theTestClass.getClass().getInterfaces();

                for (Class<?> theInterface : interfaces) {
                    if (theInterface.getName().contentEquals(interfaceClass.getName())) service = theTestClass;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return service;
    }
}
