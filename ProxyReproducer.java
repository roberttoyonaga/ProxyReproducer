import java.lang.reflect.Proxy;
import java.util.function.Consumer;

public class ProxyReproducer {
    public static void main(String args[]) {

        FunctionalInterface instance = Consumer.class.getDeclaredAnnotation(FunctionalInterface.class);
        Class<?> clazz = instance.getClass();

        boolean isProxyClass = Proxy.isProxyClass(clazz);
        System.out.println("is proxy: " +isProxyClass);
        System.out.println("Simple clazz.getName(): " + clazz.getName());
        System.out.println("Simple clazz.getPackageName(): " + clazz.getPackageName());
        System.out.println("Simple clazz.getPackage(): " + clazz.getPackage());
        System.out.println("Simple module: " + clazz.getModule());
        System.out.println("Simple CL: " + clazz.getClassLoader());
    }

}
