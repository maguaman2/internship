
CREATE VIEW activity_view AS
SELECT a.id, a.description, a.hours, s.fullname, s.carrer_id
FROM activity a
         JOIN student s
ON a.estudent_id = s.id;
