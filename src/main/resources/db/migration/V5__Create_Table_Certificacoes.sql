CREATE TABLE IF NOT EXISTS certificacoes (
    ID_CERTIFICACAO INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NM_CERTIFICACAO VARCHAR(50) NOT NULL,
    ID_HABILIDADE INT NOT NULL,
    CONSTRAINT fk_certificacoes_habilidades_1 FOREIGN KEY (ID_HABILIDADE) REFERENCES habilidades (ID_HABILIDADE)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);