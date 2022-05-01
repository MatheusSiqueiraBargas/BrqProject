INSERT INTO TIPO_HABILIDADES (NM_TIPO_HABILIDADE) VALUES ('LINGUAGEM');

INSERT INTO CANDIDATOS (NM_CANDIDATO, NR_CPF, NR_CELULAR, CD_SEXO, DT_NASCIMENTO, DS_EMAIL) VALUES ('Joaquim Manuel Drumond', 50132981998, 91988436298, 'M', '1950-01-12', 'Joaquim@hotmail.com'),('Noah Filipe Caldeira', 76578303103, 69982442109, 'M', '1945-04-08', 'Noah@hotmail.com'),('Lorenzo Hugo da Paz', 90579451500, 81983737654, 'M', '1997-02-26', 'Lorenzo@hotmail.com'),('Bruno Marcelo Peixoto', 13014370851, 67989341327, 'M', '1995-02-06', 'Bruno@hotmail.com'),('Thomas Bento da Cruz', 95372797312, 81986341528, 'M', '1959-02-25', 'Thomas@hotmail.com'),('Luan Bernardo Rodrigues', 40585317461, 27996190634, 'M', '1973-02-23', 'Luan@hotmail.com'),('Aline Sebastiana Corte Real', 30322599164, 84982829428, 'F', '1979-03-24', 'Aline@hotmail.com'),('Tânia Benedita Sophia Moraes', 25719725296, 31994665396, 'F', '1951-01-22', 'Tânia@hotmail.com'),('Kaique Ryan Lima', 75715265401, 21991352110, 'M', '1946-03-06', 'Kaique@hotmail.com'),('Maya Elza da Silva', 79693269438, 71987277769, 'F', '1961-02-08', 'Maya@hotmail.com');

INSERT INTO HABILIDADES (NM_HABILIDADE, ID_TIPO_HABILIDADE) VALUES ('JAVA', 1),('C#', 1);

INSERT INTO CANDIDATO_HABILIDADE (ID_HABILIDADE, ID_CANDIDATO, QT_PONTOS_HABILIDADE) VALUES (1, 1, 1), (1, 2, 2), (1, 3, 3), (1, 4, 4), (1, 5, 5), (2, 6, 1), (2, 7, 2),(2, 8, 3), (2, 9, 4), (2, 10, 5);

INSERT INTO CERTIFICACOES (NM_CERTIFICACAO, ID_HABILIDADE) VALUES ('OCAJP Java SE 8 Programmer I', 1),('OCPJP Java SE 8 Programmer II', 1),('OCPJP Java SE 11 Programmer II', 1),('Sun Certified Web Component Developer', 1),('OCAJP Java SE 11 Programmer I', 1),('Software Development Fundamentals', 2),('Developing ASP.NET MVC Web Applications', 2),('Z-220', 2),('AZ-900', 2),('98-383', 2);

INSERT INTO CANDIDATO_CERTIFICACAO (ID_CANDIDATO, ID_CERTIFICACAO) VALUES (1, 1),(2, 1), (2, 2),(3, 1), (3, 2), (3, 3),(4, 1), (4, 2), (4, 3), (4, 4),(5, 1), (5, 2), (5, 3), (5, 4), (5, 5),(6, 6),(7, 6), (7, 7),(8, 6), (8, 7), (8, 8),(9, 6), (9, 7), (9, 8), (9, 9),(10, 6), (10, 7), (10, 8), (10, 9), (10, 10);
