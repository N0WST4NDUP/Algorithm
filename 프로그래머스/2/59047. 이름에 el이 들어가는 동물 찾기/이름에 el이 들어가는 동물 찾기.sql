-- 코드를 입력하세요
SELECT
    animal_id, name
FROM
    animal_ins
WHERE
    name LIKE ('%el%') AND
    animal_type = 'dog'
ORDER
    BY name ASC;