# Hilos_Echo: Primer laboratorio
   Directorios:
    
    - src
        - hilosjava
            - ColaString.java
            - Consumidor.java
            - Main.java
            - Productor.java
    - bin 
    
   Compilamos: 
```[Javascript]
/Hilos_Echo$ javac -d bin src/*/*.java" 
```
   Ejecutamos:
```[Javascript]
/Hilos_Echo$ java -cp bin hilosjava.<Elegir uno>
```
# Segundo Laboratorio:

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
