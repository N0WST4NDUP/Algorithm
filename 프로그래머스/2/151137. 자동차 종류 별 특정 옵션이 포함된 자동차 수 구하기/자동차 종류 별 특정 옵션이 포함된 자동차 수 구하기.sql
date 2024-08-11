-- 코드를 입력하세요
SELECT
car_type,   COUNT(*) AS cars
FROM car_rental_company_car
WHERE options LIKE '%시트%'
GROUP BY car_type
ORDER BY car_type;