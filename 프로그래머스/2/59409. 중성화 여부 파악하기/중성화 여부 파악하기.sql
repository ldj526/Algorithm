SELECT ANIMAL_ID, NAME,
CASE
    WHEN REGEXP_LIKE(SEX_UPON_INTAKE, 'Neutered|Spayed') THEN 'O'
    ELSE 'X' 
END AS 중성화
FROM ANIMAL_INS;