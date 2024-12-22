CREATE OR REPLACE VIEW category_student_view AS
SELECT
    c.id AS category_id,
    c.description AS category_description,
    s.id AS student_id,
    s.full_name AS student_name
FROM
    category c
        JOIN
    student s
    ON
        c.career_id = s.career_id;
