WITH MAX_PRICE_PRODUCT AS (
    SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE
    FROM FOOD_PRODUCT
    WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
    GROUP BY CATEGORY
)
SELECT p.CATEGORY, m.MAX_PRICE, p.PRODUCT_NAME
FROM FOOD_PRODUCT p
JOIN MAX_PRICE_PRODUCT m
ON p.CATEGORY = m.CATEGORY AND p.PRICE = m.MAX_PRICE
WHERE p.CATEGORY IN ('과자', '국', '김치', '식용유')
ORDER BY m.MAX_PRICE DESC;