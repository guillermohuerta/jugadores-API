INSERT INTO players (id, name, last_name, email, password) VALUES
(1, 'Juan', 'Pérez', 'juan.perez@email.com', '1234'),
(2, 'Carlos', 'Gómez', 'carlos.gomez@email.com', 'abcd'),
(3, 'Luis', 'Martínez', 'luis.martinez@email.com', 'qwerty'),
(4, 'Diego', 'Ruiz', 'diego.ruiz@email.com', 'pass123'),
(5, 'Andrés', 'Soto', 'andres.soto@email.com', 'securepwd'),
(6, 'Fernando', 'López', 'fernando.lopez@email.com', 'pwd123'),
(7, 'Ricardo', 'Torres', 'ricardo.torres@email.com', '123abc'),
(8, 'Javier', 'Mendoza', 'javier.mendoza@email.com', 'mypass'),
(9, 'Martín', 'Vargas', 'martin.vargas@email.com', 'vargas321'),
(10, 'Esteban', 'Ramírez', 'esteban.ramirez@email.com', 'esteban99');

INSERT INTO matches (id, date, hour, players_per_team, max_players_in_match, stadium, cost_per_player, total_cost) VALUES
(1, '2025-07-13', '17:00:00', 7, 14, 'Estadio Central', 10.0, 140.0),
(2, '2025-07-20', '18:00:00', 6, 12, 'Cancha Norte', 8.0, 96.0),
(3, '2025-07-27', '16:30:00', 5, 10, 'Estadio Sur', 12.5, 125.0),
(4, '2025-08-03', '19:00:00', 7, 14, 'Cancha Este', 9.0, 126.0),
(5, '2025-08-10', '17:30:00', 6, 12, 'Polideportivo Oeste', 11.0, 132.0);

INSERT INTO player_registration (match_id, player_id, will_attend, has_paid, receipt_url, on_bench, registration_date_time) VALUES
(3, 1, true, true, 'http://example.com/recibo1.jpg', false, '2025-07-10T15:30:00'),
(3, 2, true, false, NULL, false, '2025-07-10T16:00:00'),
(3, 3, false, false, NULL, true, '2025-07-11T10:15:00'),
(3, 4, true, true, 'http://example.com/recibo4.jpg', false, '2025-07-12T14:45:00'),
(3, 5, true, true, 'http://example.com/recibo5.jpg', false, '2025-07-12T14:45:00'),
(3, 6, true, true, 'http://example.com/recibo6.jpg', false, '2025-07-12T14:45:00'),
(3, 7, false, false, NULL, true, '2025-07-11T10:15:00'),
(3, 8, false, false, NULL, true, '2025-07-11T10:15:00'),
(3, 9, true, true, 'http://example.com/recibo9.jpg', false, '2025-07-12T14:45:00'),
(3, 10, true, true, 'http://example.com/recibo10.jpg', true, '2025-07-12T15:10:00');