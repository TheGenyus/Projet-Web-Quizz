INSERT INTO quiz (quiz_id, titre_quiz, description_quiz)
VALUES (1, 'Quiz sur la géographie mondiale', 'Testez vos connaissances en géographie avec ce quiz sur les pays et les capitales.');


INSERT INTO Question (question_id, quiz_id, texte_question, type_question)
VALUES (1, 1, 'Quelle est la capitale de la France ?', 'Choix multiple');


-- Réponse correcte
INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (1, 1, 'Paris', TRUE);

-- Réponses incorrecte
INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (2, 1, 'Londres', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (3, 1, 'Berlin', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (4, 1, 'Madrid', FALSE);
