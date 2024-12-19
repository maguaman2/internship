CREATE VIEW permission_view AS
SELECT
    p.id AS permission_id,
    p.date AS permission_date,
    s.full_name AS student_fullname,
    s.nui AS student_nui
FROM
    permission p
        JOIN
    student s ON p.student_id = s.id;
