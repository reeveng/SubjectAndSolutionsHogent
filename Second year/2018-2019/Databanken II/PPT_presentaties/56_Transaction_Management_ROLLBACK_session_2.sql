-- TRANSACTIONS IN SQL SERVER

use xtreme;
-- DEADLOCKS - SESSION 2

-- 2
begin transaction
-- 4
select salary from employee where employeeid=2
-- S-lock on record for employeeid=1 is taken and released 
-- after the select statement (default isolation level = read committed)
-- 7
update employee set salary = salary * 1.1 where employeeid=2
-- X-lock on record for employeeid=1 is taken and held until end of transaction 
-- (write statements are not effected by isolation level)
-- 8
select salary from employee where employeeid=2
-- 10
select salary from employee where employeeid=1
-- session "hangs" for a few seconds continues after session 1 has been killed (or vice versa)
-- due to deadlock detection
-- it shows the "old" value of the salary because session 1 has never committed its update
-- 12
commit
-- the X-lock is released