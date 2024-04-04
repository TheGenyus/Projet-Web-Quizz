CREATE TABLE Quiz (
                      quiz_id INT PRIMARY KEY,
                      titre_quiz VARCHAR(255),
                      description_quiz TEXT
    -- autres attributs
);

CREATE TABLE Question (
                          question_id INT PRIMARY KEY,
                          quiz_id INT,
                          texte_question TEXT,
                          type_question VARCHAR(50),
                          FOREIGN KEY (quiz_id) REFERENCES Quiz(quiz_id)
    -- autres attributs
);

CREATE TABLE Reponse (
                         reponse_id INT PRIMARY KEY,
                         question_id INT,
                         texte_reponse TEXT,
                         est_correcte BOOLEAN,
                         FOREIGN KEY (question_id) REFERENCES Question(question_id)
    -- autres attributs
);
