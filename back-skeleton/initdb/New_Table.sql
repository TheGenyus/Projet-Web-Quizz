create table users
(
    userId SERIAL PRIMARY KEY,
    userName TEXT not null UNIQUE
);
