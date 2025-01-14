SELECT DISTINCT D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
FROM SKILLCODES S
JOIN DEVELOPERS D ON (D.SKILL_CODE & S.CODE) > 0
WHERE S.NAME IN ('Python', 'C#')
ORDER BY D.ID;