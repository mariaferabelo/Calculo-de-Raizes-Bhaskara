1) Crie uma classe denominada Equacao que possua três atributos do tipo double: a, b e c.
Tais atributos devem ser encapsulados, por isso, crie métodos get e set para cada um. Tal
classe também deve possuir mais três métodos. O primeiro denominado delta, que calcula
o delta de uma equação do segundo grau pela fórmula:

delta = b2 – 4*a*c

O segundo, denominado retornaX1, que retorna um dos resultados da equação, calculado
pela fórmula:

x1 = -b + Math.sqrt(delta)
2*a

O terceiro, denominado retornaX2, que retorna o outro resultado da equação, calculado
pela fórmula:

x2 = -b - Math.sqrt(delta)
2*a

Crie um app que possua um objeto do tipo Equacao, representando uma equação real. Tal
app deve receber os valores de a, b e c do usuário e exibir os dois resultados da equação.
Após calcular e exibir os valores de uma equação, o app deve perguntar se o usuário
deseja informar outros valores ou sair do programa.
