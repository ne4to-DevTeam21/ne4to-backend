INSERT INTO users (id, login, name, password, email, created_at, updated_at) VALUES ('550e8400-e29b-41d4-a716-446655440000', 'nechto', 'unknown', '12345', 'nechto@mail.ru', '2024-01-01', '2024-06-01');
INSERT INTO users (id, login, name, password, email, created_at, updated_at) VALUES ('e4aa6e11-1fec-42eb-a1d5-c9ef420277bd', 'infected', 'known', 'qwerty', 'infected@mail.ru', '2024-01-01', '2024-06-01');
INSERT INTO platforms (id, name, super_user, created_at, updated_at) VALUES (1, 'school21', '550e8400-e29b-41d4-a716-446655440000', '2024-01-01', '2024-06-01');
INSERT INTO platforms (id, name, super_user, created_at, updated_at) VALUES (2, 'ecole42', '550e8400-e29b-41d4-a716-446655440000', '2024-01-01', '2024-06-01');
INSERT INTO user_platforms (id, user_id, platform_id, user_status, created_at, updated_at) VALUES (1, '550e8400-e29b-41d4-a716-446655440000', 1, 1, '2024-01-01', '2024-06-01');
INSERT INTO user_platforms (id, user_id, platform_id, user_status, created_at, updated_at) VALUES (2, '550e8400-e29b-41d4-a716-446655440000', 2, 1, '2024-01-01', '2024-06-01');
INSERT INTO user_platforms (id, user_id, platform_id, user_status, created_at, updated_at) VALUES (3, 'e4aa6e11-1fec-42eb-a1d5-c9ef420277bd', 1, 5, '2024-01-01', '2024-06-01');
INSERT INTO user_platforms (id, user_id, platform_id, user_status, created_at, updated_at) VALUES (4, 'e4aa6e11-1fec-42eb-a1d5-c9ef420277bd', 2, 5, '2024-01-01', '2024-06-01');

