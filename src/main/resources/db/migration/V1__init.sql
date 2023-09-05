CREATE SEQUENCE IF NOT EXISTS teams_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS users_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS work_times_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS workers_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE teams
(
    id      BIGINT       NOT NULL,
    user_id BIGINT       NOT NULL,
    name    VARCHAR(255) NOT NULL,
    CONSTRAINT pk_teams PRIMARY KEY (id)
);

CREATE TABLE users
(
    id         BIGINT       NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NOT NULL,
    email      VARCHAR(255) NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE work_times
(
    id        BIGINT                      NOT NULL,
    worker_id BIGINT                      NOT NULL,
    start     TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    finish    TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    bonus     INTERVAL,
    time      INTERVAL                      NOT NULL,
    CONSTRAINT pk_work_times PRIMARY KEY (id)
);

CREATE TABLE workers
(
    id         BIGINT       NOT NULL,
    team_id    BIGINT,
    rate       INTEGER      NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NOT NULL,
    CONSTRAINT pk_workers PRIMARY KEY (id)
);

ALTER TABLE teams
    ADD CONSTRAINT uc_teams_name UNIQUE (name);

ALTER TABLE teams
    ADD CONSTRAINT uc_teams_user UNIQUE (user_id);

ALTER TABLE users
    ADD CONSTRAINT uc_users_email UNIQUE (email);

ALTER TABLE teams
    ADD CONSTRAINT FK_TEAMS_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

ALTER TABLE workers
    ADD CONSTRAINT FK_WORKERS_ON_TEAM FOREIGN KEY (team_id) REFERENCES teams (id);

ALTER TABLE work_times
    ADD CONSTRAINT FK_WORK_TIMES_ON_WORKER FOREIGN KEY (worker_id) REFERENCES workers (id);
