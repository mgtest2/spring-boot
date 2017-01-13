sudo docker build -t springboot .

sudo docker run -p 8080:8080 -it --rm --name my-springboot springboot



test@test-VirtualBox:~$ sudo docker ps
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                    NAMES
4cea40e98a33        springboot          "java -jar /app/sprin"   4 minutes ago       Up 4 minutes        0.0.0.0:8080->8080/tcp   my-springboot
test@test-VirtualBox:~$ 


