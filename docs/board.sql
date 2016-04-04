select if(no is null, 0, no) from user;
desc board;

select ifnull(max(group_no), 0) + 1  from board;

insert into board 
     values ( null, 'hello', 'hello', now(), 0, 
			    (select ifnull( max( group_no ), 0 ) + 1  from board as b), 
			    1, 0, 1 );
			   
select * from board; 
   