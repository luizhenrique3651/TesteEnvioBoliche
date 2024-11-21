CREATE TABLE IF NOT EXISTS sedex_boliche.teste_envio (
    cod_envio SERIAL PRIMARY KEY,
    diametro_bola INTEGER NOT NULL,
    largura_caixa INTEGER NOT NULL,
    altura_caixa INTEGER NOT NULL,
    profundidade_caixa INTEGER NOT NULL,
    status_envio VARCHAR(50) NOT NULL
);