# Spring Boot com Netflix Zuul

Código implementando um pequeno exemplo de [servidor proxy](https://pt.wikipedia.org/wiki/Proxy) utilizando [Spring Boot](https://spring.io/projects/spring-boot) e [Zuul](https://github.com/Netflix/zuul).

#### Explicação:

Inicialmente, foi criado o projeto através do [Spring Initializr](https://start.spring.io/) a dependência do Zuul. Criado o projeto, a classe `ApiGatewayApplication` foi anotada com `@EnableZuulProxy`  para habilitar o ZuulProxy.

O Zuul permite criar 4 tipos de filtros (pre, post, router e error) que pode ser visto a configuração nos exemplos existentes no pacote `com.github.italocomini.tuto.filters`.

As configurações podem ser consultadas no arquivo `application.yml`.


#### Sites legais e referências:
https://spring.io/guides/gs/routing-and-filtering/

https://github.com/Netflix/zuul

https://technology.riotgames.com/news/riot-games-api-fulfilling-zuuls-destiny
