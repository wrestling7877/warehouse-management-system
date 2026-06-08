INSERT INTO users (
    first_name,
    last_name,
    email,
    password,
    role_id,
    enabled
)
VALUES (
           'System',
           'Admin',
           'admin@wms.com',
           '$2a$10$nigUgoOs1Q8ikceYORaxzuFsbj2CyPlTeKYwzOUTHOljHYW71MlAa',
           1,
           true
       );