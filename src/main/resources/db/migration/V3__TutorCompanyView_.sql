CREATE VIEW company_tutor_view AS
SELECT
    c.id AS company_id,
    c.name AS company_name,
    tc.id AS tutor_company_id,
    tc.full_name AS tutor_company
FROM
    company c
JOIN
    tutor_company tc ON tc.company_id = c.id;











































