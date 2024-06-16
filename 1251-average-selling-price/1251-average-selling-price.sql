# Write your MySQL query statement below
select 
    Prices.product_id,
    Ifnull(ROUND(SUM(units*price)/SUM(units),2),0) as average_price
from
    prices left join unitssold
on
    Prices.product_id = UnitsSold.product_id 
    and
    UnitsSold.purchase_date between Prices.start_date and Prices.end_date
group by 
    product_id;