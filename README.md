# app-gestao-biblioteca

Você foi contratado para desenvolver um sistema para uma biblioteca. A biblioteca necessita manter informações sobre empréstimos, usuários e publicações. Para isso, você deve implementar o projeto da Figura 1 usando a linguagem de programação Java.

REGRAS:
1. Todas as listas devem ser implementadas usando a classe ArrayList.
2. Todas as situações de exceção devem ser tratadas. Exemplo: não é permitido emprestar um periódico, não é permitido emprestar livros com quantidade de exemplares zerada, Faça todo o tratamento necessário. Os erros de tipos também devem ser tratados. Exemplo: o atributo deve receber um inteiro e o usuário digita uma String, deve-se fazer o tratamento dessa exceção.
3. Use polimorfismo sempre que possível. Um bom teste para verificar o uso correto do polimorfismo em seu projeto é imaginar a inclusão de um novo tipo ao sistema. Por exemplo, se for solicitada uma alteração no projeto para incluir outro tipo de
publicação, as alterações no código devem ser mínimas.
4. Para cada classe, deve-se obedecer as seguintes orientações:
• Atributos: especificados no diagrama. Obs: todos devem ser privados.
• Métodos get e set para obter e modificar atributos, quando necessário.
5. Atributos e métodos adicionais podem ser utilizados, mas os que foram definidos no diagrama devem obrigatoriamente estarem presentes no trabalho.
6. Os construtores das subclasses devem inicializar os atributos da sua superclasse.
7. A classe Publicacao deve ser abstrata
8. As classes Livro e Periodico são subclasses de Publicacao e devem implementar o método toString com as especificações de cada uma.
9. A classe Livro deve possuir o método atualizarQuantDisponivel para atualizar a quantidade de exemplares disponíveis do livro. Podendo incrementar ou decrementar. Só é permitido decrementar quando a quantidade for maior que zero.
10. A classe Emprestimo deve ter os métodos:
• adicionarItem: adiciona um item ao empréstimo. A quantidade disponível deve ser
atualizada.
• devolverItem: devolve um item específico do empréstimo. A quantidade disponível deve ser atualizada.
• devolverTodos: devolve todos os itens do empréstimo. A quantidade disponível deve ser atualizada.
• adicionarUsuario: adiciona o usuário ao empréstimo.
• toString com as especificações do empréstimo.
• verificarDatas: verifica se o usuário devolveu os itens dentro do prazo. Se ultrapassou a data prevista para devolução, calcular o valor da multa de acordo com a quantidade de dias.
• calcularValorMulta: calcula o valor total que o usuário deve pagar. Lembre-se que todos os itens devem ter sido devolvidos para gerar multa. Considere a taxa = 0.5. A fórmula para multa é: quantDias x (1 + taxa).
11. A classe ItemEmprestimo: deve ter o método:
• atualizarDevolucao: atualiza a data de devolução do item.
12.A classe Usuario deve implementar o método toString com as especificações dela.
13.A classe Biblioteca implementa a interface IBiblioteca.
• cadastrarUsuario: esse método deve cadastrar os usuários solicitando todos os dados ao usuário. O mesmo cpf não pode ser cadastrado mais de uma vez. O sistema deve consultar esse dado antes de cadastrar um novo cliente.
• listarUsuario: esse método deve imprimir a lista de usuários da biblioteca com todos os dados.
• cadastrarPublicacao: esse método deve cadastrar as publicações solicitando todos os dados ao usuário.
• listarPublicacao: esse método deve imprimir a lista de publicações da biblioteca com todos os dados, diferenciando os tipos 
• cadastrarEmprestimo: esse método deve cadastrar os empréstimos solicitando todos os dados ao usuário. A lista de usuários e livros devem ser impressas para que o usuário escolha o código do usuário e do livro que farão parte do empréstimo.
Dados referentes a devolução não devem ser inicializados. Exemplo: a data de devolução, o valor da multa. Não esqueça de fazer os cálculos necessários e validar as situações antes de realizar o empréstimo.
• listarEmprestimo: esse método deve imprimir a lista de empréstimos ativos da biblioteca.
• cadastrarDevolucao: esse método deve cadastrar a devolução, solicitando todos os dados ao usuário. Essa devolução faz alterações no item do empréstimo.
Exemplo: quando um livro é emprestado, a data de devolução não é preenchida, na devolução deve atualizar essa data. O mesmo empréstimo pode ter vários itens. O usuário pode escolher devolver itens específicos ou todos. Não esqueça de realizar todos os cálculos e alterações necessárias.
• listarDevolucao: esse método deve imprimir a lista de empréstimos finalizados da biblioteca.
• pesquisarPublicacao: esse método deve pesquisar pelo nome do livro ou nome do autor e mostrar o resultado.
14. O sistema só pode ser fechado quando o usuário digitar uma opção para sair.
15. O seu sistema deve ser claro para qualquer usuário que o utilizar
16.A classe Principal deve ter um menu para:
• cadastrar: publicações, usuários e empréstimos.
• listar: publicações, usuários e empréstimos.
