# AREP- ARQUITECTURAS EMPRESARIAL -  Taller de de modularización con virtualización e Introducción a Docker y a AWS.

## AUTOR.

> Eduardo Ospina Mejia

## Taller Clientes y Servicios.

### Introduccion.

En este taller profundizamos los conceptos de modulación por medio de virtualización usando Docker y AWS.

#### Pre Requisitos

1) El estudiante conoce Java, Maven
2) El estudiante sabe desarrollar aplicaciones web en Java
3) Tiene instalado Docker es su máquina

#### Descripción

El taller consiste en crear una aplicación web pequeña usando el micro-framework de Spark java (http://sparkjava.com/). 
Una vez tengamos esta aplicación procederemos a construir un container para docker para la aplicación y los desplegaremos y 
configuraremos en nuestra máquina local. Luego, cerremos un repositorio en DockerHub y subiremos la imagen al repositorio. 
Finalmente, crearemos una máquina virtual de en AWS, instalaremos Docker , y desplegaremos el contenedor que acabamos de crear.

#### Entregables

1) El código del proyecto en un repositorio de GITHUB
2) Un README que explique un resumen del proyecto, l arquitectura, el diseño de clases y que muestre cómo generar las imágenes para desplegarlo. Además que muestre imágenes de cómo quedó desplegado cuando hicieron las pruebas.

### Primera parte crear la aplicación web

Cree un proyecto java usando maven..

Cree la clase principal.

Importe las dependencias de spark Java en el archivo pom.

Asegúrese que el proyecto esté compilando hacia la versión 8 de Java.

Asegúrese que el proyecto este copiando las dependencias en el directorio target al compilar el proyecto. Esto es necesario para poder construir una imagen de contenedor de docker usando los archivos ya compilados de java. 
Para hacer esto use el purgan de dependencias de Maven.

Asegúrese que el proyecto compila

![](https://i.postimg.cc/x1j2nRhs/crompobando-que-el-proyecto-compila-parte-1.png)

![](https://i.postimg.cc/dVWK1CKJ/crompobando-que-el-proyecto-compila-parte-2.png)

Asegúrese que las dependencias están en el directorio target y que continentemente las dependencia, es decir las librerías necesarias para correr en formato jar. En este caso solo son las dependencias necesarias para correr SparkJava.

![](https://i.postimg.cc/WbBkydyb/Dependencias-directorio-target.png)

Ejecute el programa invocando la máquina virtual de Java desde la línea de comandos y acceda la url http:localhost:4567/hello:

![](https://i.postimg.cc/GtJmSpT9/Crompobar-ejecucion.png)


### Segunda Parte: crear imagen para docker y subirla

En la raíz de su proyecto cree un archivo denominado Dockerfile con el siguiente contenido:

![](https://i.postimg.cc/XJkRRBxM/creaciondockerfile.png)

Usando la herramienta de línea de comandos de Docker construya la imagen:

![](https://i.postimg.cc/vTmNCqc9/unasdo-Dockerconstruir-imagen.png)

Revise que la imagen fue construida

![](https://i.postimg.cc/J4YSbLGL/pantalladockercreacionimagen.png)

A partir de la imagen creada cree tres instancias de un contenedor docker independiente de la consola (opción “-d”) y 
con el puerto 6000 enlazado a un puerto físico de su máquina (opción -p):

![](https://i.postimg.cc/PJJPNw6Z/poner-a-correr-imagen-creada-en-docker.png)

Asegúrese que el contenedor está corriendo

![](https://i.postimg.cc/1XTF0H2s/Pantalla-en-docker-de-despliegue-maquina-spark.png)

Acceda por el browser a http://localhost:34002/hello, o a http://localhost:34000/hello, o a http://localhost:34001/hello para verificar que están corriendo.

![](https://i.postimg.cc/g0P9JbMH/Probando-despliegue-docker.png)

Use docker-compose para generar automáticamente una configuración docker, por ejemplo un container y una instancia a de mongo en otro container. Cree en la raíz 
de su directorio el archivo docker-compose.yml con le siguiente contenido:

![](https://i.postimg.cc/sgnQCy31/comprobacion-de-aplicaciones-corriendo-composition-docker.png)

Ejecute el docker compose:
docker-compose up -d

![](https://i.postimg.cc/sxHVMfxN/docker-compose-ejecusion.png)

Verifique que se crearon los servicios:

![](https://i.postimg.cc/tTZ37JBs/imagenescomposiciondocker.png)

![](https://i.postimg.cc/4yr7M1GP/despliegue-en-docker-composicion.png)


### Tercera para subir la imagen a Docker Hub

Cree una cuenta en Dockerhub y verifique su correo.


Acceda al menu de repositorios y cree un repositorio

![](https://i.postimg.cc/nzP72bh9/creacion-repositorio-dockerhub.png)

En su motor de docker local cree una referencia a su imagen con el nombre del repositorio a donde desea subirla

![](https://i.postimg.cc/3RvS2BKh/referencia-dockerhub.png)

Verifique que la nueva referencia de imagen existe

![](https://i.postimg.cc/rmjJ1Yvv/imagen-creada-a-referencia-repositorio.png)

Autentíquese en su cuenta de dockerhub (ingrese su usuario y clave si es requerida):
docker login

Empuje la imagen al repositorio en DockerHub

![](https://i.postimg.cc/ZRrTVXZK/subir-a-repositorio-dockerhub.png)

![](https://i.postimg.cc/Gp92bMRb/resultado-docker-hub.png)

![](https://i.postimg.cc/4xVPB1qN/tags-dockerhub.png)

### Cuarta parte: AWS

Acceda a la máquina virtual

![](https://i.postimg.cc/pXcWdfLC/Maquina-ec2-aws.png)

![](https://i.postimg.cc/DwW24SWT/instancias-aws.png)

![](https://i.postimg.cc/NjWQ6QTr/lanzar-nueva-instancia.png)

![](https://i.postimg.cc/rFHTTqfY/amazon-linuz-intance-setup.png)

![](https://i.postimg.cc/4xhgNjM4/setup-2-intancia-linux.png)

![](https://i.postimg.cc/25Rfq2RQ/Capturellaves-instancia.png) 

![](https://i.postimg.cc/rp125xMv/llaves-creacion.png)

![](https://i.postimg.cc/bJqcgrvd/finalizacion-instancia.png)

![](https://i.postimg.cc/vBXRNy1h/conectar-instancia.png)

![](https://i.postimg.cc/yNzw6xcn/conectarme-a-la-maquina.png)

![](https://i.postimg.cc/LsBGJSVS/estado-inicial-mauina.png)

Instale Docker

sudo yum update -y && sudo yum install docker

![](https://i.postimg.cc/ZRs7N5BG/intalacion-numero-1-intancia.png)

![](https://i.postimg.cc/7hpKBtNX/instalacion-2-intancia.png)

Inicie el servicio de docker

sudo service docker start

![](https://i.postimg.cc/KvB66tg4/inicializacion-docker-instancia.png)

Configure su usuario en el grupo de docker para no tener que ingresar “sudo” cada vez que invoca un comando

![](https://i.postimg.cc/pTm7qjHW/modificacion-usuario-docker-intancia.png)

Desconectes de la máquina virtual e ingrese nuevamente para que la configuración de grupos de usuarios tenga efecto.

![](https://i.postimg.cc/4NgLhqmN/desconectarse-y-volverse-a-entrar-para-que-funcione.png)

![](https://i.postimg.cc/SR7GrQJQ/version-java.png)

A partir de la imagen creada en Dockerhub cree una instancia de un contenedor docker independiente de la consola (opción “-d”) y con el puerto 6000 enlazado a un puerto físico de su máquina (opción -p):

docker run -d -p 42000:6000 --name firstdockerimageaws dnielben/firstsprkwebapprepo

![](https://i.postimg.cc/W4F6ywhH/pull-dockerhub-repository.png)

![](https://i.postimg.cc/q7PXH6KM/imagen-y-ps-en-aws.png)

![](https://i.postimg.cc/Qtcg8Ngg/logs-docker-aws.png)

Abra los puertos de entrada del security group de la máxima virtual para acceder al servicio

![](https://i.postimg.cc/5NsBNRzr/reglas-de-netrada.png)

![](https://i.postimg.cc/ZRP3k7ZV/puerto-abierto-aws-docker.png)

Verifique que pueda acceder  en una url similar a esta (la url específica depende de los valores de su maquina virtual EC2)

![](https://i.postimg.cc/pTB9cmYS/corriendo-de-forma-en-servidor-aws.png)


## Tarea:

Para la tarea usted debe construir una aplicación con la arquitectura propuesta y desplegarla en AWS usando EC2 y Docker.

![](https://i.postimg.cc/3JkRmS6V/tarea.png)

1) El servicio MongoDB es una instancia de MongoDB corriendo en un container de docker en una máquina virtual de EC2
2) LogService es un servicio REST que recibe una cadena, la almacena en la base de datos y responde en un objeto JSON con las 10 ultimas cadenas almacenadas en la base de datos y la fecha en que fueron almacenadas.
3) La aplicación web APP-LB-RoundRobin está compuesta por un cliente web y al menos un servicio REST. El cliente web tiene un campo y un botón y cada vez que el usuario envía un mensaje, este se lo envía al servicio REST y actualiza la pantalla con la información que este le regresa en formato JSON. El servicio REST recibe la cadena e implementa un algoritmo de balanceo de cargas de Round Robin, delegando el procesamiento del mensaje y el retorno de la respuesta a cada una de las tres instancias del servicio LogService.


### Desarrollo de los puntos de Tarea se encuentran dentro de la carpeta de tareaImpl.


### Licencia.

Licencia, especificamente dentro del texto licencia.
