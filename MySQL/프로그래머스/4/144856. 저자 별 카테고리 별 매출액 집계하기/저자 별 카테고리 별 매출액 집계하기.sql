SELECT 
    a.author_id, a.author_name, sub.category, sub.total_sales
FROM author a
JOIN
(
    SELECT 
        b.author_id,
        b.category,
        SUM(s.sales * b.price) total_sales
    FROM book_sales s
    JOIN book b
    ON s.book_id = b.book_id
    WHERE YEAR(s.sales_date) = 2022 
    AND MONTH(s.sales_date) = 1
    GROUP BY b.author_id, b.category
) sub
ON a.author_id = sub.author_id
ORDER BY a.author_id ASC, sub.category DESC;