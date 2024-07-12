SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents, DATE_FORMAT(r.created_date, '%Y-%m-%d') AS created_date
FROM USED_GOODS_BOARD AS b
INNER JOIN USED_GOODS_REPLY AS r ON b.board_id = r.board_id
WHERE b.created_date BETWEEN '2022-10-01' AND '2022-10-31'
ORDER BY r.created_date ASC, b.title ASC;
