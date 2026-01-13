# Projeto Web Service com Spring Boot

Esta aplicação consiste em um backend desenvolvido em Java, utilizando o framework Spring Boot.
O projeto implementa uma API RESTful, seguindo os princípios de arquitetura REST e as convenções recomendadas pelo Spring Framework, incluindo separação de responsabilidades, uso de controladores, serviços e repositórios.

## Tecnologias utilizadas

- Java  
- Spring Boot  
- Maven  
- Spring Web  


## Layout web service


<img width="1435" height="461" alt="image" src="https://github.com/user-attachments/assets/0eff594a-5e94-4c21-96e9-205d9bcd90c0" />



## Estrutura do Projeto

O projeto segue a estrutura padrão de aplicações Spring Boot, com separação em camadas para melhor organização do código:

```

src/
└── main/
├── java/
│   └── com/
│       └── application/
│           ├── controller
│           ├── service
│           ├── repository
│           └── model
└── resources/
└── application.properties

````

- **Controller**: camada responsável por receber as requisições HTTP  
- **Service**: camada de regras de negócio  
- **Repository**: camada de acesso a dados  
- **Model**: classes de domínio da aplicação  

---

## Funcionalidades

- Exposição de endpoints REST
- Processamento de requisições HTTP
- Organização em camadas
- Configuração automática do Spring Boot

---

## Execução do Projeto

### Requisitos

- Java JDK 17 (ou compatível)
- Maven

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/Rafael540/Projeto-web-service-com-Springboot.git
````

2. Acesse o diretório do projeto:

   ```bash
   cd Projeto-web-service-com-Springboot
   ```

3. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

4. A aplicação será iniciada em:

   ```
   http://localhost:8080
   ```

---

## Endpoints

Os endpoints disponíveis estão definidos nas classes da camada **controller**, utilizando as anotações do Spring (`@RestController`, `@RequestMapping`, etc.).

---

## Autor

Rafael Alves Neves da Silva
GitHub: [https://github.com/Rafael540](https://github.com/Rafael540)

---

## Licença

Projeto desenvolvido para fins de estudo e aprendizado.

```


