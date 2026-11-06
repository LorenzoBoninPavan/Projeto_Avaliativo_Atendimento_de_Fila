# Sistema de Atendimento por Fila de Senhas Desenvolvido em 2023

#Sobre o Projeto
Este projeto foi desenvolvido em Java com o objetivo de praticar e consolidar conceitos de Estruturas de Dados, focando especificamente no funcionamento de Filas (Queues). A aplicação simula um sistema de atendimento automatizado que gerencia a emissão e a chamada de senhas, diferenciando atendimentos normais de atendimentos prioritários.

#Funcionalidades e Regras de Negócio

  Gestão de Senhas Dupla: O sistema diferencia senhas normais de senhas prioritárias.
  
  Lógica de Prioridade: Sempre que uma senha prioritária é gerada ou está pendente, ela tem preferência de atendimento e é posicionada para sair antes das senhas normais na fila de atendimento.
  
  Reciclagem de Numeração: Sempre que uma senha é atendida (sai da fila), o seu número retorna para a lista de números disponíveis, permitindo o reaproveitamento contínuo dos identificadores numéricos.
  
  Operações de Fila: Enfileiramento (enqueue), desenfileiramento (dequeue) estruturado por regras de prioridade e controle dinâmico dos elementos ativos.

#Tecnologias Utilizadas

  Linguagem: Java (Orientação a Objetos)

  Conceitos Aplicados: Estruturas de Dados Lineares (Filas / Queues), Tratamento de Condições de Prioridade, Manipulação de Coleções e Algoritmos de Controle de Fluxo.
