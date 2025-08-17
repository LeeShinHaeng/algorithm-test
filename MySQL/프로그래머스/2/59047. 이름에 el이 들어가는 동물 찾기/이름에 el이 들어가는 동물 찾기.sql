SELECT
    animal_id, name
FROM animal_ins
WHERE 
    ANIMAL_TYPE = 'dog'
AND
    name LIKE CONCAT('%', 'el', '%') 
ORDER BY name;