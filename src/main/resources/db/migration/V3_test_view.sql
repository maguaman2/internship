CREATE VIEW test_view AS
    SELECT t.*, a.full_name
FROM test t JOIN academic_tutor a
ON t.academic_tutor_id = a.id;