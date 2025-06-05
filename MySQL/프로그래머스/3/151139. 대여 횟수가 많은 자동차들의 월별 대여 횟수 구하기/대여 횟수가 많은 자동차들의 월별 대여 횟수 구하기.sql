
select
    month(start_date) as MONTH,
    car_id as CAR_ID,
    count(history_id) as RECORDS
from
    CAR_RENTAL_COMPANY_RENTAL_HISTORY as cc
where 
    cc.start_date >= '2022-08-01'
and cc.start_date <  '2022-11-01'
and
    car_id in (
        select
            car_id
        from 
            CAR_RENTAL_COMPANY_RENTAL_HISTORY as cc
        where
            cc.start_date >= '2022-08-01'
        and cc.start_date <  '2022-11-01'
        group by cc.car_id
        having 
            count(cc.history_id) >= 5
    )
group by month(start_date), car_id
order by month, car_id desc;


