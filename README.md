# DevSuperior Spring Professional Desafio 1: Componentes e injeção de dependência.

Utilizando o que aprendi nas aulas foi solicitado a fazer um sistema que calcula `valor total` de um pedido levando em conta % de desconto e o frete.

`Tabela Frete`

![image](https://github.com/user-attachments/assets/1c0c16ae-1331-4466-9167-a96cfc9abae1)


O pedido é representado por um objeti conforme foi solicitado pelo projeto abaixo: 

![image](https://github.com/user-attachments/assets/a366f9fd-6d53-4604-9d4d-d646ce507e06)

E a lógica do calculo do valor total foi implementada através de serviços cada um com sua responsabilidade conforme solicitado pelo projeto abaixo: 

![image](https://github.com/user-attachments/assets/4dae71a5-e503-40a9-80e6-f4f55ee30b4a)

Sendo o serviço OrderService responsável por informar o valor total do calculo.
E o serviço ShippingService responsável por fazer o calculo do frete.

Colocamos os dados do pedido para calcular atraves do executavel do projeto no objeto Order que foi criado nesse exemplo como: 

`Código do pedido`: 1034 

`Valor básico`: R$ 95,90 

`Desconto`: 0% 

![image](https://github.com/user-attachments/assets/f89b6596-df2e-4944-87cc-41416595cdf2)

Como também foi utilizado o implement do CommandLineRunner a resposta foi nos dada no console:
![image](https://github.com/user-attachments/assets/3be42880-9d0d-44b2-9ec6-915f9b7e4643)

