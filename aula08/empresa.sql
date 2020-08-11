#criacao de uma nova base de dados
create database empresa;

use empresa; #coloca o database como padrão

drop table if exists departamento; #excluir se existir, para nao dar erro/parar execucao script

#cria a tabela de departamentos
create table departamento(
	idDepto int not null auto_increment,
    nomeDep varchar(50),
    andar smallint,
    constraint pk_departamento primary key (idDepto)
);

#cria a tabela de funcionarios
create table funcionario(
	idFunc int not null auto_increment,
    nome varchar(100) not null,
    email varchar(80),
    sexo enum('M','F') not null,
    dataAdm date,
    salario float,
    idDepto int,
    constraint pk_funcionario primary key (idFunc),
    constraint fk_func_depto foreign key (idDepto) references departamento(idDepto)
);

create table projeto(
	idProj int not null auto_increment,
    titulo varchar(40),
    constraint pk_projeto primary key(idProj)
);

create table projFunc(
	idFunc int not null,
    idProj int not null,
    constraint pk_projfunc primary key(idFunc, idProj),
    constraint fk_func_projfunc foreign key(idFunc) references funcionario(idFunc),
    constraint fk_proj_projfunc foreign key(idProj) references projeto(idProj)
);
#emcima DDL - criação de estrutura

#daqui pra baixo DML - inserção de dados
#inserindo dados nas tabelas
insert into departamento values (null, 'Engenharia', 15);
insert into departamento values (null, 'TI', 16);
insert into departamento values (null, 'Financeiro', 15);
insert into departamento values (null, 'Compras', 14);

insert into funcionario values (null, 'Carlos Silva', 'carlos@silva.com','M','2020-01-14',5000,1);
insert into funcionario values (null, 'Maria Silva', 'maria@silva.com','F','2015-05-24',5000,2);
insert into funcionario values (null, 'Keila Ramos Silva', 'ramos@keila.com','F','2019-11-26',5000,3);
insert into funcionario values (null, 'Eduardo Santos', 'edu@santos.com','M','2018-06-13',5000,4);
insert into funcionario values (null, 'José João', 'jose@joao.com','M','2020-01-01',5000,1);

insert into projeto values(null, 'Nova rodovia BR876');
insert into projeto values(null, 'Novo viaduto do chá');
insert into projeto values(null, 'Reforma do maracanã');

insert into projfunc values (1,1);
insert into projfunc values (2,1);
insert into projfunc values (3,3);
insert into projfunc values (3,1);
insert into projfunc values (1,3);

#consultas aos dados

select * from funcionario;
select nome,email from funcionario;
select nome, email from funcionario where nome like 'Keila%';

SELECT 
    nome, email
FROM
    funcionario
WHERE
    nome LIKE 'Keila%'; #o símbolo % representa qualquer sequência de caracteres

#select com join
SELECT 
    *
FROM
    funcionario
        INNER JOIN
    departamento ON funcionario.idDepto = departamento.idDepto;
    
SELECT funcionario.nome, departamento.nomeDep
FROM funcionario INNER JOIN departamento 
ON funcionario.idDepto = departamento.idDepto;

SELECT funcionario.nome, departamento.nomeDep
FROM funcionario INNER JOIN departamento 
USING(idDepto);

#lista todos funcionários e seus projetos, mesmo que não esteja alocado em nenhum
select funcionario.nome, projeto.titulo
from funcionario inner join projfunc using(idFunc)
inner join projeto using(idProj) order by funcionario.nome;

select funcionario.nome, projeto.titulo
from funcionario left join projfunc using(idFunc)
left join projeto using(idProj) order by funcionario.nome;

#em quantos projetos cada funcionario está alocado
select funcionario.nome, count(idFunc) as TotalProjetos
from funcionario inner join projfunc using(idFunc)
inner join projeto using(idProj) 
group by funcionario.idFunc
order by funcionario.nome;

#mostrar a media de salario dos funcionarios
select avg(salario) MediaSalario
from funcionario;

#quais sao os funcionarios que ganham acima da media
SELECT funcionario.nome, funcionario.salario
FROM funcionario
WHERE salario > (SELECT AVG(salario) MediaSalario 
				 FROM funcionario);
                 
#quem foi contratado no dia x
#solução 1 padrão SQL
select nome from funcionario where dataAdm = '2020-01-14' ;

#solução 2, tendo que converter formato de data
select nome from funcionario where dataAdm = str_to_date('14/01/2020','%d/%m/%Y') ;