FROM alpine:latest

RUN apk add openjdk21
COPY ./build/libs/CatsApi.jar ./CatsApi.jar
EXPOSE 8001

ENTRYPOINT ["java", "-jar", "CatsApi.jar"]