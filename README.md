# YouTube Video Downloader

Este é um projeto simples que permite baixar vídeos do YouTube em diferentes qualidades de vídeo e áudio. O projeto foi desenvolvido em Java e usa a biblioteca `youtube-api-dl-jvm` para baixar os vídeos.

## Pré-requisitos

- Java 17
- Maven
- yt-dlp
- ffmpeg

## Como instalar

1. Clone o repositório para o seu computador local usando `git clone`.
2. Navegue até o diretório do projeto e execute `mvn clean install` para construir o projeto.

## Como usar

1. Execute o projeto usando `mvn javafx:run`.
2. Insira a URL do vídeo do YouTube que você deseja baixar no campo de texto.
3. Clique no botão "Baixar Vídeo" para iniciar o download.
4. Selecione o diretório onde você deseja salvar o vídeo.
5. O status do download será exibido na interface do usuário.

## Selecionando a qualidade do vídeo e do áudio

Você pode selecionar a qualidade do vídeo e do áudio usando as caixas de combinação fornecidas. As opções de qualidade disponíveis serão atualizadas automaticamente com base na URL do vídeo fornecida.

## Solução de problemas

Se você encontrar problemas ao baixar vídeos, verifique o seguinte:

- Verifique se o `ffmpeg` ou `avconv` estão instalados e acessíveis através do PATH do sistema. O `yt-dlp` precisa de um deles para mesclar fluxos de vídeo e áudio.
- Certifique-se de que o vídeo que você está tentando baixar tem um fluxo de áudio disponível na qualidade que você selecionou.
- Pode haver um problema com o `yt-dlp` em si. Tente atualizar para a versão mais recente.

## Contribuindo

Contribuições são bem-vindas! Por favor, sinta-se à vontade para abrir um problema ou solicitação pull.

## Licença

Este projeto está licenciado sob a licença MIT.
