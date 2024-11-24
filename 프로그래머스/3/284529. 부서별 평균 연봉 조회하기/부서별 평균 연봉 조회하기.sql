WITH HR_AVG AS (
    SELECT
        DEPT_ID,
        AVG(SAL) AS AVG_SAL
    FROM
        HR_EMPLOYEES
    GROUP BY
        DEPT_ID
)
SELECT
    d.DEPT_ID,
    d.DEPT_NAME_EN,
    ROUND(a.AVG_SAL, 0) AS AVG_SAL
FROM
    HR_AVG a
JOIN
    HR_DEPARTMENT d
ON
    a.DEPT_ID = d.DEPT_ID
ORDER BY
    a.AVG_SAL DESC;