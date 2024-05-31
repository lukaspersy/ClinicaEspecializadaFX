[![Logo-Faculdade.png](https://i.postimg.cc/VkHqxJR7/Logo-Faculdade.png)](https://postimg.cc/nXB97cN7)
# Sistema de Agendamento de Consultas

Bem-vindo ao Sistema de Agendamento de Consultas! Este sistema foi desenvolvido como parte do curso de Ciências da Computação da Faculdade Católica da Paraíba, para a disciplina de Engenharia de Software. O objetivo é auxiliar clínicas e consultórios médicos a gerenciar seus agendamentos de forma eficiente e organizada.

## 📚 Contexto Acadêmico

Este projeto foi desenvolvido como parte das atividades da disciplina de Engenharia de Software do curso de Ciências da Computação da Faculdade Católica da Paraíba.

## Visão Geral

O Sistema de Agendamento de Consultas permite que os usuários realizem as seguintes operações:

- Agendamento de consultas médicas
- Visualização de horários disponíveis de médicos
- Gerenciamento de pacientes e médicos

## 🛠️ Tecnologias Utilizadas

O sistema foi desenvolvido utilizando as seguintes tecnologias:

- JavaFX: para a interface gráfica do usuário (GUI)
- Java Persistence API (JPA): para mapeamento objeto-relacional (ORM)
- MySQL: como banco de dados relacional
- Maven: para gerenciamento de dependências e construção do projeto

## Funcionalidades

1. **Agendamento de Consultas**: Os usuários podem agendar consultas com médicos disponíveis, escolhendo a data, horário e médico desejados.

2. **Visualização de Horários**: Os usuários podem visualizar os horários disponíveis de cada médico para agendamento.

3. **Gerenciamento de Pacientes e Médicos**: Os administradores do sistema podem cadastrar novos pacientes e médicos, atualizar informações e remover registros quando necessário.

## 🚀 Configuração do Projeto

Para configurar e executar o projeto em sua máquina local, siga estas etapas:

1. Clone este repositório para o seu ambiente local:

```
git clone https://github.com/seu-usuario/sistema-agendamento-consultas.git
```

2. Importe o projeto em sua IDE Java preferida.

3. Certifique-se de ter o MySQL instalado e configurado em sua máquina. Você pode ajustar as configurações de conexão com o banco de dados no arquivo `persistence.xml`.

4. Execute o script de criação do banco de dados (`create_database.sql`) para criar o esquema do banco de dados necessário para o sistema.

5. Execute o projeto a partir da classe principal (`Main.java`) para iniciar a aplicação.

## Contribuição

Contribuições são bem-vindas! Se você identificar bugs, problemas de desempenho ou tiver sugestões de novos recursos, sinta-se à vontade para abrir uma issue neste repositório.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).