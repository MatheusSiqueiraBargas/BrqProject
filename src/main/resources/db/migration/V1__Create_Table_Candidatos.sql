CREATE TABLE IF NOT EXISTS candidatos (
    ID_CANDIDATO INT NOT NULL AUTO_INCREMENT,
    NM_CANDIDATO VARCHAR(255) NOT NULL,
    NR_CPF VARCHAR(18) NOT NULL,
    DS_EMAIL VARCHAR(100) NOT NULL,
    NR_CELULAR BIGINT(11) NOT NULL,
    CD_SEXO ENUM('M', 'F', 'O') NOT NULL,
    DT_NASCIMENTO DATE NOT NULL,
    PRIMARY KEY (ID_CANDIDATO, NR_CPF),
    UNIQUE KEY `DS_EMAIL`(DS_EMAIL)
);