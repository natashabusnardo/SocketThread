# SocketThread
Altere o exemplo da aula para funcionar como um criador de Thread. O cliente envia por exemplo a mensagem "new 100 Teste" e o servidor cria uma nova Thread com um ciclo de for de 100 vezes que imprime a palavra Teste. O cliente deve ser capaz de enviar uma nova mensagem de criação de Thread mesmo antes da anterior ser finalizada.

# Classes

## ClienteSocket
Efetua a comunicação do cliente, onde recebemos o valor total do número de repetições além da palavra a ser repetida.
Padrão: "new quantidade palavra" -> ex: new 100 Teste

## ServidorSocket
Recebe a entrada do cliente, realizando uma nova thread onde, através da função Split, divide em um vetor a quantidade e palavra digitadas no cliente.

## ThreadSocket
Através da implementação de Runnable, no método run recebemos os parâmetros passados pela classe ServidorSocket, podendo realizar a operação.
