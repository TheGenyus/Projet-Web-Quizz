INSERT INTO quiz (quiz_id, titre_quiz, description_quiz)
VALUES (1, 'Quiz sur la géographie mondiale', 'Testez vos connaissances en géographie avec ce quiz');

INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (1, 1, 'Quel État des États-Unis a pour capitale Montgomery ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (1, 1, 'Californie', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (2, 1, 'Ohio', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (3, 1, 'Nouveau-Mexique', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (4, 1, 'Alabama', TRUE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (2, 1, 'Parmi les États suivants, lequel n''est pas bordé par l''océan Indien ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (5, 2, 'Oman', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (6, 2, 'Le Mozambique', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (7, 2, 'Angola', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (8, 2, 'Le Kenya', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (3, 1, 'Quel pays a pour capitale Gaborone ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (9, 3, 'Le Zimbabwe', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (10, 3, 'Le Lesotho', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (11, 3, 'Le Botwana', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (12, 3, 'La Tanzanie', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (4, 1, 'Dans quelle mer le fleuve Méandre se jette-t-il ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (13, 4, 'La mer Egée', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (14, 4, 'La mer Noire', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (15, 4, 'La mer Adriatique', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (16, 4, 'La mer Caspienne', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (5, 1, 'Quel est le plus grand lac d''Amérique du Nord ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (17, 5, 'Le lac Supérieur', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (18, 5, 'Le lac Huron', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (19, 5, 'Le lac Majeur', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (20, 5, 'Le lac Ontario', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (6, 1, 'Qu''est-ce qu''un isthme ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (21, 6, 'Une étendue terrestre entourée de mers sauf sur une partie', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (22, 6, 'Un point de terre qui s''avance profondément dans la mer', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (23, 6, 'Une bande de terre étroite entre deux mers qui relie deux terres', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (24, 6, 'Un espace de mer étroit entre deux terres', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (7, 1, 'Dans quel pays peut-on trouver la ville de Tcheliabinsk ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (25, 7, 'En Chine', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (26, 7, 'En Ukraine', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (27, 7, 'En Russie', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (28, 7, 'En Ouzbékistan', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (8, 1, 'Quel est le nom de la région saoudienne qui borde la mer Rouge ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (29, 8, 'Le Badiyat al-Sham', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (30, 8, 'Le Qawasim', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (31, 8, 'Le Najd', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (32, 8, 'Le Hedjaz', TRUE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (9, 1, 'Combien d''états fédérés l''Inde compte-t-elle ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (33, 9, '27', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (34, 9, '28', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (35, 9, '29', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (36, 9, '30', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (10, 1, 'Que fait la France en Terre-Adélie ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (37, 10, 'Elle y mène des études scientifiques', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (38, 10, 'Elle n''y a installé qu''un observatoire en raison des conditions exceptionnellement favorables', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (39, 10, 'Rien : ces terres sont inexploitables', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (40, 10, 'Elle y a installé des bases scientifiques et y exploite des hydrocarbures', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (11, 1, 'Qu''est-ce que l''effet de serre ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (41, 11, 'L''effet de serre menace la vie sur terre : il est provoqué par l''activité humaine qui produit des gaz qui détruisent l''enveloppe terrestre qui régule la chaleur du soleil', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (42, 11, 'L''effet de serre rend la vie possible sur terre : il désigne, en gros, le fait que des gaz absorbent de l''énergie du soleil', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (43, 11, 'Des gaz issus de l’activité empêchent les végétaux de transpirer et rafraîchir l''atmosphère humaine', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (44, 11, 'Cet effet, provoqué par l''activité humaine, diminue le filtrage des ultraviolets', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (12, 1, 'Dans quelle ville peut-on déambuler sur la place Nagsh-e Jahan ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (45, 12, 'Istanbul', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (46, 12, 'Samarcande', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (47, 12, 'Amman', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (48, 12, 'Isfahan', TRUE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (13, 1, 'En géopolitique, qu''est-ce qu''une zone grise ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (49, 13, 'Une région qui bénéficie d''une politique économique spéciale', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (50, 13, 'Une zone qui échappe au contrôle des États', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (51, 13, 'Une zone maritime dont la souveraineté n''est pas déterminée', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (52, 13, 'Une zone où un État organise des activités clandestines', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (14, 1, 'Sur quel fleuve a-t-on bâti le barrage des Trois-Gorges ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (53, 14, 'Sur la Volga', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (54, 14, 'Sur le Yangzi Jian', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (55, 14, 'Sur le Danube', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (56, 14, 'Sur le Huáng hé', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (15, 1, 'Parmi les pays suivants, lequel compte des locuteurs du peul ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (57, 15, 'Le Nigéria', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (58, 15, 'L''Ouganda', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (59, 15, 'La Somalie', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (60, 15, 'Le Malawi', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (16, 1, 'Quelle région normande relativement isolée compte de nombreuses maisons secondaires parisiennes ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (61, 16, 'L''Aunis', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (62, 16, 'Le Luberon', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (63, 16, 'Le Livradois', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (64, 16, 'Le Perche', TRUE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (17, 1, 'Quelles sont les langues officielles de l''Afghanistan ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (65, 17, 'Hindi et persan', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (66, 17, 'Farsi et pashtou', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (67, 17, 'Arabe et turc', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (68, 17, 'Afghan et anglais', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (18, 1, 'Dans quel pays ne trouve-t-on pas une importante minorité kurde ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (69, 18, 'La Syrie', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (70, 18, 'L''Iran', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (71, 18, 'La Jordanie', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (72, 18, 'La Turquie', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (19, 1, 'Qu''est-ce qu''une conurbation ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (73, 19, 'Un ensemble de villes dont le bâti s’est étendu pour se mêler et former une unité', TRUE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (74, 19, 'L''ensemble des relations bilatérales entre des villes de pays étrangers', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (75, 19, 'L''ensemble des espaces bâtis placés en marge des agglomérations mais sans continuité avec elles, et qui abritent des individus qui travaillent dans ces agglomérations', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (76, 19, 'Une ville dont le centre a éclaté en de nombreux pôles d''attraction divers', FALSE);


INSERT INTO Question (question_id, quiz_id, texte_question)
VALUES (20, 1, 'Parmi les pays suivants, lequel est celui qui est le moins densément peuplé du monde ?');

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (77, 20, 'L''Australie', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (78, 20, 'Le Belarus', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (79, 20, 'Le Brésil', FALSE);

INSERT INTO Reponse (reponse_id, question_id, texte_reponse, est_correcte)
VALUES (80, 20, 'La Mongolie', TRUE);