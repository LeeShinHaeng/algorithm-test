SELECT
    HOUR(o.datetime) as HOUR,
    count(o.animal_id) as COUNT
FROM animal_outs o
WHERE HOUR(o.datetime) >= 9 AND HOUR(o.datetime) <= 19
GROUP BY HOUR
ORDER BY HOUR ASC;