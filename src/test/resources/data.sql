
INSERT INTO user (nickname, email, password, role, status)
VALUES ('testUser', 'testuser@example.com', 'qwer1234', 'user', 'normal');


INSERT INTO item (name, description, owner_id, manager_id, status)
VALUES ('testItem', 'testItem', 1, 1, 'pending');


INSERT INTO reservation (item_id, user_id, start_at, end_at, status)
VALUES (1, 1, CURRENT_DATE, CURRENT_DATE + INTERVAL 1 DAY, 'pending');