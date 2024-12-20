WITH RENTAL_DATE AS (
    SELECT 
        CAR_ID,
        CASE
            WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중'
            ELSE '대여 가능'
        END AS AVAILABILITY
    FROM 
        CAR_RENTAL_COMPANY_RENTAL_HISTORY
)
SELECT 
    CAR_ID,
    MAX(AVAILABILITY) AS AVAILABILITY
FROM 
    RENTAL_DATE
GROUP BY
    CAR_ID
ORDER BY 
    CAR_ID DESC;