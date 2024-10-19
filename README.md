# App Android Nativo Desenvolvido com Pouca ou Nenhuma Codificação

App criado para conclusão do projeto 'Natural ou Fake Natty? Como Vencer na Era das IAs Generativas!', cujo objetivo é criar algo o mais realista possível usando IA. Decidi me desafiar e criar uma regra: usar apenas o conteúdo gerado pelo Copilot, a versão gratuita disponível no Windows. Alguns códigos gerados podem ter inconsistências ou problemas de importação. Por isso, farei os ajustes necessários de forma mínima para evitar um número excessivo de prompts.

Compartilharei os prompts utilizados em cada commit abaixo. Vale lembrar que, por se tratar de uma IA generativa, os resultados podem variar caso tente replicar os mesmos prompts:

## Splash Screen
Estou criando um projeto Android utilizando Jetpack Compose. Crie o código de uma splash screen com o background na cor #119DCF, centralizado na tela e com o texto na cor branca. Coloque um ícone na tela usando o drawable padrão que fica como ícone do app. Abaixo dele, com um espaçamento de 16dp, escreva "AI Wisdom by AI".

### Ajustes
- Apenas foi necessário ajustar o import de um composable Text.
- Enquanto fazia alguns testes anteriormente (prompt acima foi executado algumas vezes) o número de ajustes era maior, porém na tentativa atual, só o ajuste acima ocorreu.

## Home Screen
Após 300 milissegundos que a splash screen aparecer, deve ser exibida a tela home do app. Crie a tela home do app contendo, alinhado horizontalmente e verticalmente ao centro da tela e com espaçamento horizontal de 16dp, um texto "Clique no botão abaixo para adquirir uma nova sabedoria". Abaixo do texto, com um espaço de 16dp e também alinhado horizontalmente ao centro, um ícone de seta que use um drawable. Abaixo da seta, com um espaço de 16dp, um botão com texto "Nova sabedoria" e a cor de fundo do botão deve ser a mesma da splash screen.

Una as activities numa só.

Crie ou use algum drawable padrão para a seta e há um erro para colocar a cor de fundo do botão, corrija.

Alinhe o texto "Clique no botão..." horizontalmente ao centro e adicione espaçamento lateral de 16dp.

### Ajustes
- Após o primeiro script foram geradas 2 activities, por isso foi necessário o segundo prompt.
- Foi necessário remover alguns imports que foram gerados pela criação de duas activities e alguns foram ajustados.
- Cor de fundo do botão foi modificada manualmente, atributo que estava no código gerado era "backgroundColor" foi alterado para "containerColor".
- Texto "Clique no botão..." foi alinhado ao centro manualmente.

## Create and Show Wisdom
Crie uma lista de 10 sabedorias populares. Ao clicar no botão "Nova Sabedoria", o texto "Clique no botão..." deve desaparecer e em seu lugar uma mensagem escrita "Estou pensando...". Depois de 500 milissegundos, a mensagem "Estou pensando..." deve ser substituída por uma das sabedorias da lista criada.

O launchedEffect não pode ser chamado dentro do clique do botão, corrija.

Adicione ao final de cada sabedoria a quem a mesma é atribuída ou se não é conhecido, no formato " Atribuída a: " e o nome.

Mostre o código com as sabedorias neste formato.

### Ajustes
- Último prompt foi necessário pois no retorno anterior vieram apenas as frases haha.
- Modificado manualmente o tempo da Splash Screen e que o app leva para mostrar a sabedoria. 