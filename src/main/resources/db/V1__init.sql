--ALUMNO: Fausto Saquinaula
--Usuario GitHub: Mesias02
--Tabla: institute

CREATE TABLE IF NOT EXISTS institute
(
    Id        SERIAL,
    full_name VARCHAR(255) NOT NULL,
    address   VARCHAR(255),
    telephone VARCHAR(20),
    city      VARCHAR(100),
    PRIMARY KEY (id)
);

--ALUMNO: Mateo
CREATE TABLE IF NOT EXISTS career
(
    Id        SERIAL,
    full_name VARCHAR(255) NOT NULL,
    address   VARCHAR(255),
    telephone VARCHAR(20),
    city      VARCHAR(100),
    PRIMARY KEY (id)
);

---Alejandra Medranda
---GitHub AlejandraMedranda0906
CREATE TABLE IF NOT EXISTS company
(
    id        SERIAL,
    name      VARCHAR(255) NOT NULL,
    address   TEXT         NOT NULL,
    lat       DECIMAL(10, 8),
    lon       DECIMAL(11, 8),
    telephone VARCHAR(10),
    city      VARCHAR(20),
    province  VARCHAR(20),
    ceo_name  VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS activity
(
    id           SERIAL,
    description  VARCHAR(200) NOT NULL,
    date         TIMESTAMP    NOT NULL,
    hours        INTEGER      NOT NULL,
    resourses    VARCHAR(200),
    observations VARCHAR(500),
    student_id   INTEGER      NOT NULL,
    practice_id  INTEGER      NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (practice_id) REFERENCES practice (id)
);

-- Victoria Quinde: Victoria-94
-- NOMBRE DE TABLA: tutor_empresa
CREATE TABLE company_tutor (
    id SERIAL,
    full_name VARCHAR(255) NOT NULL,
    roll VARCHAR(100),
    activity VARCHAR(500),
    observation VARCHAR(600),
    company_id INT,
FOREIGN KEY (company_id) REFERENCES company(id)
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
    FOREIGN KEY (student_id) REFERENCES students (id),
    FOREIGN KEY (academic_tutor_id) REFERENCES academic_tutors (id),
    FOREIGN KEY (company_tutor_id) REFERENCES company_tutors (id)
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

--Github: jdlllanghi
-- Tabla Student
CREATE TABLE Student
(
    id          INT PRIMARY KEY,
    full_name   VARCHAR(255),
    nui         VARCHAR(100),
    telephone   VARCHAR(100),
    email       VARCHAR(255),
    career_id   INT,
    cycle       VARCHAR(100),
    section     VARCHAR(100),
    address     VARCHAR(255),
    photo_url   VARCHAR(255),
    FOREIGN KEY (career_id) REFERENCES career (id)
);
--Johanna Banegas /jmbanegas
--Tabla Category
CREATE TABLE Category
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

CREATE TABLE IF NOT EXISTS permition (
    id SERIAL,
    date TIMESTAMP NOT NULL,
    student_id INT NOT NULL,
    company_id INT NOT NULL,
    city VARCHAR (100),
    date_ini TIMESTAMP,
    date_end TIMESTAMP,
    description TEXT,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES student(id),
    FOREIGN KEY (company_id) REFERENCES company(id)
);

--Jonnathan Cadme
--Usuario GitHub: Jonna007
--Tabla: career coordinator
CREATE TABLE IF NOT EXISTS career_coordinator
(
    id        SERIAL PRIMARY KEY,
    full_name VARCHAR(100)        NOT NULL,
    nui       CHAR(10) UNIQUE     NOT NULL,
    telephone VARCHAR(15),
    email     VARCHAR(150) UNIQUE NOT NULL,
    career_id INT                 NOT NULL,
    FOREIGN KEY (career_id) REFERENCES career (id)
);

--Edison Mendez /edmendezvilla
--Tabla: parameters
CREATE TABLE IF NOT EXISTS parameters
(
    Id          SERIAL PRIMARY KEY,
    description VARCHAR(250),
    category    VARCHAR(250),
    value       DECIMAL(9.2),
    career_id   INT,
    FOREIGN KEY (career_id) REFERENCES career (Id)
);