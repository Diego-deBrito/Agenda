# Agenda – Lembrete (Java)

Módulo de **Lembretes** para uma Agenda, escrito em **Java 17** com **Maven**.  
Demonstra boas práticas de organização em camadas (`domain → repository → service → cli`), persistência em **JSON (Gson)** e **testes com JUnit 5**.

## Por que este projeto é bom para portfólio
- Camadas claras: facilita manutenção e evolução.
- Repositório intercambiável: memória ou arquivo JSON sem mudar a regra de negócio.
- Testes automatizados: valida regras principais.
- CLI simples: permite uso imediato sem frameworks.

## Funcionalidades
- Criar, listar, pesquisar, filtrar por intervalo, atualizar e excluir lembretes.
- Persistência em `data/lembretes.json`.
- Validações de título e intervalo de datas.

## Requisitos
- Java 17+
- Maven 3.9+

## Como executar
```bash
# Clonar
git clone https://github.com/SEU_USUARIO/Agenda.git
cd Agenda/Lembrete

# Rodar testes
mvn test

# Empacotar e executar
mvn package
java -jar target/lembrete-1.0.0.jar
