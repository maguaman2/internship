CREATE OR REPLACE VIEW V3_career_view AS
SELECT
    c.id AS career_id,
    c.full_name AS career_name,
    coord.id AS coordinator_id,
    coord.full_name AS coordinator_name,
    coord.email AS coordinator_email
FROM
    career c
        LEFT JOIN
    coordinator coord
    ON
        c.coordinator_id = coord.id;
