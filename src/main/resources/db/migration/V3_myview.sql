CREATE VIEW engagement_institute_view AS
SELECT
    e.full_name
    e.email
    i.full_name
FROM
    engagement_coordinator e
        JOIN
    institute i ON e.institute_id = i.id;
