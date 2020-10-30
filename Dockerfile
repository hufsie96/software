FROM gradle:5.6.2-jdk8-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle build --no-daemon

# Dockerfile

# https://docs.docker.com/engine/reference/builder/#from
# java 8 사용
FROM java:8

# https://docs.docker.com/engine/reference/builder/#expose
# 애플리케이션 포트
EXPOSE 8080

# https://docs.docker.com/engine/reference/builder/#add
# 애플리케이션 파일 추가
RUN mkdir -p /engn/app/
ADD ./build/libs/springboot-study-0.0.1-SNAPSHOT.jar /engn/app/application.jar

# https://docs.docker.com/engine/reference/builder/#entrypoint
# https://docs.docker.com/engine/reference/builder/#cmd
# https://docs.docker.com/engine/reference/builder/#run
# 실행 아래의 차이점이 뭘까요?
ENTRYPOINT ["java", "-jar", "-Xmx700m", "/engn/app/application.jar"]
#CMD ["java", "-jar", "-Xmx700m", "/engn/app/application.jar"]
#RUN ["java", "-jar", "-Xmx700m", "/engn/app/application.jar"]
