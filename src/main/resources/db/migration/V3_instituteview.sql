

CREATE OR REPLACE VIEW institute_engagement_view AS
SELECT
    i.full_name AS institute_name,
    ec.email AS coordinator_email,
    ec.telephone AS coordinator_telephone
FROM
    institute i
        LEFT JOIN engagement_coordinator ec
                  ON i.id = ec.institute_id;