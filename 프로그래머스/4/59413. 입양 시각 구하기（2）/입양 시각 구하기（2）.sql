WITH RECURSIVE HOURS AS (
    SELECT 0 AS HOUR
    
    UNION ALL
    
    SELECT HOUR + 1
    FROM HOURS
    WHERE HOUR < 23
)
SELECT h.HOUR, COUNT(o.DATETIME) AS COUNT
FROM HOURS h
LEFT JOIN ANIMAL_OUTS o
ON HOUR(o.DATETIME) = h.HOUR
GROUP BY h.HOUR
ORDER BY h.HOUR;