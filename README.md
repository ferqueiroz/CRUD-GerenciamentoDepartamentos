# Exercício 08: Gerenciamento de Departamentos

## Enunciado
Desenvolva uma API REST com Spring Boot para gerenciar departamentos. O objetivo  é praticar mapeamento JPA e operações CRUD em contexto organizacional.

## Entidade: Departamento
| Atributo    | Tipo   | Descrição                                         |
|:------------| :---   |:--------------------------------------------------|
| id          | Long   | Identificador único (chave primária, auto-gerado) |
| nome        | String | Nome da categoria                                 |
| localizacao | String | Localização do departamento                       |

## Requisitos
1. Crie uma entidade JPA chamada Departamento com os atributos especificados
2. Configure o nome da entidade JPA como Departamento
3. Configure o nome da tabela no banco como tb_departamento
4. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
5. Implemente um repositório Spring Data JPA para a entidade
6. Implemente um serviço para realizar as operações de CRUD
7. Crie um controlador REST que exponha os seguintes endpoints

## Endpoints RESTful
* POST /departamentos — criar novo departamento
* GET /departamentos — listar todos os departamentos
* GET /departamentos/{id} — buscar departamento por ID
* DELETE /departamentos/{id} — deletar departamento por ID

## Observações
* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas
