# OAuth Service
This is practice project for Microservice
Build an OAuth Service server, this can be a common service used by multiple service

This service will generate JWT token

## Usage Guild
- Directly Run
gradle build
gradle bootRun
gradle bootRun --debug-jvm

- Run by Docker
https://spring.io/guides/gs/spring-boot-docker/#initial

gradle build docker
docker run -p 8901:8901 -t pangu/oauthservice

- Debug for Docker
docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n" 

- stop Docker service
docker ps
docker stop "container id"
docker rm "container id"

## OAuth Service
http://localhost:8901/auth/oauth/token

## Encoding
in code, all the password need encoding, default use "{bcrypt}" + encode, it include client_secret and user password
But when send HTTP request, input the raw password like "demo101"