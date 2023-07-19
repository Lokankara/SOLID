-- DROP TABLE IF EXISTS "user" CASCADE;

CREATE TABLE IF NOT EXISTS "users"
(
    "userId"    BIGINT PRIMARY KEY,
    "name"      TEXT NOT NULL,
    "email"     TEXT NOT NULL,
    "avatar_id" BIGINT
--     FOREIGN KEY ("avatar_id") REFERENCES "picture" ("id")
);
