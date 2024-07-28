-- 코드를 입력하세요
SELECT animal_id, name
FROM animal_ins
WHERE LOWER(intake_condition) != 'aged'
ORDER BY animal_id ASC;