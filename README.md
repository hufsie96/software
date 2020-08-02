# [Springboot]

###Springboot study를 위한 demo source 입니다. 

1. 첫번째 Case는 Thymeleaf template을 사용한 MVC 예제 입니다. 

2. 두번째 Case는 Rest API 예제 입니다. 


--------------------

# [Docker]

###Docker로 Springboot conatiner를 띄우기 위한 dockerfile를 작성 예제를 포함하고 있습니다. 

다음은 기본적인 docker 명령어 이다. 

```
$ docker -v # 버전 확인

$ docker images

$ docker create [옵션] [이미지 이름]:[태그]

$ docker pull [이미지 이름]:[태그]

$ docker ps [옵션]

$ docker run [옵션] [이미지 이름]:[태그] 

$ docker stop [컨테이너 이름]

$ docker container restart [컨테이너 이름] 

$ docker rm [컨테이너 이름]

$ docker rmi [이미지 이름]
```

Springboot를 build 후 dockerfile을 통해서 docker image 생성하여 해당 이미지로 docker container를 실행해보도록 한다. 
```
$ docker build -t spring-app:0.1 .
$ docker run -d -p 18080:8080 spring-app:0.1 
```

chrome 브라우저로 아래의 url을 수행한다. 
```
http://localhost:18080/userRest
```
