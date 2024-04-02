# Traer la imagen de java que se quiere utilizar

FROM openjdk:23-slim-bullseye

# en el directorio main

# /main
# cd main
WORKDIR /Main

# Copia los archivos necesarios en la ruta que se especifica
COPY Main.java ./

# corre el comando para ejecutar el codigo y el archivo en cuestión
RUN javac Main.java

# Especificar el volumen donde se usará
VOLUME /onlyJava

# Comandos que se ejecutan en la imagen
CMD ["java", "Main"]

