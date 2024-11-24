WITH RANKED_DATA AS (
    SELECT 
        ID, 
        SIZE_OF_COLONY, 
        NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS RANKING
    FROM 
        ECOLI_DATA
)
SELECT ID, 
    CASE
        WHEN RANKING = 1 THEN 'CRITICAL'
        WHEN RANKING = 2 THEN 'HIGH'
        WHEN RANKING = 3 THEN 'MEDIUM'
        WHEN RANKING = 4 THEN 'LOW'
    END AS COLONY_NAME
FROM RANKED_DATA
ORDER BY ID;