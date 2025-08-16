SELECT 
    f.category,
    MAX(f.price) max_price,
    (
        SELECT f2.product_name
        FROM FOOD_PRODUCT f2
        WHERE f2.category = f.category
        ORDER BY f2.price DESC
        LIMIT 1
    ) product_name
FROM FOOD_PRODUCT f
WHERE f.category IN ('과자', '국', '김치', '식용유')
GROUP BY f.category
ORDER BY f.price DESC;

