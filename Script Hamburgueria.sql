create database hamburgueria;

show databases; 

use Hamburgueria;

create table pedidos(
    ID integer not null,
    Nome varchar(30) not null,
    Endereco varchar(30) not null,
    Telefone integer(10) not null,
    Lanche varchar(20) not null,
    Bebida varchar(20) not null,
    Quantidade varchar(5) not null,
    Valor varchar(5) not null,
    primary key(ID)
)auto_increment=1;

show tables;

insert into pedidos(ID,Nome,Endereco,Telefone,Lanche,Bebida,Quantidade,Valor)
    values(1,'Pedro','Avenida Brigadeiro Faria Lima',12345678,'X-Bacon','Coca-Cola',1,22.00);

insert into pedidos(ID,Nome,Endereco,Telefone,Lanche,Bebida,Quantidade,Valor)
    values(2,'Luana','Avenida Minas Gerais 312',27560934,'X-Tudo','Coca-Cola',1,25.00);
    
insert into pedidos(ID,Nome,Endereco,Telefone,Lanche,Bebida,Quantidade,Valor)
    values(3,'Bruna','Rua Maria antonia 123',55567432,'X-Calabresa','Guaraná',1,30.00);
    
insert into pedidos(ID,Nome,Endereco,Telefone,Lanche,Bebida,Quantidade,Valor)
    values(4,'Giovana','Rua das acácias 913',76540986,'X-Egg Bacon','Coca-Cola',1,24.00);
    
insert into pedidos(ID,Nome,Endereco,Telefone,Lanche,Bebida,Quantidade,Valor)
    values(5,'Arthur','Rua Comendador Valadares 765',87621845,'X-Salada','Água',1,20.00);
    
select*from pedidos;
