
-> Criar um projeto JPA para a ind�stria e implementar as classes conforme o diagrama apresentado.
-> Mapear as classes para entidades e criar o Banco de Dados conforme o dicion�rio de dados apresentado. 
-> Aplicar regras de valida��o conforme o dicion�rio de dados apresentado. 
-> Criar um projeto JSF e nele uma CRUD para a classe Grupo

ANOTA��ES/DICAS:

> No meu caso, deu erro ao gerar a tabela no BD da classe que n�o possuia ID,
ent�o adicionei "@Id private Integer id;" e logo a Persist�ncia funcionou.

> HIBERNATE VALIDATOR:
@Past = Para verificar se a data est� no passado

@DecimalMin(value="0",inclusive=false) = Para validar que o valor seja
maior que ZERO, sem inclu�-lo.

#Para definir uma Lista, utilize a defini��o @ElementCollection
#Define-se antes, a classe parte da Composi��o, a qual ser� o tipo da lista.
@NotNull
@Size(min = 1)
@ElementCollection
private List<RecebimentoItem> itensRecebidos = new ArrayList<RecebimentoItem>();

#Validar um CNPJ
#Fonte: https://github.com/hibernate/hibernate-validator/blob/master/engine/src/main/java/org/hibernate/validator/constraints/br/CNPJ.java

@Pattern(regexp = "([0-9]{2}[.]?[0-9]{3}[.]?[0-9]{3}[/]?[0-9]{4}[-]?[0-9]{2})")

#Inserindo no BD manualmente para teste

INSERT INTO grupo (id,nome)
VALUES ('1','Refrigerante')

select * from grupo