# TAREA

Para la tarea usted debe construir una aplicación con la arquitectura propuesta y desplegarla en AWS usando EC2 y Docker.


1) El servicio MongoDB es una instancia de MongoDB corriendo en un container de docker en una máquina virtual de EC2

![](https://i.postimg.cc/T1sDV47f/creacion-base-de-datos-mongodb-docker.png)

![](https://i.postimg.cc/zX9h34Hk/mongodb-docker-1.png)

![](https://i.postimg.cc/W4VJwrnF/mongodb-docker-2.png)

![](https://i.postimg.cc/1zKVCtCW/Capturemongodb-compass-connect.png)

2) LogService es un servicio REST que recibe una cadena, la almacena en la base de datos y responde en un objeto JSON con las 10 ultimas cadenas 
almacenadas en la base de datos y la fecha en que fueron almacenadas.

![](https://i.postimg.cc/4dN7rgjX/prueba-adicion-a-base-de-datos-de-manera-local.png)

![](https://i.postimg.cc/LXCYSWML/prueba-adicion-a-base-de-datos-de-manera-local-dbskin.png)

![](https://i.postimg.cc/NFKyjxgV/prueba-adicion-a-base-de-datos-de-manera-local-2.png)

![](https://i.postimg.cc/Pf7pF0yk/prueba-adicion-a-base-de-datos-de-manera-local-dbskin2.png)


3) La aplicación web APP-LB-RoundRobin está compuesta por un cliente web y al menos un servicio REST. El cliente web tiene un campo y un botón y cada 
vez que el usuario envía un mensaje, este se lo envía al servicio REST y actualiza la pantalla con la información que este le regresa en formato JSON. 
El servicio REST recibe la cadena e implementa un algoritmo de balanceo de cargas de Round Robin, delegando el procesamiento del mensaje y el retorno 
de la respuesta a cada una de las tres instancias del servicio LogService.

#### Dockers:

![](https://i.postimg.cc/L6ZYdvQg/crear-imagen-logservice.png)

![](https://i.postimg.cc/0yR69mhW/crear-imagen-roundrobin.png)

![](https://i.postimg.cc/htLXvvBS/imagenes-creadas.png)

![](https://i.postimg.cc/q7pz3rJ2/imagenes-consola-docker.png)

![](https://i.postimg.cc/VN459hvp/poner-a-correr-las-tres-instancias-en-docker-de-logservice.png)

![](https://i.postimg.cc/x8NC2T5V/docker-corriendo-imagenes.png)

![](https://i.postimg.cc/h4XbjL3c/corriendo-en-docker.png)

![](https://i.postimg.cc/XvvBPWR4/prueba-adicion-a-base-de-datos-de-manera-docker-1.png)

![](https://i.postimg.cc/yNr345K9/base-de-datos-adicion-docker.png)

![](https://i.postimg.cc/cHggsm1z/prueba-adicion-a-base-de-datos-de-manera-docker-2.png)

![](https://i.postimg.cc/tCHZjWKr/base-de-datos-adicion-docker-2.png)

![](https://i.postimg.cc/DydWymF7/base-de-datos-adicion-docker-3.png)

#### Repositorio Dockerhub:

![](https://i.postimg.cc/mggrLw8S/subiendo-al-repositorio.png)


#### EC2 aws:

![](https://i.postimg.cc/fRqRJ9PQ/crear-instancia-ec2-aws.png)

![](https://i.postimg.cc/7LCY7LvG/imagen-creacion-aws.png)

![](https://i.postimg.cc/s2tfJRyn/aws-parte1.png)

![](https://i.postimg.cc/kGCnkF2K/awsparte2.png)

![](https://i.postimg.cc/nr1HZjm5/aws-parte-3.png)

![](https://i.postimg.cc/h484VwYr/awsparte4.png)

![](https://i.postimg.cc/MKW65528/intancia-corriendo-parte-1.png)

![](https://i.postimg.cc/8zc1QCzK/conectarce-intancia.png)


#### Configuracion EC2:

![](https://i.postimg.cc/vm6bTS95/Captureconeccion-aws.png)

![](https://i.postimg.cc/XJS3Cccm/instalacion-java-1.png)

![](https://i.postimg.cc/pVBxmj9c/instalacion-java-2.png)

![](https://i.postimg.cc/sgMRH0Tb/instalacion-docker-parte-1.png)

![](https://i.postimg.cc/8zxg2B3c/instalacion-docker-parte-2.png)

#### Abrir puertos: 

![](https://i.postimg.cc/J4nwt2Ct/abriendo-todo-slos-puertos.png)

![](https://i.postimg.cc/MpCgPZMj/finalizacion-reglas.png)

#### AWS:

![](https://i.postimg.cc/sXyqznJj/coneccion-publica-aws.png)

![](https://i.postimg.cc/k50jbHQm/awsprueba-de-funcionamiento-1.png)

![](https://i.postimg.cc/FsrT33L7/awspruba-2.png)

![](https://i.postimg.cc/8z342Yn6/ultima-prueba-aws.png)



### Entregables:

1) El código del proyecto en un repositorio de GITHUB
2) Un README que explique un resumen del proyecto, l arquitectura, el diseño de clases y que muestre cómo generar las imágenes para desplegarlo. 
Además que muestre imágenes de cómo quedó desplegado cuando hicieron las pruebas.


   



