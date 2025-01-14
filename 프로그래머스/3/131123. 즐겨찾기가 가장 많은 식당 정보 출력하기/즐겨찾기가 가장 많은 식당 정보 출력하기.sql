WITH MAX_FAVORITES AS (
    SELECT 
        FOOD_TYPE,
        MAX(FAVORITES) AS FAVORITES
    FROM
        REST_INFO
    GROUP BY
        FOOD_TYPE
)
SELECT
    r.FOOD_TYPE,
    r.REST_ID,
    r.REST_NAME,
    r.FAVORITES
FROM
    REST_INFO r
JOIN
    MAX_FAVORITES m
ON
    r.FOOD_TYPE = m.FOOD_TYPE AND r.FAVORITES = m.FAVORITES
ORDER BY
    FOOD_TYPE DESC;