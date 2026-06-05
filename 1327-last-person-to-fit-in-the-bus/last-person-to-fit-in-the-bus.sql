-- # Write your MySQL query statement below
-- alright understood the question
-- first we need to sort the data according to turn and then
-- just calculate the weight like sum() <= 1000 and then we need 
-- to return the last person 
-- but my concern is how can i approach this question
-- lets find out
-- i think we need to work with the subqueries with thhis question
-- SELECT
--     q1.person_name,
--     q1.turn,
--     (
--         -- this will calculate row by row
--         SELECT SUM(q2.weight)
--         FROM Queue q2
--         WHERE q2.turn <= q1.turn
--     ) AS total_weight
--     where total_weight <= 1000
-- FROM Queue q1
-- ORDER BY turn DESC
-- LIMIT 1

SELECT q1.person_name
FROM Queue q1
WHERE (
    SELECT SUM(q2.weight)
    FROM Queue q2
    WHERE q2.turn <= q1.turn
) <= 1000
ORDER BY q1.turn DESC
LIMIT 1;