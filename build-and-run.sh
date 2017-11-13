mvn clean compile assembly:single
java -javaagent:target/java-object-size.jar -XX:+UseCompressedOops -jar target/java-object-size.jar
