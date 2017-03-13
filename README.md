# Hilos_Echo
    - src
        - hilosjava
            - ColaString.java
            - Consumidor.java
            - Main.java
            - Productor.java
    
# 2LabP

 Implementamos un cliente servidor con envío de primitivas. Se nos pide la inserción de una nueva primitiva que en vez de sacar el primer elemento de la cola, nos diga cual es, en caso de haber.
 
    - src
        - client
            - Cliente.java
        - common
            - MensajeProtocolo.java
            - Primitive.java
        - server
            - ColaStrings.java
            - Servidor.java
            - SirvienteRunnable.java

## Herramientas:

Para compilar:  En Hilos_Echo, "javac -d bin src/*/*.java"

Para ejecutar:  En Hilos_Echo, "java -cp bin hilosjava.__"
