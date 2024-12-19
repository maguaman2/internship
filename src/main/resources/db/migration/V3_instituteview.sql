CREATE VIEW institute_view AS
SELECT i.*,c.full_name
FROM institute i JOIN institute c
                    ON i.isntitute_id = c.id;