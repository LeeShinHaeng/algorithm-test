SELECT
    c.car_id,
    c.car_type,
    FLOOR(c.daily_fee * 30 * (100 - d.discount_rate) / 100) AS FEE
FROM car_rental_company_car c
JOIN car_rental_company_discount_plan d
ON d.car_type = c.car_type
AND d.duration_type = '30일 이상'
WHERE c.car_type IN ('세단', 'SUV')
AND NOT EXISTS (
    SELECT 1
    FROM car_rental_company_rental_history h
    WHERE h.car_id = c.car_id
    AND h.start_date <= '2022-11-30' AND h.end_date   >= '2022-11-01'
)
AND FLOOR(c.daily_fee * 30 * (100 - d.discount_rate) / 100) BETWEEN 500000 AND 1999999
ORDER BY fee DESC, c.car_type ASC, c.car_id DESC;
