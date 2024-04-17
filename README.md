# ProxyReproducer
```shell 
javac ProxyReproducer.java
native-image ProxyReproducer
./proxyreproducer
java ProxyReproducer
```
You should then see that the Native Image executable returns a package while regular Java does not. 

```shell 
bash-4.4$ ./proxyreproducer
is proxy: true
clazz.getName(): jdk.proxy1.$Proxy65
clazz.getPackageName(): jdk.proxy1
clazz.getPackage(): package jdk.proxy1
clazz.getModule(): module jdk.proxy1
clazz.getClassLoader(): null
bash-4.4$ $JAVA_HOME/bin/java ProxyReproducer
is proxy: true
clazz.getName(): jdk.proxy1.$Proxy1
clazz.getPackageName(): jdk.proxy1
clazz.getPackage(): null
clazz.getModule(): module jdk.proxy1
clazz.getClassLoader(): null
```

