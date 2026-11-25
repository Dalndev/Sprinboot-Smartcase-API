-- @description
-- Sentencia DDL para la definición de la tabla de registro de casos (Cases).

CREATE TABLE IF NOT EXISTS
    case(
        "case_id" VARCHAR NOT NULL,
        "case_number" INTEGER NULL,
        "title" VARCHAR NULL,
        "alias" VARCHAR NULL,
        "description" TEXT NULL,
        "status" VARCHAR(10) NULL,
        "created_at" TIMESTAMP NOT NULL,
        "updated_at" TIMESTAMP NULL,
        CONSTRAINT case_pkey PRIMARY KEY ("case_id"),
        CONSTRAINT case_unique_check UNIQUE ("case_id"),
        CONSTRAINT case_status_check CHECK (status IN ('ACTIVE', 'PENDING', 'CLOSED'))
    );