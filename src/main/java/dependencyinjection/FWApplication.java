package dependencyinjection;

import java.lang.reflect.Field;

public class FWApplication {

    public static void run(Class applicationClass){
        FWContext fwContext = new FWContext();

        try{
            Object applicationObject = (Object) applicationClass.newInstance();

            for(Field field: applicationObject.getClass().getDeclaredFields()){
                if(field.isAnnotationPresent(Inject.class)){
                    Class<?> theFieldType = field.getType();

                    Object instance = fwContext.getBeanOfType(theFieldType);

                    field.setAccessible(true);
                    field.set(applicationObject, instance);
                }
            }

            if(applicationObject instanceof Runnable) ((Runnable)applicationObject).run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
