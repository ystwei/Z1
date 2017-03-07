create procedure p_12(

	in in_price float(10,2),
	out out_count int
)
begin

	select *
	from orderitems
	where item_price>in_price;



	select count(*) into out_count
	from orderitems
	where item_price>in_price;
end //
delimiter ;


drop function if exists f_4;
delimiter //
create function f_4(
	in_price int

)
returns int
begin
	set @out_count:=0;
	select count(*) into @out_count
	from orderitems
	where item_price>in_price;

	return @out_count;
end //
delimiter ;