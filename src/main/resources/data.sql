insert into employee(name, surname , age, salary , job)
values('Samir' , 'Samirov' , 22 , 1200,'a');
insert into employee(name, surname , age, salary , job)
values('Samir1' , 'Samirov' , 12 , 23232,'b');
insert into employee(name, surname , age, salary , job)
values('Samir2' , 'Samirov' , 13 , 1234200,'c');
insert into employee(name, surname , age, salary , job)
values('Samir3' , 'Samirov' , 15 , 12030,'f');
insert into employee(name, surname , age, salary , job)
values('Samir4' , 'Samirov' , 55 , 33,'e');
insert into employee(name, surname , age, salary , job)
values('Samir5' , 'Samirov' , 44 , 3333,'d');

insert into department(department_name , department_code)
values('Department1' , 12345);

insert into department(department_name , department_code)
values('Department2' , 28547);

insert into department(department_name , department_code)
values('Department3' , 65712);

insert into department(department_name , department_code)
values('Department4' , 78954);

insert into department(department_name , department_code)
values('Department5' , 54321);

update employee set department_id = 1 where id = 1;
update employee set department_id = 2 where id = 2;
update employee set department_id = 3 where id = 3;
update employee set department_id = 4 where id = 4;
update employee set department_id = 5 where id = 5;
update employee set department_id = 3 where id = 6;
