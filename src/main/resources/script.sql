CREATE DATABASE currency_quote_api_shx
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE TABLE public.currency_quote
(
    id SERIAL PRIMARY KEY,
    code VARCHAR(5),
    codein VARCHAR(5),
    name VARCHAR(60),
    high VARCHAR(7),
    low VARCHAR(7),
    create_date timestamp without time zone
)

-- O id usa uma sequence para ser gerada!