CREATE OR REPLACE VIEW company_institute_view AS
SELECT
    c.id AS company_id,
    c.company_name,
    c.address AS company_address,
    c.city AS company_city,
    i.id AS institute_id,
    i.full_name AS institute_name,
    i.address AS institute_address,
    i.telephone AS institute_telephone
FROM
    company c
INNER JOIN
    institute i
ON
        c.city = i.city;
