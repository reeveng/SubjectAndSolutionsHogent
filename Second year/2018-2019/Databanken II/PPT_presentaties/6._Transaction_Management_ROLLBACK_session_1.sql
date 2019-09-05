-- TRANSACTIONS IN SQL SERVER

use xtreme;
-- DEADLOCKS - SESSION 1

-- 1
begin transaction
-- 3
select salary from employee where employeeid=1
-- S-lock on record for employeeid=1 is taken and released 
-- after the select statement (default isolation level = read committed)
-- 5
update employee set salary = salary * 1.1 where employeeid=1
-- X-lock on record for employeeid=1 is taken and held until end of transaction 
-- (write statements are not effected by isolation level)
-- 6
select salary from employee where employeeid=1
-- shows 44.000
-- 9
select salary from employee where employeeid=2
-- sessions "hangs", in fact it waits for the X-lock from session 2 on employeeid = 2 to be released
-- after session 2 queries the record from employee 1 a deadlock occurs and this session is chosen as the deadlock victim
-- a rollback is executed automatically and X-lock is released
-- 11
select salary from employee where employeeid=2
-- the session hangs again because session 2 still hasn't committed nor aborted
-- after session 2 commits the new salary for employee 2 is shown