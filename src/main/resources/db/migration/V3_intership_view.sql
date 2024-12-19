
CREATE VIEW parameters_view AS
SELECT p.value AS parameter_value, c.name AS career_name
FROM parameters p
JOIN career c ON p.career_id = c.id;
