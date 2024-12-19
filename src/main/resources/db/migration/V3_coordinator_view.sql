
-- Vista 'coordinator_career_view'
CREATE OR REPLACE VIEW coordinator_career_view AS
SELECT
    c.id AS coordinator_id,
    c.full_name AS coordinator_name,
    c.nui AS coordinator_nui,
    c.telephone AS coordinator_telephone,
    c.email AS coordinator_email,
    cr.id AS career_id,
    cr.full_name AS career_name
FROM coordinator c
         LEFT JOIN career cr ON cr.coordinator_id = c.id;
