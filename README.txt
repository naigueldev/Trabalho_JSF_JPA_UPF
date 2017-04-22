
-> Criar um projeto JPA para a indústria e implementar as classes conforme o diagrama apresentado.
-> Mapear as classes para entidades e criar o Banco de Dados conforme o dicionário de dados apresentado. 
-> Aplicar regras de validação conforme o dicionário de dados apresentado. 
-> Criar um projeto JSF e nele uma CRUD para a classe Grupo

ANOTAÇÕES/DICAS:

> No meu caso, deu erro ao gerar a tabela no BD da classe que não possuia ID,
então adicionei "@Id private Integer id;" e logo a Persistência funcionou.

> HIBERNATE VALIDATOR:
@Past = Para verificar se a data está no passado

@DecimalMin(value="0",inclusive=false) = Para validar que o valor seja
maior que ZERO, sem incluí-lo.

#Para definir uma Lista, utilize a definição @ElementCollection
#Define-se antes, a classe parte da Composição, a qual será o tipo da lista.
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