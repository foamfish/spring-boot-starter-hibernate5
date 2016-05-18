DROP TABLE IF EXISTS countries;
CREATE TABLE countries (
  id       INT NOT NULL PRIMARY KEY,
  name     VARCHAR(128),
  iso_code VARCHAR(16)
);
