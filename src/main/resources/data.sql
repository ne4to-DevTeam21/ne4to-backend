INSERT INTO users (id, login, name, password, email, created_at, updated_at) VALUES (1, 'nechto', 'unknown', '12345', 'nechto@mail.ru', '2024-01-01', '2024-06-01');
INSERT INTO users (id, login, name, password, email, created_at, updated_at) VALUES (2, 'infected', 'known', 'qwerty', 'infected@mail.ru', '2024-01-01', '2024-06-01');
INSERT INTO platforms (id, name, super_user, created_at, updated_at) VALUES (1, 'school21', 1, '2024-01-01', '2024-06-01');
INSERT INTO user_platforms (id, user_id, platform_id, user_status, created_at, updated_at) VALUES (1, 1, 1, 0, '2024-01-01', '2024-06-01');

