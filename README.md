# Docker compose usage example
Stack:
* Java 11 - Spring Boot 2+
* NGINX image

## Running image

```shell script
git clone https://github.com/AppLoidx/docker-compose-example.git
cd docker-compose-example
docker-compose up
```

## Images

**NGINX**:
- Serve static files from `docker-compose-example-web`
- Proxy pass to `api` image through port `8080` (default port on Spring Boot application)

**Spring Boot**:
- Simple api that returns "Hello" object model with timestamp

## Listing

docker-compose.yml:
```yml
version: "3.8"

services:
  api:
    container_name: api
    build:
      context: docker-compose-example-api
      dockerfile: Dockerfile
    ports:
    - 3000:8080

  nginx:
    container_name: nginx-container
    image: nginx:latest
    ports:
    - 80:80
    - 443:443
    volumes:
      - ./nginx/conf.d:/etc/nginx/conf.d
      - ./docker-compose-example-web:/etc/nginx/html
    depends_on:
      - api
```

As you can see, we use nginx custom config and serve our example web static files

