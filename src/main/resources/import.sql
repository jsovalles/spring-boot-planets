/* Populate table planetas */
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(1,'Mercurio', 4878, 0.06 , 0.39, 0.24, 58.66,'assets/images/mercurio.png');
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(2,'Venus', 12100, 0.82 , 0.72, 0.615, 243,'assets/images/venus.png');
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(4,'Tierra', 12756, 1.00 , 1.00, 1.00, 1.00,'assets/images/tierra.png');
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(6,'Marte', 6787, 0.11 , 1.52, 1.88, 1.03,'assets/images/marte.png');
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(7,'Júpiter', 142984, 318 , 5.20, 11.86, 0.414,'assets/images/jupiter.png');
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(1,'Saturno', 120536, 95 , 9.54, 29.46, 0.426,'assets/images/saturno.png');
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(2,'Urano', 51108, 14.6 , 19.19, 84.01, 0.718,'assets/images/urano.png');
INSERT INTO planetas (contador, nombre, diametro, masa, radio_orbital, periodo_orbital, periodo_rotacion, foto) VALUES(7,'Neptuno', 49538, 17.2 , 30.06, 164.79, 0.6745,'assets/images/neptuno.png');

/* Populate table personas */
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(3, 'Teri Gutierrez',4, 50, 1.40, 70, 'Femenino', '1987-02-03');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(2, 'Spencer Pautier',12, 50, 1.50, 50, 'Masculino', '1984-04-20');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(4, 'Sophie Freeman',43, 50, 1.90, 90, 'Femenino', '1970-05-03');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(3, 'Raymond F. Boyce',2, 50, 1.40, 50, 'Masculino', '1940-03-02');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(3, 'Monique Davis',0, 50, 1.70, 100, 'Femenino', '1950-12-12');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(5, 'Louis Ramsey',1, 50, 2.10, 150, 'Femenino', '1960-11-21');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(4, 'Edgar Frank "Ted" Codd',23, 50, 1.40, 40, 'Masculino', '2000-02-01');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(5, 'Donald D. Chamberlin',32, 50, 1.55, 43, 'Masculino', '1990-04-13');
INSERT INTO personas (planeta_id, nombre, numero_visitas, edad, altura, peso, genero, fecha_nacimiento) VALUES(3, 'Alvin Greene',23, 50, 1.50, 90, 'Masculino', '1986-06-06');