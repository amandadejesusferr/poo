# Projeto de POO

## Au-Au Palace

Sistema de gerenciamento para um hotel de cães. A aplicação controla o cadastro de tutores, o registro de cães de diferentes portes e necessidades, o gerenciamento de reservas de hospedagem, aplicação de regras sanitárias (vacinação), cálculo dinâmico de diárias e aplicação de descontos promocionais baseados no aniversário do pet.

## Casos de Uso

- Cadastrar Hospedagem do Pet: O recepcionista registra a entrada de um cão informando as datas/diárias e serviços, validando automaticamente se o animal está vacinado e apto para a acomodação correspondente ao seu porte;
- Registrar Serviço Adicional: O sistema permite adicionar serviços extras à estadia e verifica automaticamente se o cão faz aniversário no mês atual para aplicar o desconto especial;
- Consolidar o Fechamento da Estadia e Relatório: O sistema percorre o array de hospedagens ativas, calcula o faturamento total e exibe um relatório detalhado das estadias encerradas e ativas.

## Regras de Negócio

- Vacinação Obrigatória: Um cão só pode ter sua hospedagem efetivada se o status de vacinação estiver atualizado;
- Restrição de Porte por Acomodação: Cães de grande porte não podem ser alocados em baias de pequeno porte;
- Limite de Diárias: O número de diárias de uma reserva deve ser estritamente maior que zero;
- Taxa de Cuidados Especiais: Cães idosos ou que necessitam de medicação contínua recebem automaticamente um acréscimo de 10% no valor da diária base;
- Desconto de Aniversário: Se o mês de nascimento do cão coincidir com o mês atual da hospedagem, é aplicado um desconto de 10% no valor total das diárias.
