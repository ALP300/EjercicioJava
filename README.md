# PASOS PARA REALIZAR EL ARCHIVO .JAR
# 1ER PASO
javac Ejercicio.java

# 2DO PASO
jar cfm Ejercicio.jar MANIFEST.MF Ejercicio.class

# 3ER PASO
java -jar Ejercicio.jar