WITH TOTAL_SCORE AS (
    SELECT 
        EMP_NO,
        SUM(SCORE) AS SCORE
    FROM
        HR_GRADE
    WHERE
        YEAR = 2022
    GROUP BY
        EMP_NO
),
MAX_SCORE AS (
    SELECT
        MAX(SCORE) AS MAX_SCORE
    FROM
        TOTAL_SCORE
)
SELECT
    s.SCORE,
    e.EMP_NO,
    e.EMP_NAME,
    e.POSITION,
    e.EMAIL
FROM
    HR_EMPLOYEES e
JOIN
    TOTAL_SCORE s
    ON e.EMP_NO = s.EMP_NO
JOIN
    MAX_SCORE m
    ON  s.SCORE = m.MAX_SCORE;