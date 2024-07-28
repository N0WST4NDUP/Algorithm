-- 코드를 입력하세요
SELECT 게시글.title,
        게시글.board_id,
        댓글.reply_id,
        댓글.writer_id,
        댓글.contents,
        TO_CHAR(댓글.created_date, 'YYYY-MM-DD') AS created_date
FROM used_goods_board 게시글 INNER JOIN used_goods_reply 댓글
ON 게시글.board_id = 댓글.board_id
WHERE 게시글.created_date >= TO_DATE('2022-10-01', 'YYYY-MM-DD')
    AND 게시글.created_date < TO_DATE('2022-11-01', 'YYYY-MM-DD')
ORDER BY 댓글.created_date ASC, 게시글.title ASC;