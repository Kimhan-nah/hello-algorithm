SELECT animal_type, COUNT(animal_id)
FROM animal_ins
GROUP BY animal_type
ORDER BY animal_type ASC;