CREATE TABLE IF NOT EXISTS registration_users (
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(255) NULL,
  mobile VARCHAR(255) NULL,
  email VARCHAR(255) NULL,
  CONSTRAINT pk_registration_users PRIMARY KEY (id)
);