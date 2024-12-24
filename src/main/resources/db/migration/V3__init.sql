
CREATE VIEW academic_tutor_view AS
SELECT
    t.tutor_id,
    t.tutor_full_name,
    t.tutor_phone,
    t.tutor_email,
    t.career_id,
    c.career_name
FROM
    academic_tutor AS t
        JOIN
    career AS c ON t.career_id = c.career_id;
