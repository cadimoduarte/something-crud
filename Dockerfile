FROM openjdk:8-jre-alpine

ENV APP_TARGET target
ENV APP something-crud.jar

RUN mkdir -p /opt
COPY ${APP_TARGET}/${APP} /opt

ENTRYPOINT java -Dspring.profiles.active=${SPRING_PROFILES:-ddev} ${JAVA_OPTS} -Xms${JAVA_XMS:-2048m} -Xmx${JAVA_XMX:-2048m} -jar /opt/${APP}