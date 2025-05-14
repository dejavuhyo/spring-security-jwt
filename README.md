# Spring Security JWT Authentication

## 1. 설명
Spring Security와 JWT 인증 예제이다. 포트는 8080을 사용한다.

## 2. 개발환경

* OpenJDK 17

* spring-boot 3.4.5

* spring-web 3.4.5

* spring-security 3.4.5

* spring-jpa

* lombok 1.18.38

* h2database 2.3.232

* jjwt-api 0.12.6

* jjwt-impl 0.12.6

* jjwt-jackson 0.12.6

* mapstruct 1.6.3

* mapstruct-processor 1.6.3

## 3. 실행

### 1) 사용자 등록

* POST: http://localhost:8080/api/auth/signup

```json
{
	"username": "test001",
	"password": "test001"
} 
```

### 2) 토큰 생성

* POST: http://localhost:8080/api/auth/signin

```json
{
	"username": "test001",
	"password": "test001"
} 
```

### 3) 비인증

* http://localhost:8080/api/test/all

### 4) 인증

* http://localhost:8080/api/test/user

## 출처 및 참고
* [https://medium.com/@victoronu/implementing-jwt-authentication-in-a-simple-spring-boot-application-with-java-b3135dbdb17b](https://medium.com/@victoronu/implementing-jwt-authentication-in-a-simple-spring-boot-application-with-java-b3135dbdb17b)
* [https://heyazoo1007.tistory.com/811](https://heyazoo1007.tistory.com/811)
