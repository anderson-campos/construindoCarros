<h1>Projeto Carro</h1>

<p>Este projeto em Java permite ao usuário inserir informações sobre um carro (marca, modelo e ano de fabricação) e, em seguida, exibir essas informações formatadas.</p>
   
<h2>Estrutura do Projeto</h2>

<p>O projeto é composto por duas classes principais:</p>
<ul>
  <li><strong>Classe <code>Carro</code></strong>: Representa um carro com atributos de marca, modelo e ano.</li>
  <li><strong>Classe <code>Main</code></strong>: Permite ao usuário inserir informações sobre o carro e exibi-las no console.</li>
</ul>

<h2>Classe Carro</h2>

<p>A classe <code>Carro</code> contém os atributos e métodos para representar e exibir um carro.</p>
<h3>Atributos</h3>

<ul>
  <li><strong>String marca</strong>: armazena a marca do carro.</li>
  <li><strong>String modelo</strong>: armazena o modelo do carro.</li>
  <li><strong>int ano</strong>: armazena o ano de fabricação do carro.</li>
</ul>

<h3>Construtor</h3>

<p>O construtor da classe recebe como parâmetros os valores para <code>marca</code>, <code>modelo</code> e <code>ano</code> e os armazena nos atributos correspondentes.</p>
<h3>Método <code>exibirInformacoes</code></h3>
<p>O método <code>exibirInformacoes</code> imprime no console uma mensagem com os detalhes do carro.</p>
<h2>Classe Main</h2>
<p>A classe <code>Main</code> serve como ponto de entrada do programa e permite ao usuário inserir as informações sobre o carro.</p>

<h3>Funcionamento</h3>

<ol>
  <li>Um objeto da classe <code>Scanner</code> é criado para receber entradas do usuário.</li>
  <li>O programa solicita ao usuário as informações do carro (marca, modelo e ano) e armazena esses valores em variáveis.</li>
  <li>Um objeto da classe <code>Carro</code> é criado com as informações fornecidas.</li>
  <li>O método <code>exibirInformacoes</code> é chamado para exibir os dados do carro no console.</li>
</ol>

<h2>Conclusão</h2>
<p>Este projeto é uma aplicação prática dos conceitos básicos de classes e objetos em Java, bem como da interação com o usuário por meio do console. Ele fornece uma base simples para entender como organizar e manipular dados dentro de uma estrutura orientada a objetos.</p>
