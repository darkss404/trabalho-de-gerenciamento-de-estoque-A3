# trabalho de gerenciamento de estoque A3
<h2>👩🏻‍💻Introdução ao trabalho:</h2>
Este repositório contém o desenvolvimento de um sistema de gerenciamento de estoque, criado como parte da avaliação A3 da disciplina de Pogramação de Soluções Computacionais. O objetivo principal é fornecer uma ferramenta eficiente para o controle e gestão de inventário de produtos, permitindo o registro e acompanhamento de entradas e saídas de mercadorias.<br>
<h2>👦🏻Integrantes:</h2><br>
<table border="6">
  <tr>
    <th>Nome</th>
    <th>RA</th>
    <th>GitUser</th>
  </tr>
  <tr>
    <td>Hector Dartagnan Viana de Brum</td>
    <td>10725116554</td>
    <td>Dartagnan/Eudarta/hdkil</td>
  </tr>
  <tr>
    <td>Iago bastos de oliveira</td>
    <td>1073513349</td>
        <td>ioliveira01</td>
  </tr>
   <tr>
    <td>Jonathan Oliveira Lynch</td>
    <td>10724265639</td>
        <td>JonnyLynch8</td>
  </tr>
   <tr>
    <td>Pedro henrique antunes gonçalves</td>
    <td>10725111381</td>
        <td>darkss404</td>
  </tr>
</table><br>
<h2>💻Tecologias utilizadas:</h2>
- IDE: Apache NetBeans 25<br>
- Java Development Kit (JDK): 23.0.2.0<br>
- Versão do driver JDBC (MySQL Connector/J): 9.3.0<br>
- MySQL Database Server: 9.3.0<br>
- SQL Workbench: 8.0.42<br>
<h2>🗃Acesso ao Banco de Dados:</h2>
- Port: 3306<br>
- Usuário: root<br>
- Senha: 1234<br>
<h2>📋Requisitos Fucionais:</h2>
<table border="2">
  <tr>
    <th></th>
    <th></th>
  </tr>
  <tr>
    <td>1</td>
    <td>Cadastrar categorias (Nome, Tamanho, Embalagem).</td>
  </tr>
   <tr>
    <td>2</td>
    <td>Alterar os dados de categoria (Nome, Tamanho, Embalagem).</td>
  </tr>
   <tr>
    <td>3</td>
    <td>Deletar categorias.</td>
  </tr>
   <tr>
    <td>4</td>
    <td>Cadastrar Produtos (Nome, Preço unitário, Unidade, Quantidade em estoque, Quatidade máxima no estoque, Quatidade mínima no estoque, Categoria).</td>
  </tr>
   <tr>
    <td>5</td>
    <td>Alterar os dados de produtos (Nome, Preço unitário, Unidade, Quantidade em estoque, Quatidade máxima no estoque, Quatidade mínima no estoque, Categoria).</td>
  </tr>
   <tr>
    <td>6</td>
    <td>Permitir reajustar os preços de todos os produtos em um determinado percentual.</td>
  </tr>
   <tr>
    <td>7</td>
    <td>Permitir a adição e subtração das unidades de um produto (movimentação de entrada e saída).</td>
  </tr>
   <tr>
    <td>8</td>
    <td>Deletar Produtos.</td>
   <tr>
    <td>9</td>
    <td>Lista de Preços: uma relação de todos os produtos do estoque em ordem alfabética, constando do
preço de cada um deles, unidade medida e categoria.</td>
  </tr>
   <tr>
    <td>10</td>
    <td>Balanço Físico/Financeiro: uma relação de todos os produtos do estoque, em ordem alfabética,
constando da quantidade disponível de cada um dos produtos, o valor total de cada um dos
produtos (valor unitário * a quantidade em estoque) e o valor total do estoque (somatório dos
totais de cada produto).</td>
  </tr>
   <tr>
    <td>11</td>
    <td>Relatório dos produtos que estão abaixo da quantidade mínima contendo o nome do produto, a
quantidade mínima e a quantidade em estoque.</td>
  </tr>
   <tr>
    <td>12</td>
    <td>Relatório dos produtos que estão abaixo da quantidade máxima contendo o nome do produto, a
quantidade máxima e a quantidade em estoque.</td>
  </tr>
   <tr>
    <td>13</td>
    <td>Relatório da quantidade de produtos por categoria contento o nome da categoria e quantidade de
produtos distintos.</td>
  </tr>
</table>
<h2>🔗Requisitos Não Funcionais:</h2>
- Interface simples e intuitiva<br>
- Acessível mesmo para usuários sem conhecimentos técnicos<br>
- O sistema é compatível com o banco de dados MYSQL<br>
