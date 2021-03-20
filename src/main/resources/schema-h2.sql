CREATE TABLE IF NOT EXISTS employee (
  id BIGINT PRIMARY KEY AUTO_INCREMENT(5),
  name VARCHAR(255) NOT NULL
);

MERGE INTO employee KEY (id, name) VALUES (1, 'John');
MERGE INTO employee KEY (id, name) VALUES (2, 'Harry');
MERGE INTO employee KEY (id, name) VALUES (3, 'Charlie');

