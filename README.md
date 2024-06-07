
# Projeto de API de Produto

Este projeto é uma API de produto, desenvolvido em Java 17 e Spring Boot 3, utilizando as bibliotecas OpenFeign e Lombok.

## Descrição do Projeto

O objetivo deste projeto é disponibilizar uma API que consome uma API externa e fornece operações para listar produtos, buscar produtos por ID, adicionar novos produtos, atualizar produtos existentes e excluir produtos.

### Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- OpenFeign
- Lombok

## Como Iniciar o Projeto

Siga os passos abaixo:

1. Certifique-se de que você tenha o Java 17 instalado em seu sistema.

2. Clone este repositório para a sua máquina local:

   ```
   git clone https://github.com/Fernandak/ProductAPI.git
   ```

3. Para executar o aplicativo pode ser utilizado o Apache Maven, para isso voce deve executar o aplicativo com seguinte comando na raiz do projeto:  

   ```
   mvn spring-boot:run  
   ```
   
4. A aplicação será executada a partir de `http://localhost:8080`

5. As requisições do Postman estão disponiveis em: 
[Collections Postman](https://www.postman.com/blue-crescent-757535/workspace/product/collection/19646716-21ebbbbd-2ef4-4179-9a15-0dceb44993d1?action=share&creator=19646716) 