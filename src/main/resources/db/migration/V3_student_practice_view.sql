CREATE OR REPLACE VIEW student_practice_view AS
SELECT
    s.id AS student_id,
    s.full_name AS student_name,
    p.id AS practice_id,
    p.assign_date,
    p.start_date,
    p.end_date,
    p.observations
FROM
    student s
        JOIN
    practice p
    ON
        s.id = p.student_id;
