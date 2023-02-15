INSERT INTO user_tb(username, password, email, created_at) values('ssar', '1234', 'ssar@nate.com', now());
INSERT INTO board_tb(title, content, thumbnail, user_id, created_at) values('1번째 제목', '1번째 내용', '/images/dora.png', 1, now());

commit;