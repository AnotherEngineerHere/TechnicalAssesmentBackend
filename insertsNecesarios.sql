-- Inserts para la tabla "movies"
INSERT INTO movie (id, title, director, duration, release_date) VALUES 
(1, 'The Shawshank Redemption', 'Frank Darabont', 142, '1994-10-14'),
(2, 'The Godfather', 'Francis Ford Coppola', 175, '1972-03-24'),
(3, 'The Dark Knight', 'Christopher Nolan', 152, '2008-07-18'),
(4, 'Pulp Fiction', 'Quentin Tarantino', 154, '1994-10-14'),
(5, 'The Lord of the Rings: The Return of the King', 'Peter Jackson', 201, '2003-12-17'),
(6, 'Schindler''s List', 'Steven Spielberg', 195, '1994-12-15'),
(7, 'Forrest Gump', 'Robert Zemeckis', 142, '1994-07-06'),
(8, 'Inception', 'Christopher Nolan', 148, '2010-07-16'),
(9, 'The Matrix', 'Lana Wachowski, Lilly Wachowski', 136, '1999-03-31'),
(10, 'Interstellar', 'Christopher Nolan', 169, '2014-11-07');

-- Inserts para la tabla "rooms"
INSERT INTO room (id, room_number, capacity) VALUES
(1, 1, 100),
(2, 2, 80),
(3, 3, 120),
(4, 4, 90),
(5, 5, 110),
(6, 6, 150),
(7, 7, 70),
(8, 8, 100),
(9, 9, 80),
(10, 10, 120);

-- Inserts para la tabla "screenings"
INSERT INTO screening (id, movie_id, room_id, start_time) VALUES
(1, 1, 1, '2024-05-03 18:00:00'),
(2, 2, 2, '2024-05-04 19:30:00'),
(3, 3, 3, '2024-05-05 20:15:00'),
(4, 4, 4, '2024-05-06 17:45:00'),
(5, 5, 5, '2024-05-07 21:00:00'),
(6, 6, 6, '2024-05-08 14:30:00'),
(7, 7, 7, '2024-05-09 16:45:00'),
(8, 8, 8, '2024-05-10 18:20:00'),
(9, 9, 9, '2024-05-11 19:10:00'),
(10, 10, 10, '2024-05-12 20:45:00');

-- Inserts para la tabla "reservations"
INSERT INTO reservation (id, client_id, screening_id, number_of_seats) VALUES
(1, 1, 1, 2),
(2, 2, 2, 3),
(3, 3, 3, 1),
(4, 4, 4, 4),
(5, 5, 5, 2),
(6, 6, 6, 3),
(7, 7, 7, 2),
(8, 8, 8, 1),
(9, 9, 9, 3),
(10, 10, 10, 4);

-- Inserts para la tabla "clients"
INSERT INTO client (id, name, last_name, email, phone) VALUES
(1, 'John', 'Doe', 'john.doe@example.com', '+1234567890'),
(2, 'Jane', 'Smith', 'jane.smith@example.com', '+0987654321'),
(3, 'Michael', 'Johnson', 'michael.johnson@example.com', '+1122334455'),
(4, 'Emily', 'Brown', 'emily.brown@example.com', '+9988776655'),
(5, 'Christopher', 'Davis', 'christopher.davis@example.com', '+6677889900'),
(6, 'Jessica', 'Martinez', 'jessica.martinez@example.com', '+5544332211'),
(7, 'David', 'Jones', 'david.jones@example.com', '+3322114455'),
(8, 'Sarah', 'Wilson', 'sarah.wilson@example.com', '+7766554433'),
(9, 'James', 'Taylor', 'james.taylor@example.com', '+1122334455'),
(10, 'Olivia', 'Anderson', 'olivia.anderson@example.com', '+9988776655');
