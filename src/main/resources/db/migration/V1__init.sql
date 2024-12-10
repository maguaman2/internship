--ALUMNO: Fausto Saquinaula
--Usuario GitHub: Mesias02
--Tabla: institute

CREATE TABLE IF NOT EXISTS institute
(
    id        SERIAL,
    full_name VARCHAR(255) NOT NULL,
    address   VARCHAR(255),
    telephone VARCHAR(20),
    city      VARCHAR(100),
    PRIMARY KEY (id)
);

--Jonnathan Cadme
--Usuario GitHub: Jonna007
--Tabla: career coordinator
CREATE TABLE IF NOT EXISTS :wq

(
    id        SERIAL PRIMARY KEY,
    full_name VARCHAR(100)        NOT NULL,
    nui       CHAR(10) UNIQUE     NOT NULL,
    telephone VARCHAR(15),
    email     VARCHAR(150) UNIQUE NOT NULL
);

--ALUMNO: Mateo
--Mateo Campo
--Usuario GitHub: mateocampo1004
--Tabla: career
CREATE TABLE IF NOT EXISTS career
(
    id             SERIAL PRIMARY KEY,
    full_name      VARCHAR(255) NOT NULL,
    coordinator_id INT,
    FOREIGN KEY (coordinator_id) REFERENCES coordinator(id)
);


---Alejandra Medranda
---GitHub AlejandraMedranda0906
CREATE TABLE IF NOT EXISTS company
(
    id           SERIAL,
    company_name VARCHAR(255) NOT NULL,
    address      TEXT         NOT NULL,
    lat          DECIMAL(10, 8),
    lon          DECIMAL(11, 8),
    telephone    VARCHAR(10),
    city         VARCHAR(50),
    province     VARCHAR(50),
    ceo_name     VARCHAR(100),
    PRIMARY KEY (id)
);
--EdissonF
CREATE TABLE IF NOT EXISTS academic_tutor
(
    id        SERIAL PRIMARY KEY,
    full_name VARCHAR(255)        NOT NULL,
    phone     VARCHAR(15),
    email     VARCHAR(255) UNIQUE NOT NULL,
    career_id INT,
    FOREIGN KEY (career_id) REFERENCES career (id)
);
--Github: jdlllanghi
-- Tabla Student
CREATE TABLE IF NOT EXISTS student
(
    id        INT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    nui       VARCHAR(100) NOT NULL,
    telephone VARCHAR(100),
    email     VARCHAR(255) NOT NULL,
    cycle     VARCHAR(100),
    section   VARCHAR(100),
    address   VARCHAR(255),
    photo_url VARCHAR(255) NOT NULL,
    career_id INT,
    FOREIGN KEY (career_id) REFERENCES career (id)
);
--Rubén Villa
--Usuario (01villa)
--Table: PRACTICE
CREATE TABLE IF NOT EXISTS practice
(
    id                SERIAL PRIMARY KEY,
    assign_date       TIMESTAMP,
    start_date        TIMESTAMP,
    end_date          TIMESTAMP,
    observations      VARCHAR(500) NOT NULL,
    company_id        INT,
    student_id        INT,
    academic_tutor_id INT,

    FOREIGN KEY (company_id) REFERENCES company (id),
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (academic_tutor_id) REFERENCES academic_tutor (Id)
);
-- Victoria Quinde: Victoria-94
-- NOMBRE DE TABLA: tutor_empresa
CREATE TABLE  IF NOT EXISTS company_tutor
(
    id          SERIAL,
    full_name   VARCHAR(255) NOT NULL,
    roll        VARCHAR(100),
    activity    VARCHAR(500),
    observation VARCHAR(600),
    company_id  INT,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
);
--Diego
CREATE TABLE IF NOT EXISTS activity
(
    id               SERIAL,
    description      VARCHAR(200) NOT NULL,
    created_at       TIMESTAMP    NOT NULL,
    hours            INTEGER      NOT NULL,
    resources        VARCHAR(200),
    observations     VARCHAR(500),
    student_id       INTEGER      NOT NULL,
    company_tutor_id INTEGER      NOT NULL,
    practice_id      INTEGER      NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (practice_id) REFERENCES practice (id),
    FOREIGN KEY (company_tutor_id) REFERENCES company_tutor (id)
);



--Alexis Narea
--Github Alexnarea
--Tabla test
CREATE TABLE IF NOT EXISTS test
(
    id                SERIAL PRIMARY KEY,
    description       TEXT NOT NULL,
    grade             DECIMAL(9, 2),
    student_id        INT,
    academic_tutor_id INT,
    company_tutor_id  INT,
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (academic_tutor_id) REFERENCES academic_tutor (id),
    FOREIGN KEY (company_tutor_id) REFERENCES company_tutor (id)
);

-- Alumno: JosÃ© Vera
-- Usuario GitHub: javera91
-- Nombre de la tabla: engagement_coordinator
CREATE TABLE IF NOT EXISTS engagement_coordinator
(
    id           SERIAL,
    full_name    VARCHAR(100) NOT NULL,
    email        VARCHAR(100) NOT NULL,
    telephone    VARCHAR(20),
    institute_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (institute_id) REFERENCES institute (id)
);


--Johanna Banegas /jmbanegas
--Tabla Category
CREATE TABLE IF NOT EXISTS category
(
    id          INT PRIMARY KEY,
    description VARCHAR(255),
    signature   VARCHAR(255),
    career_id   INT,
    FOREIGN KEY (career_id) REFERENCES Career (id)
);


-- Alumno: Leonardo Lituma
-- Tabla: Permition
-- Usuario Github: leon1611

CREATE TABLE IF NOT EXISTS permission
(
    id          SERIAL,
    date        TIMESTAMP NOT NULL,
    student_id  INT       NOT NULL,
    company_id  INT       NOT NULL,
    city        VARCHAR(100),
    date_ini    TIMESTAMP,
    date_end    TIMESTAMP,
    description TEXT,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
);

--Edison Mendez /edmendezvilla
--Tabla: parameters
CREATE TABLE IF NOT EXISTS parameters (
    id            SERIAL PRIMARY KEY,
    description   VARCHAR(250),
    category      VARCHAR(250),
    value         DECIMAL(9,2),
    permission_id INT,
    FOREIGN KEY (permission_id) REFERENCES permission (id)
);